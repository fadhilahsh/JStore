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
    private static ArrayList<Item> ITEM_DATABASE = new ArrayList<Item>();
    private static int LAST_ITEM_ID = 0;

    /**
     * Constructor for objects of class DatabaseItem
     */
    public DatabaseItem()
    {
        // initialise instance variables
    }

    /**
     * Method untuk mengembalikan supplier
     *
     * @return    objek supplier
     */
    public static ArrayList<Item> getItemDatabase()
    {
        return ITEM_DATABASE;
    }
    
    /**
     * Method untuk mengembalikan list supplier
     *
     * @return    list supplier
     */
    public static int getLastItemID()
    {
        return LAST_ITEM_ID;
    }
    
    /**
     * Method untuk menambahkan item kedalam list
     *
     * @return    false
     */
    public static boolean addItem(Item item)throws ItemAlreadyExistsException
    {
        for(Item temp : ITEM_DATABASE)
        {
            if(temp.getName() == item.getName() &&
                    temp.getStatus() == item.getStatus()
                    && temp.getSupplier() == item.getSupplier() &&
                    temp.getCategory() == item.getCategory())
            {
                throw new ItemAlreadyExistsException(item);
            }
        }
        ITEM_DATABASE.add(item);
        LAST_ITEM_ID = item.getId();
        return true;
    }
    
    /**
     * Method untuk mengembalikan list supplier
     *
     * @return    list supplier
     */
    public static Item getItemFromID(int id)
    {
        for(Item temp : ITEM_DATABASE) 
        {
            if(temp.getId() == id) 
            {
                return temp;
            }
        }
        return null;
    }
    
    /**
     * Method untuk mengembalikan list supplier
     *
     * @return    list supplier
     */
    public static ArrayList<Item> getItemFromSupplier(Supplier supplier)
    {
        ArrayList<Item> list = new ArrayList<Item>();
        boolean value = false;
        for(Item temp : ITEM_DATABASE) 
        {
            if(temp.getSupplier() == supplier) 
            {
                list.add(temp);
                value = true;
            }
        }
        if(value)
        {
            return list;
        }
        else
        {
            return null;
        }
    }
    
    /**
     * Method untuk mengembalikan list supplier
     *
     * @return    list supplier
     */
    public static ArrayList<Item> getItemFromCategory(ItemCategory category)
    {
        ArrayList<Item> list = new ArrayList<Item>();
        boolean value = false;
        for(Item temp : ITEM_DATABASE) 
        {
            if(temp.getCategory() == category) 
            {
                list.add(temp);
                value = true;
            }
        }
        if(value)
        {
            return list;
        }
        else
        {
            return null;
        }
    }
    
    /**
     * Method untuk mengembalikan list supplier
     *
     * @return    list supplier
     */
    public static ArrayList<Item> getItemFromStatus(ItemStatus status)
    {
        ArrayList<Item> list = new ArrayList<Item>();
        boolean value = false;
        for(Item temp : ITEM_DATABASE) 
        {
            if(temp.getStatus() == status) 
            {
                list.add(temp);
                value = true;
            }
        }
        if(value)
        {
            return list;
        }
        else
        {
            return null;
        }
    }
    
    /**
     * Method untuk menghapus item dari list
     *
     * @return    false
     */
    public static boolean removeItem(int id)throws ItemNotFoundException
    {
        for(Item temp : ITEM_DATABASE) 
        {
            if(temp.getId() == id) 
            {
                ITEM_DATABASE.remove(temp);
                return true;
            }
        }
        throw new ItemNotFoundException(id);
    }
}