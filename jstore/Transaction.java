
/**
 * Write a description of class Transaction here.
 *
 * @author Fadhilah
 * @version 2019
 */
public class Transaction
{
    public Transaction()
    {
    }
    
    public static void orderNewItem(Item item)
    {
        Invoice Beli = new Buy_Paid(1, item, "21 Maret 2019", 5, item.getPrice());
        
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
    }
        

        
     public static void orderSecondItem(Item item)
    {
        Invoice Beli = new Buy_Paid(1, item, "21 Maret 2019", 10, item.getPrice()); 
        Beli.printData();
        item.printData();
    }


    public static void orderRefurbishedItem(Item item)
    {
        Invoice Beli = new Buy_Paid(1, item, "22 Maret 2019", 5, item.getPrice());  
        Beli.printData();
        item.printData();
    }
    
    public static void sellItemPaid(Item item)
    {
        Invoice jual = new Sell_Paid(2, item, "22 Maret 2019", 6, item.getPrice());
        jual.printData();
        item.printData();
    }
    
    public static void sellItemUnpaid(Item item)
    {
        Invoice jual = new Sell_Unpaid(3, item, "22 Maret 2019", 7, item.getPrice(), "27 April 2019");
        jual.printData();
        item.printData();
    }
    
    public static void sellItemInstallment(Item item)
    {
        Invoice jual = new Sell_Installment(4, item, "22 Maret 2019", 9, item.getPrice(), 5);
        jual.printData();
        item.printData();
    }
    
}
