
/**
 * Write a description of class Buy_Paid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */


public class Sell_Installment extends Invoice
{
    
   private InvoiceType INVOICE_TYPE = InvoiceType.Sell;
   private InvoiceStatus INVOICE_STATUS = InvoiceStatus.Installment;
   private int installmentPeriod;
   private int installmentPrice;
    
    public Sell_Installment(int id, Item item, String date, int totalPrice, int totalItem)
    {
        super(id,item,date,totalPrice,totalItem);
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
    public void setTotalprice()
    {
        this.totalPrice=(installmentPrice*installmentPeriod);
    
    }
    
    public void printData()
    {
        System.out.println("==========INVOICE DAN ID==========");
        System.out.println("Id: " + super.getId());
        System.out.println("tanggal: " + super.getDate());
        System.out.println("item: " + super.gettotalItem());
        System.out.println("total harga:  " + totalPrice);
        System.out.println("Status: " + super.getInvoiceStatus());
        System.out.println("Invoice Type: " + super.getInvoiceType());
        System.out.println("Installment Price: " + installmentPrice);
    }
    
}
