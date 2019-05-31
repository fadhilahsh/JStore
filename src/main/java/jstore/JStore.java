package jstore;
import javax.xml.crypto.Data;
import java.util.*;
/**
 * Kelas JStore merupakan main menu dari Objek JStore 
 *
 * @author Fadhilah Siti Shalihah
 * @version 28/02/2019
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication

public class JStore
{
    // instance variables - replace the example below with your own


    /**
     * Constructor for objects of class JStore
     */
    public static void main(String[] args)
    {
        Location loc = new Location("Bandung", "Jawa Barat", "Kota");
//
        try {
            DatabaseSupplier.addSupplier(new Supplier("Pidil", "pidil@email.com", "082214318260", loc));
        } catch (SupplierAlreadyExistsException e) {
            System.out.println(e.getExMessage());
        }

        try {
            DatabaseItem.addItem(new Item("Oppo F1", ItemStatus.New, 100000, DatabaseSupplier.getSupplier(1), ItemCategory.Electronics));
        } catch (ItemAlreadyExistsException e) {
            System.out.println(e.getExMessage());
        }
        try {
            DatabaseItem.addItem(new Item("Lemari", ItemStatus.Refurbished, 1000000, DatabaseSupplier.getSupplier(1), ItemCategory.Furniture));
        } catch (ItemAlreadyExistsException e) {
            System.out.println(e.getExMessage());
        }
        try {
            DatabaseItem.addItem(new Item("Buku", ItemStatus.Second, 400000, DatabaseSupplier.getSupplier(1), ItemCategory.Stationery));
        } catch (ItemAlreadyExistsException e) {
            System.out.println(e.getExMessage());
        }
//        try {
//            DatabaseItem.addItem(new Item("Resistor", ItemStatus.Sold, 1000, DatabaseSupplier.getSupplier(1), ItemCategory.Electronics));
//        } catch (ItemAlreadyExistsException e) {
//            System.out.println(e.getExMessage());
//        }

        SpringApplication.run(JStore.class, args);
    }

    public JStore()
    {

    }

}
