/**
 * Class Databasesupplier berfungsi sebagai informasi database supplier 
 *
 * @author Fadhilah S Shalihah
 * @version 28/02/2019
 */
public class DatabaseSupplier
{
    //variabel yang digunakan
    private String[] listSupplier;
    private Supplier supplier;

    /**
     * Menambah supplier
     * @method addSupplier()
     * @param  supplier
     * @return false
     */
    public static boolean addSupplier(Supplier supplier)
    {
        return false;
    }
    /**
     * Menambah supplier
     * @method removeSupplier()
     * @param  supplier
     */
    public static void removeSupplier(Supplier supplier)
    {
        
    }
    /**
     * Menampilkan nama supplier
     * @method getSupplier()
     * @return supplier
     */
    public Supplier getSupplier()
    {
      return supplier;  
    }
    /**
     * Menampilkan list supplier
     * @method getListSupplier()
     * @return listSupplier
     */
    public String[] getListSupplier()
    {
       return listSupplier;
    }
}
