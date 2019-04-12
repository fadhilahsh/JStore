 /**
 * Class Database berfungsi sebagai informasi database dari item
 *
 * @author Fadhilah S Shalihah
 * @version 28/02/2019
 * @Since 2019
 */
import java.util.ArrayList;
public class DatabaseItem
{
    //variabel yang digunakan 
    //private Item[] listItem;
    //public static Item itemDB;
    private static ArrayList<Item> ITEM_DATABASE = new ArrayList<Item>();
    private static int LAST_ITEM_ID = 0;
    
    public DatabaseItem()
    {}
    /**
     * Bagian menambah item
     *
     * @method  addItem()
     * @param   item
     * @return false
     */
    public static ArrayList<Item> getItemDatabase()
    {
        return ITEM_DATABASE;
    }
    public static int getLastItemID()
    {
        return LAST_ITEM_ID;
    }
    public static boolean addItem(Item item)
    {
        boolean value=false;
        for(Item itemDB : ITEM_DATABASE)
        {
            if(item.getName()!=itemDB.getName()&&item.getStatus()!=itemDB.getStatus()&&item.getsupplier()!=itemDB.getsupplier())
            {
            ITEM_DATABASE.add(item);
            LAST_ITEM_ID=item.getId();
            value=true;
            }
        }
        return value;
    }
    public static Item getItemFromID(int id)
    {
        Item value=null;
        for(Item itemDB : ITEM_DATABASE)
        {
            if(itemDB.getId()==id)
            {
                value=itemDB;
            }
        }
        return value;
    }
    public static ArrayList<Item> getItemFromSupplier(Supplier supplier)
    {
        ArrayList<Item>value = null;
        for (Item itemDB : ITEM_DATABASE)
        {
            if(itemDB.getsupplier()==supplier)
            {
                value.add(itemDB);
            
            }
        
        }
        return value;
        //itemDB = item;
    }
    public static ArrayList<Item> getItemFromCategory(Item category)
    {
        ArrayList<Item> value = null;
        for(Item itemDB : ITEM_DATABASE)
        {
            if(itemDB.getCategory()==category.getCategory())
            {
                value.add(itemDB);
            }
        }
        return value;
    }
    public static ArrayList<Item> getItemFromStatus(Item status)
    {
        ArrayList<Item> value = null;
        for (Item itemDB : ITEM_DATABASE)
        {
            if(itemDB.getStatus()==status.getStatus())
            {
                value.add(itemDB);
            }
        }
        return value;
    }
    
    /**
     * Bagian menghapus item
     *
     * @method  removeItem()
     * @param   item
     * @return false
     */
     public static boolean removeItem(int id)
    {
        boolean value = false;
        for(Item itemDB : ITEM_DATABASE)
        {
            if(itemDB.getId()==id)
            {
                ITEM_DATABASE.remove(id);
                value=true;
            }
        }
        //itemDB = null;
        return value;
    }
}    /**
     * Bagian menampilkan item
     *
     * @method  getItem()
     * @param   item
     * @return false
     *//*
    public static void getItem()
    {
        return ;
    }
    /**
     * Bagian menampilkan list item
     *
     * @method  getItemDatabase()
     * @return listItem
     *
     public Item[] getItemDatabase()
    {
        return listItem;
    }*/
    
