
/**
 * Write a description of class Buy_Paid here.
 *
 * @author Fadhilah
 * @version 2019
*/
import java.util.Calendar;
public class Sell_Installment extends Invoice
{
    
   private static final InvoiceType INVOICE_TYPE = InvoiceType.Sell;
   private static final InvoiceStatus INVOICE_STATUS = InvoiceStatus.Installment;
   private int installmentPeriod;
   private int installmentPrice;
   private Customer customer;
    
  
    public Sell_Installment(int id, Item item, Calendar date, int totalItem, int installmentPeriod, Customer customer)
    {
         super(id, item, totalItem);
         this.installmentPeriod = installmentPeriod;
         //setInstallmentPrice(totalPrice);
         setTotalPrice(installmentPrice);
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
    
    public void setInstallmentPrice()
    {
        this.installmentPrice=(totalPrice/installmentPeriod)*102/100;
    }
    public void setTotalPrice()
    {
        this.totalPrice=(installmentPrice*installmentPeriod);
    
    }
    public void setCustomer(Customer customer)
    {
        this.customer=customer;
    }
    public String toString()
    {
        return "";
    }
     public void setInvoiceStatus(InvoiceStatus status)
    {
        
    }
    
     public void printData(){
        System.out.println("===========INVOICE Sell_Installment==========");
        System.out.println("ID: "+getId());
        System.out.println("Date: "+getDate());
        System.out.println("Item: "+getItem().getName());
        System.out.println("Invoice Status: "+getInvoiceStatus());
        System.out.println("Invoice Type: "+getInvoiceType());
        setInstallmentPrice();
        setTotalPrice();
        System.out.println("Total Price: "+totalPrice);
        System.out.println("Price Installment: "+ installmentPrice);
    }
    
}
