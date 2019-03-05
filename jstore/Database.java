 /**
 * Class Database berfungsi sebagai informasi database dari item
 *
 * @author Fadhilah S Shalihah
 * @version 28/02/2019
 */
public class Database
{
    //variagel yang digunakan 
    private String[] listItem;
    public static item item;
    /**
     * Bagian menambah item
     *
     * @method  addItem()
     * @param   item
     * @return false
     */
     public static boolean addItem(item item)
    {
        return false;
    }
    /**
     * Bagian menghapus item
     *
     * @method  removeItem()
     * @param   item
     * @return false
     */
     public static boolean removeItem(item item)
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
    public item getItem()
    {
        return item;
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
