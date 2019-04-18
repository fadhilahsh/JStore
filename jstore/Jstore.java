/**
 * Kelas JStore merupakan main menu dari Objek JStore 
 *
 * @author Fadhilah Siti Shalihah
 * @version 28/02/2019
 */
import java.util.ArrayList;
public class JStore
{
    public JStore()
    {
        
    }

    /**
     * Fungsi utama yang akan dijalankan
     */    
    public static void main(String[] args)
    {
    
    //Supplier sup = new Supplier (1, "Fadhilah", "fadhilah568@gmil.com", "082214318257", lokasi);
    //Item item1 = new Item(2, "Pensil", 2, ItemStatus.New, 20000, sup, ItemCategory.Stationery);
    //DatabaseItem.addItem(item1);

       //Transaction.orderNewItem(DatabaseItem.getItem());
       //Transaction.sellItemPaid(DatabaseItem.getItem());
       //Transaction.sellItemUnpaid(DatabaseItem.getItem());
       //Transaction.sellItemInstallment(DatabaseItem.getItem());
    Location lokasi = new Location ("Bandung", "Jawa Barat", "Dingin");
    try
    {
    DatabaseSupplier.addSupplier(new Supplier("Fadhilah","fadhilah.siti@ui.ac.id","082214318257",lokasi));
}catch (SupplierAlreadyExistsException a)
        {
            System.out.println(a.getExMessage());
        }/*{
        System.out.println("Berhsil");
    }else
    {
        System.out.println("Gagal");
    
    }*/
    try
    {
    DatabaseSupplier.addSupplier(new Supplier("Dila","fadhilah.siti@ui.ac.id","082214318257",lokasi));
}
catch (SupplierAlreadyExistsException a)
        {
            System.out.println(a.getExMessage());
        }
try
{
    DatabaseSupplier.addSupplier(new Supplier("Pidil","fadhilah.siti@ui.ac.id","082214318257",lokasi));
}
catch (SupplierAlreadyExistsException a)
        {
            System.out.println(a.getExMessage());
        }
    for(Supplier temp : DatabaseSupplier.getSupplierDatabase())
    {
        System.out.println(temp);
    }
    try 
    {
        DatabaseCustomer.addCustomer(new Customer("Budi","fadhilah.siti@ui.ac.id","fadhilahsh","dila1234",1998, 07, 25));
    }
    catch (CustomerAlreadyExistsException a)
        {
            System.out.println(a.getExMessage());
        }
    try
    {
        DatabaseCustomer.addCustomer(new Customer("Sinta","fadhilah.siti@ui.ac.id","fadhilahsh","dila1234",1998, 07, 25));
    }
    catch (CustomerAlreadyExistsException a)
        {
            System.out.println(a.getExMessage());
        }
    try
    {
        DatabaseCustomer.addCustomer(new Customer("Bayleh","fadhilah.siti@ui.ac.id","fadhilahsh","dila1234",1998, 07, 25));
    }
    catch (CustomerAlreadyExistsException a)
        {
            System.out.println(a.getExMessage());
        }
    for(Customer temp : DatabaseCustomer.getCustomerDatabase())
    {
        System.out.println(temp);
    }
    
    try
    {
        DatabaseItem.addItem(new Item("laptop",10,500,ItemCategory.Electronics,ItemStatus.New,DatabaseSupplier.getSupplier(1)));
    }
    catch (ItemAlreadyExistsException a)
        {
            System.out.println(a.getExMessage());
        }
    try
    {
        DatabaseItem.addItem(new Item("laptop",12,550,ItemCategory.Electronics,ItemStatus.New,DatabaseSupplier.getSupplier(2)));
    }
    catch (ItemAlreadyExistsException a)
        {
            System.out.println(a.getExMessage());
        }
    try
    {
        DatabaseItem.addItem(new Item("laptop",14,570,ItemCategory.Electronics,ItemStatus.New,DatabaseSupplier.getSupplier(3)));
    }
    catch (ItemAlreadyExistsException a)
        {
            System.out.println(a.getExMessage());
        }
    try
    {
        DatabaseItem.addItem(new Item("laptop",16,600,ItemCategory.Electronics,ItemStatus.New,DatabaseSupplier.getSupplier(2)));
    }
    //ArrayList<Item> arr = new ArrayList<Item>(100);
    catch (ItemAlreadyExistsException a)
        {
            System.out.println(a.getExMessage());
        }
    for(Item temp : DatabaseItem.getItemDatabase())
    {
        System.out.println(temp);
    }
    ArrayList<Integer> array_int1 =new ArrayList<Integer>(100);
    array_int1.add(1);
    
    ArrayList<Integer> array_int2 =new ArrayList<Integer>(100);
    array_int2.add(2);
    
    ArrayList<Integer> array_int3 =new ArrayList<Integer>(100);
    array_int3.add(3);
    
    try{
        DatabaseInvoice.addInvoice(new Buy_Paid(array_int1));
    }
     catch (InvoiceAlreadyExistsException a)
        {
            System.out.println(a.getExMessage());
        }
    try{
        DatabaseInvoice.addInvoice(new Sell_Unpaid(array_int2,DatabaseCustomer.getCustomer(2)));
    }
     catch (InvoiceAlreadyExistsException a)
        {
            System.out.println(a.getExMessage());
        }
    try{
        DatabaseInvoice.addInvoice(new Sell_Paid(array_int3,DatabaseCustomer.getCustomer(3)));
    }
     catch (InvoiceAlreadyExistsException a)
        {
            System.out.println(a.getExMessage());
        }
    ArrayList<Invoice> array_invoice = DatabaseInvoice.getInvoiceDatabase();
    for (Invoice temp : array_invoice)
    {
        System.out.println(temp);
    }/*
    if(!Transaction.finishTransaction(DatabaseInvoice.getInvoice(1)))
        System.out.println("finish");
        if(!Transaction.finishTransaction(DatabaseInvoice.getInvoice(2)))
        System.out.println("finish");
        if(!Transaction.finishTransaction(DatabaseInvoice.getInvoice(3)))
        System.out.println("finish");
        System.out.println();
        
        if(!Transaction.cancelTransaction(DatabaseInvoice.getInvoice(1)));
        for(Invoice temp:arr_invoice)
        {
            System.out.println(temp);
        }*/
}
}