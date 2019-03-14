
/**
 * Write a description of class Transaction here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Transaction
{
    
    public void orderNewItem(Supplier supplier)
    {
        Item newItem = new Item( 1, "Pensil", 2, 1000, ItemCategory.Stationery, ItemStatus.New, supplier);
        Database.addItem(newItem);
        Invoice newInvoice = new Invoice (1, newItem, "6 Maret2019", newItem.getPrice(), 5, InvoiceStatus.Paid );
        newItem.setStatus(ItemStatus.New);
        newInvoice.setInvoiceStatus(InvoiceStatus.Paid);
        newItem.printData();
        newInvoice.printData();
    }
    public void orderSecondItem (Supplier supplier)
    {
        Item newItem = new Item(2, "Pensil", 2, 1000, ItemCategory.Stationery, ItemStatus.Second, supplier);
        Database.addItem(newItem);
        Invoice newInvoice = new Invoice (1, newItem, "6 Maret2019", newItem.getPrice(), 5, InvoiceStatus.Paid );
        newItem.setStatus(ItemStatus.New);
        newInvoice.setInvoiceStatus(InvoiceStatus.Paid);
        newItem.printData();
        newInvoice.printData();
    }
    public void orderRefubrishedItem (Supplier supplier)
    {
        Item newItem = new Item(1, "Pencil", 2 ,10000 , ItemCategory.Stationery, ItemStatus.Refubrished, supplier);
        Database.addItem(newItem);
        Invoice newInvoice = new Invoice (1, newItem, "6 Maret2019", newItem.getPrice(), 5, InvoiceStatus.Paid );
        newItem.setStatus(ItemStatus.New);
        newInvoice.setInvoiceStatus(InvoiceStatus.Paid);
        newItem.printData();
        newInvoice.printData();
    }
    public void sellItemPaid (Item Item)
    {
        Invoice newInvoice = new Invoice (1, Item, "6 Maret2019", Item.getPrice(), 5, InvoiceStatus.Paid );
        Item.setStatus(ItemStatus.Sold);
        
        newInvoice.printData();
    }
    public void sellItemUnpaid (Item Item)
    {
        Invoice newInvoice = new Invoice (1, Item, "6 Maret2019", Item.getPrice(), 5, InvoiceStatus.Unpaid );
        Item.setStatus(ItemStatus.Sold);
        
        newInvoice.printData();
    }
    public void sellItemInstallment (Item Item)
    {
        Invoice newInvoice = new Invoice (1, Item, "6 Maret2019", Item.getPrice(), 5, InvoiceStatus.Installment );
        Item.setStatus(ItemStatus.Sold);
        
        newInvoice.printData();
    }
    
}
