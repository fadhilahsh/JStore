package jstore;
/**
 * Kelas database item ini berfungsi untuk menambahkan dan menghapus item pada list
 * kemudian dapat mengembalikan nilainya serta menampilkan listnya.
 *
 * @author Fadhilah
 * @version 18 April 2019
 */

import java.util.ArrayList;
import java.util.*;

public class DatabaseItem
{
    // instance variables - replace the example below with your own
    private final static ArrayList<Item> ITEM_DATABASE=new ArrayList<>();
    private static int LAST_ITEM_ID=0;

    /**
     *
     * @return    ITEM_DATABASE
     */
    public static ArrayList<Item> getItemDatabase()
    {
        return ITEM_DATABASE;
    }
    /**
     *
     * @return    Last_Item_Id
     */
    public static int getLastItemID()
    {
        return LAST_ITEM_ID;
    }

    public static boolean addItem(Item item) throws ItemAlreadyExistsException
    {
        // put your code here
        boolean success = true;
        for(Item object : ITEM_DATABASE)
        {
            if(object.getName().equals(item.getName()) && object.getStatus().equals(item.getStatus()) && object.getSupplier().equals(item.getSupplier()) && object.getCategory().equals(item.getCategory()))
            {
                throw new ItemAlreadyExistsException(object);
            }
            else
            {
                success = true;
            }
        }
        if (success)
        {
            ITEM_DATABASE.add(item);
            LAST_ITEM_ID = item.getId();
        }
        return success;
    }

    public static Item getItemFromID(int id)
    {
        Item value = null;
        for(Item object : ITEM_DATABASE)
        {
            if(object.getId() == id)
            {
                value = object;
                break;
            }
        }
        return value;
    }

    public static ArrayList<Item> getItemFromSupplier(Supplier supplier)
    {
        ArrayList<Item> value = new ArrayList<>();
        for(Item object : ITEM_DATABASE)
        {
            if(object.getSupplier() == supplier)
            {
                value.add(object);
                break;
            }
        }
        return value;
    }

    public static ArrayList<Item> getItemFromCategory(ItemCategory category)
    {
        ArrayList<Item> value = new ArrayList<>();
        for(Item object : ITEM_DATABASE)
        {
            if(object.getCategory() == category)
            {
                value.add(object);
                break;
            }
        }
        return value;
    }

    public static ArrayList<Item> getItemFromStatus(ItemStatus status)
    {
        ArrayList<Item> value = new ArrayList<>();
        for(Item object : ITEM_DATABASE)
        {
            if(object.getStatus() == status)
            {
                value.add(object);
                break;
            }
        }
        return value;
    }

    /**
     * Method untuk menghapus data item
     *
     * @return    true
     */
    public static boolean removeItem(int id) throws ItemNotFoundException
    {
        Item value = null;
        int index;
        boolean success = false;
        for(Item object : ITEM_DATABASE)
        {
            if(object.getId() == id)
            {
                value = object;
                index = ITEM_DATABASE.indexOf(value);
                ITEM_DATABASE.remove(index);
                success = true;
                break;
            }
        }
        throw new ItemNotFoundException(id);
    }
}
