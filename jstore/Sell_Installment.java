
/**
 * Write a description of class Buy_Paid here.
 *
 * @author Fadhilah
 * @version 2019
*/

public class Sell_Installment extends Invoice
{
    
   private static final InvoiceType INVOICE_TYPE = InvoiceType.Sell;
   private static final InvoiceStatus INVOICE_STATUS = InvoiceStatus.Installment;
   private int installmentPeriod;
   private int installmentPrice;
    
    public Sell_Installment(int id, Item item, String date, int totalItem, int totalPrice, int installmentPeriod)
    {
         super(id, item, date, totalItem, totalPrice);
         this.installmentPeriod = installmentPeriod;
    }
    
    public int getInstallmentperiod()
    {
        return installmentPeriod;
    
    }
    public int getInstalllmentprice()
    {
        return installmentPrice;    
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
