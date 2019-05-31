package jstore;
/**
 * Kelas ini berfungsi untuk menambahkan dan menghapus supplier pada list
 * kemudian dapat mengembalikan nilainya serta menampilkan listnya.
 *
 * @author Fadhilah
 * @version 18 April 2019
 */

import java.util.ArrayList;
import java.util.*;

public class DatabaseSupplier
{
    // instance variables - replace the example below with your own
    private final static ArrayList<Supplier> SUPPLIER_DATABASE=new ArrayList<>();
    private static int LAST_SUPPLIER_ID=0;

    /**
     * Method untuk menambah data supplier
     *
     * @return    Supplier_Database
     */
    public static ArrayList<Supplier> getSupplierDatabase()
    {
        return SUPPLIER_DATABASE;
    }
    /**
     * Method untuk menggambil id terakhir supplier
     *
     * @return    LAST_SUPPLIER_ID
     */

    public static int getLastSupplierID()
    {
        return LAST_SUPPLIER_ID;
    }

    public static boolean addSupplier(Supplier supplier) throws SupplierAlreadyExistsException
    {
        // put your code here
        String email = supplier.getEmail();
        String name = supplier.getName();
        String phoneNumber = supplier.getPhoneNumber();
        for( Supplier sup : SUPPLIER_DATABASE){
            if(name.equals(sup.getName())){
                throw new SupplierAlreadyExistsException(sup);
            }
            if(email.equals(sup.getEmail())){
                throw new SupplierAlreadyExistsException(sup);
            }
            if(phoneNumber.equals(sup.getPhoneNumber())){
                throw new SupplierAlreadyExistsException(sup);
            }
        }
        SUPPLIER_DATABASE.add(supplier);
        LAST_SUPPLIER_ID = supplier.getId();
        return false;
    }

    public static Supplier getSupplier(int id)
    {
        for ( Supplier sup : SUPPLIER_DATABASE ){
            if (sup.getId() == id) {
                return sup;
            }
        }
        return null;
    }

    /**
     * Method untuk menghapus data supplier
     *
     * @return    true
     */
    public static boolean removeSupplier(int id) throws SupplierNotFoundException
    {
        for ( Supplier sup : SUPPLIER_DATABASE ){
            if (sup.getId() == id) {
                ArrayList<Item> temp = DatabaseItem.getItemFromSupplier(sup);
                if (temp != null) {
                    for (Item item : temp){
                        try {
                            DatabaseItem.removeItem(item.getId());
                        } catch (ItemNotFoundException e) {
                            System.out.print(e.getExMessage());
                        }
                    }
                }
                SUPPLIER_DATABASE.remove(sup);
                return true;
            }
        }
        throw new SupplierNotFoundException(id);
    }
}
