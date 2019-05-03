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

public class JStore {
    public JStore()
    {
    }

    public static void main(String[] args) {


        Location lokasi = new Location("Bandung", "Jawa Barat", "Dingin");
        try {
            DatabaseSupplier.addSupplier(new Supplier("Bepel", "bepel@gmail.com", "654321", lokasi));
        } catch (SupplierAlreadyExistsException e) {
            System.out.println(e.getExMessage());
        }
        try {
            DatabaseSupplier.addSupplier(new Supplier("Bayleh", "bayleh@gmail.com", "654322", lokasi));
        } catch (SupplierAlreadyExistsException e) {
            System.out.println(e.getExMessage());
        }
        try {
            DatabaseSupplier.addSupplier(new Supplier("Saripah", "saripah@gmail.com", "654323", lokasi));
        } catch (SupplierAlreadyExistsException e) {
            System.out.println(e.getExMessage());
        }


        try {
            DatabaseItem.addItem(new Item("tv",  ItemStatus.Sold, 450, DatabaseSupplier.getSupplier(1), ItemCategory.Electronics));
        } catch (ItemAlreadyExistsException e) {
            System.out.println(e.getExMessage());
        }
        try {
            DatabaseItem.addItem(new Item("hp",  ItemStatus.New,700, DatabaseSupplier.getSupplier(2), ItemCategory.Electronics));
        } catch (ItemAlreadyExistsException e) {
            System.out.println(e.getExMessage());
        }
        try {
            DatabaseItem.addItem(new Item("ps",ItemStatus.Second, 160, DatabaseSupplier.getSupplier(3), ItemCategory.Electronics));
        } catch (ItemAlreadyExistsException e) {
            System.out.println(e.getExMessage());
        }
        try {
            DatabaseItem.addItem(new Item("jbl", ItemStatus.Refubrished,158, DatabaseSupplier.getSupplier(2), ItemCategory.Electronics));
        } catch (ItemAlreadyExistsException e) {
            System.out.println(e.getExMessage());
        }

        SpringApplication.run(JStore.class, args);

    }
}