 /**
 * Class Database berfungsi sebagai informasi database dari item
 *
 * @author Fadhilah S Shalihah
 * @version 28/02/2019
 * @Since 2019
 */
public class DatabaseItem
{
    //variagel yang digunakan 
    private Item[] listItem;
    //public static Item itemDB;
    
    public DatabaseItem()
    {}
    /**
     * Bagian menambah item
     *
     * @method  addItem()
     * @param   item
     * @return false
     */
     public static boolean addItem(Item item)
    {
        //itemDB = item;
        return true;
    }
    /**
     * Bagian menghapus item
     *
     * @method  removeItem()
     * @param   item
     * @return false
     */
     public static boolean removeItem(Item ItemDB)
    {
        //itemDB = null;
        return false;
    }
    /**
     * Bagian menampilkan item
     *
     * @method  getItem()
     * @param   item
     * @return false
     */
    public static void getItem()
    {
        return ;
    }
    /**
     * Bagian menampilkan list item
     *
     * @method  getItemDatabase()
     * @return listItem
     */
     public Item[] getItemDatabase()
    {
        return listItem;
    }
    
}
