
/**
 * Write a description of class Transaction here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Transaction
{
    
    public static void orderNewItem(Item item)
    {
        Invoice Beli = new Invoice (1, item, "21 Maret 2019", 5, item.getPrice());
        
        if (Beli instanceof Sell_Paid)
        {
        System.out.println("Benar Invoice Type adalah Sell-Paid");        
        }
        else
        {
        System.out.println("Salah, Invice type bukan Sell_Paid");
    }
}
        
    public static void orderSecondItem (Item item)
    {
        Invoice Beli = new Invoice (1, item, "21 Maret 2019", 5, item.getPrice());
        
        if (Beli instanceof Sell_Paid)
        {
        System.out.println("Benar Invoice Type adalah Sell-Paid");        
        }
        else
        {
        System.out.println("Salah, Invice type bukan Sell_Paid");
    }

}
    public static void orderRefubrishedItem (Item item)
    {
        Invoice Beli = new Buy_Paid (1, item, "21 Maret 2019", 5, item.getPrice());
        
        if (Beli instanceof Sell_Paid)
        {
        System.out.println("Benar Invoice Type adalah Sell-Paid");        
        }
        else
        {
        System.out.println("Salah, Invice type bukan Sell_Paid");
    }
    }
    public void sellItemPaid (Item item)
    {
        Invoice Jual = new Sell_Paid (1, item, "21 Maret 2019", 5, item.getPrice());
        InvoiceStatus Jual = InvoiceStatus.Paid;
        ItemStatus itemstatus1 = ItemStatus.Sold;
        item.setStatus(itemstatus1);
        item.printData();
        Jual.printData();
    }
    public void sellItemUnpaid (Item item)
    {
        Invoice Jual1 = new Sell_Paid (1, item, "21 Maret 2019", 5, item.getPrice());
        InvoiceStatus Jual1 = InvoiceStatus.Unpaid;
        ItemStatus itemstatus2 = ItemStatus.Sold;
        item.setStatus(itemstatus2);
        item.printData();
        Jual1.printData();
  
    }
    public void sellItemInstallment (Item item)
    {
       Invoice Jual2 = new Sell_Paid (1, item, "21 Maret 2019", 5, item.getPrice());
        InvoiceStatus Jual2 = InvoiceStatus.Installment;
        ItemStatus itemstatus3 = ItemStatus.Sold;
        item.setStatus(itemstatus3);
        item.printData();
        Jual2.printData();
    }
    
}
