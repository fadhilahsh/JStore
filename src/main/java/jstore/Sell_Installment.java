package jstore;
/**
 * Write a description of class Buy_Paid here.
 *
 * @author Fadhilah
 * @version 2019
*/
import java.text.*;
import java.util.ArrayList;
//import java.util.Calendar;
public class Sell_Installment extends Invoice
{
    
   private static final InvoiceType INVOICE_TYPE = InvoiceType.Sell;
   private static final InvoiceStatus INVOICE_STATUS = InvoiceStatus.Installment;
   private int installmentPeriod;
   private int installmentPrice;
   private Customer customer;
   private boolean isActive;
   private SimpleDateFormat date = new SimpleDateFormat (" dd MM yyy");
  
    public Sell_Installment(ArrayList<Integer> item, int installmentPeriod,  Customer customer)
    {
         super(item);
         this.installmentPeriod = installmentPeriod;
         //setInstallmentPrice(totalPrice);
         //setTotalPrice(installmentPrice);
         this.customer=customer;
         isActive = true;
    }
    
    public int getInstallmentperiod()
    {
        return installmentPeriod;
    
    }
    public int getInstalllmentPrice()
    {
        return installmentPrice;    
    }
    public Customer getCustomer()
    {
        return customer;    
    }
   
    public InvoiceStatus getInvoiceStatus()
    {
        return INVOICE_STATUS;
    }
    public InvoiceType getInvoiceType()
    {
        return INVOICE_TYPE; 
    }
    
    public void setInstallmentPrice(int totalPrice)
    {
        this.installmentPrice=(totalPrice/installmentPeriod)*102/100;
    }
    public void setTotalPrice(int installmentPeriod)
    {
        int totalPrice = installmentPrice * installmentPeriod;
        super.setTotalPrice(totalPrice);
    
    }
    public void setCustomer(Customer customer)
    {
        this.customer=customer;
    }
     public void setInvoiceStatus(InvoiceStatus status)
    {
        
    }
    
    public String toString()
    {
        System.out.println("ID = " + super.getId());
        ArrayList<Integer> listItemID = DatabaseInvoice.getInvoice(super.getId()).getItem();
        for(int itemID : listItemID)
        {if (DatabaseItem.getItemFromID(itemID) != null) {
            System.out.println("Item = " +
                    DatabaseItem.getItemFromID(itemID).getName());
            System.out.println("Price = " +
                    DatabaseItem.getItemFromID(itemID).getPrice());
            System.out.println("Supplier ID = " +
                    DatabaseItem.getItemFromID(itemID).getSupplier().getId());
            System.out.println("Supplier name = " +
                    DatabaseItem.getItemFromID(itemID).getSupplier().getName());
        }
        }
        System.out.println("Buy date = " + date.format(super.getDate().getTime()));
        System.out.println("Price total = " + super.getTotalPrice());
        System.out.println("Installment price = " + installmentPrice);
        //System.out.println("Customer ID = " + costumer.getId());
        //System.out.println("Customer name = " + costumer.getName());
        System.out.println("Status = " + INVOICE_STATUS);
        System.out.println("Installment period = " + installmentPeriod);
        System.out.println("Sell success.");
        return "";
    }
    
}
