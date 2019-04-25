package jstore;
/**
 * Kelas JStore merupakan main menu dari Objek JStore 
 *
 * @author Fadhilah Siti Shalihah
 * @version 28/02/2019
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication

//import java.util.ArrayList;



public class JStore {
    public JStore() {
    }

    public static void main(String[] args) {
        SpringApplication.run(JStore.class, args);
        /*
        Location lokasi = new Location("Bandung", "Jawa Barat", "Dingin");
        try {
            DatabaseSupplier.addSupplier(new Supplier("Baby", "baby.yl@ui.ac.id", "08221431823", lokasi));
            DatabaseSupplier.addSupplier(new Supplier("Bepel", "bepel.uph@ui.ac.id", "082214318230", lokasi));
            DatabaseSupplier.addSupplier(new Supplier("Bayleh", "bayleh.ast@ui.ac.id", "082214318211", lokasi));
            DatabaseSupplier.addSupplier(new Supplier("Saripah", "hana.saripah@ui.ac.id", "082214318256", lokasi));
        } catch (SupplierAlreadyExistsException sup) {
            System.out.println(sup.getExMessage());
        }

        try {
            DatabaseCustomer.addCustomer(new Customer("Bana", "bana@ui.ac.id", "banana", "bana123", 1997, 10, 16));
            DatabaseCustomer.addCustomer(new Customer("Uci", "uci@ui.ac.id", "usip", "uci123", 1998, 10, 16));
            DatabaseCustomer.addCustomer(new Customer("Sipa", "Sipa@ui.ac.id", "sipah", "sipa123", 1999, 10, 16));
            DatabaseCustomer.addCustomer(new Customer("Copu", "Copu@ui.ac.id", "copucer", "copu123", 1996, 10, 16));
        } catch (CustomerAlreadyExistsException cust) {
            System.out.println(cust.getExMessage());
        }

        try {
            DatabaseItem.addItem(new Item("Hp", 50,ItemCategory.Electronics ,ItemStatus.New, DatabaseSupplier.getSupplier(1)));
            DatabaseItem.addItem(new Item("Pulpen", 20, ItemCategory.Stationery, ItemStatus.New, DatabaseSupplier.getSupplier(2)));
            DatabaseItem.addItem(new Item("Buku", 5, ItemCategory.Stationery, ItemStatus.New, DatabaseSupplier.getSupplier(1)));
            DatabaseItem.addItem(new Item("Pensil", 15, ItemCategory.Stationery, ItemStatus.New, DatabaseSupplier.getSupplier(4)));
        } catch (ItemAlreadyExistsException item) {
            System.out.println(item.getExMessage());
        }

        ArrayList<Integer> item1 = new ArrayList<>();
        item1.add(1);
        item1.add(2);
        ArrayList<Integer> item2 = new ArrayList<>();
        item2.add(3);
        ArrayList<Integer> item3 = new ArrayList<>();
        item3.add(3);
        item3.add(2);

        try {
            DatabaseInvoice.addInvoice(new Sell_Paid(item1, DatabaseCustomer.getCustomer(1)));
            DatabaseInvoice.addInvoice(new Sell_Paid(item1, DatabaseCustomer.getCustomer(1)));
            DatabaseInvoice.addInvoice(new Sell_Unpaid(item2, DatabaseCustomer.getCustomer(2)));
            DatabaseInvoice.addInvoice(new Sell_Installment(item3, DatabaseCustomer.getCustomer(3)));
        } catch (InvoiceAlreadyExistsException invoice) {
            System.out.println(invoice.getExMessage());
        }

        try{
            DatabaseInvoice.removeInvoice(7);
        }catch (InvoiceNotFoundException remove){
            System.out.println(remove.getExMessage());
        }

        try{
            DatabaseCustomer.removeCustomer(7);
        }catch (CustomerNotFoundException remove){
            System.out.println(remove.getExMessage());
        }

        try{
            DatabaseSupplier.removeSupplier(7);
        }catch (SupplierNotFoundException remove){
            System.out.println(remove.getExMessage());
        }catch (ItemNotFoundException remove){
            System.out.println(remove.getExMessage());
        }

        try{
            DatabaseItem.removeItem(7);
        }catch (ItemNotFoundException remove){
            System.out.println(remove.getExMessage());
        }



        try{
            DatabaseInvoice.getActiveOrder(DatabaseCustomer.getCustomer(3));
        }catch (CustomerDoesntHaveActiveException c){
            System.out.println(c.getExMessage());
        }

        DatabaseSupplier.getSupplier(1);
        DatabaseCustomer.getCustomer(2);
        DatabaseItem.getItemFromID(3);
        DatabaseInvoice.getInvoice(4);


        Transaction.finishTransaction(DatabaseInvoice.getInvoice(2));

        try{
            Transaction.cancelTransaction(DatabaseInvoice.getInvoice(3));
        }
        catch (InvoiceNotFoundException cancel) {
            System.out.println(cancel);
        }
        */

    }

}