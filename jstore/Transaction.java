
/**
 * Write a description of class Transaction here.
 *
 * @author Fadhilah
 * @version 2019
 */
import java.util.ArrayList;
public class Transaction
{
    private static ArrayList<Integer> ItemID = new ArrayList<Integer>();
    public Transaction()
    {
        
    }
    
    public static void orderNewItem(Item item)
    {
        /*Invoice Beli = new Buy_Paid(1, item, "21 Maret 2019", 5, item.getPrice());
        
        if (Beli instanceof Sell_Paid)
        {
        System.out.println("Benar Invoice Type adalah Sell-Paid");        
        }
        else
        {
        System.out.println("Salah, Invoice type bukan Sell_Paid");
    }
    Beli.printData();
    item.printData();
    }*/
    ArrayList<Integer> itemID = new ArrayList<Integer>();
    itemID.add(item.getId());
    Invoice invoice=new Buy_Paid(ItemID);
    DatabaseInvoice.addInvoice(invoice);
}
        

        
     public static void orderSecondItem(Item item)
    {
        /*Invoice Beli = new Buy_Paid(1, item, "21 Maret 2019", 10, item.getPrice()); 
        Beli.printData();
        item.printData();*/
        ArrayList<Integer> itemID = new ArrayList<Integer>();
        itemID.add(item.getId());
        Invoice invoice=new Buy_Paid(itemID);
        DatabaseInvoice.addInvoice(invoice);
    }


    public static void orderRefurbishedItem(Item item)
    {
        /*Invoice Beli = new Buy_Paid(1, item, "22 Maret 2019", 5, item.getPrice());  
        Beli.printData();
        item.printData();*/
        ArrayList<Integer> itemID = new ArrayList<Integer>();
        itemID.add(item.getId());
        Invoice invoice=new Buy_Paid(itemID);
        DatabaseInvoice.addInvoice(invoice);
    }
    
    public static void sellItemPaid(Item item,Customer customer)
    {
        /*Invoice jual = new Sell_Paid(2, item, "22 Maret 2019", 6, item.getPrice());
        jual.printData();
        item.printData();*/
        ArrayList<Integer> itemID = new ArrayList<Integer>();
        itemID.add(item.getId());
        Invoice invoice=new Sell_Paid(itemID,customer);
        DatabaseInvoice.addInvoice(invoice);
    }
    
    public static void sellItemUnpaid(Item item, Customer customer)
    {
        /*Invoice jual = new Sell_Unpaid(3, item, "22 Maret 2019", 7, item.getPrice(), "27 April 2019");
        jual.printData();
        item.printData();*/
        ArrayList<Integer> itemID = new ArrayList<Integer>();
        itemID.add(item.getId());
        Invoice invoice=new Sell_Unpaid(itemID,customer);
        DatabaseInvoice.addInvoice(invoice);
    }
    
    public static void sellItemInstallment(Item item,Customer customer,int installmentPeriod)
    {
        ArrayList<Integer> itemID = new ArrayList<Integer>();
        itemID.add(item.getId());
        Invoice invoice=new Sell_Installment(itemID,installmentPeriod,customer);
        DatabaseInvoice.addInvoice(invoice);
        /*Invoice jual = new Sell_Installment(4, item, "22 Maret 2019", 9, item.getPrice(), 5);
        jual.printData();
        item.printData();*/
    }
    public boolean finishTransaction(Invoice invoice)
    {
        boolean value=false;
        for (Invoice invoiceDB : DatabaseInvoice.getInvoiceDatabase()){
            if (invoiceDB.getId()==invoice.getId()){
                invoice.setIsActive(false);
                System.out.print(invoice.getIsActived());
                value=true;
            }
        }
        return value;
    }
    public boolean cancelTransaction(Invoice invoice)
    {
        boolean value=false;
        for (Invoice invoiceDB : DatabaseInvoice.getInvoiceDatabase()){
               if (invoiceDB.getId()==invoice.getId()){
                   DatabaseInvoice.removeInvoice(invoice.getId());
                   value=true;
               }
           }
        return value;
    }
}
