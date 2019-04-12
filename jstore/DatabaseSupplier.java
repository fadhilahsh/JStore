/**
 * Class Databasesupplier berfungsi sebagai informasi database supplier 
 *
 * @author Fadhilah S Shalihah
 * @version 28/02/2019
 */
import java.util.ArrayList;
public class DatabaseSupplier
{
    //variabel yang digunakan
    private static ArrayList<Supplier> SUPPLIER_DATABASE = new ArrayList<Supplier>();
    //private String[] listSupplier;
    //private Supplier supplier;
    private static int LAST_SUPPLIER_ID = 0;
    
    public ArrayList<Supplier> getSupplierDatabase()
    {
        return SUPPLIER_DATABASE;
    }

    /**
     * Menambah supplier
     * @method addSupplier()
     * @param  supplier
     * @return false
     */
    public static int getLastSupplierID()
    {
        return LAST_SUPPLIER_ID;
    }
   
    public static boolean addSupplier(Supplier supplier)
    {
        boolean value = false;
        for (Supplier supplierDB : SUPPLIER_DATABASE)
        {
            if(supplier.getName()!=supplierDB.getName()&&supplier.getEmail()!=supplierDB.getEmail()&&supplier.getPhoneNumber()!=supplierDB.getPhoneNumber())
        {
            SUPPLIER_DATABASE.add(supplier);
            LAST_SUPPLIER_ID=supplier.getId();
            value= true;
        
        }
        }
        return value;
    }
    /**
     * Menambah supplier
     * @method removeSupplier()
     * @param  supplier
     */
    public boolean removeSupplier(int id)
    {
        boolean value = false;
        for (Supplier supplierDB : SUPPLIER_DATABASE)
        {
            if(supplierDB.getId()==id)
            {
                DatabaseItem.getItemDatabase().removeAll(DatabaseItem.getItemFromSupplier(supplierDB));
                SUPPLIER_DATABASE.remove(id);
                value=true;
            }
        
        }
        return value;
    }
    /**
     * Menampilkan nama supplier
     * @method getSupplier()
     * @return supplier
     */
    public Supplier getSupplier(int id)
    {
      Supplier value = null;
      for(Supplier supplierDB : SUPPLIER_DATABASE)
      {
       if(supplierDB.getId()==id)
       {
           value=supplierDB;
        
       }
      }
      return value;  
    }
    /**
     * Menampilkan list supplier
     * @method getListSupplier()
     * @return listSupplier
     */
    /*public String[] getListSupplier()
    {
       return listSupplier;
    }*/
}
