 /**
 * Class Database berfungsi sebagai informasi database dari item
 *
 * @author Fadhilah S Shalihah
 * @version 28/02/2019
 */
public class DatabaseItem
{
    //variagel yang digunakan 
    private String[] listItem;
    private Item item;
    public static Item itemDB;
    
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
        item = item;
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
        return false;
    }
    /**
     * Bagian menampilkan item
     *
     * @method  getItem()
     * @param   item
     * @return false
     */
    public static Item getItem()
    {
        return itemDB;
    }
    /**
     * Bagian menampilkan list item
     *
     * @method  getItemDatabase()
     * @return listItem
     */
     public String[] getItemDatabase()
    {
        return listItem;
    }
    
}
