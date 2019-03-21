
/**
 * Write a description of class Buy_Paid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */


public class Sell_Unpaid extends Invoice
{
    
    private InvoiceType INVOICE_TYPE = InvoiceType.Sell;
    private InvoiceStatus INVOICE_STATUS = InvoiceStatus.Unpaid;
    private String dueDate;
   
    public Sell_Unpaid(int id, Item item, String date, int totalPrice, int totalItem, String dueDate)
    {
        super(id,item,date,totalPrice,totalItem);
    }

    public InvoiceStatus getInvoiceStatus()
    {
        return INVOICE_STATUS;
    }
    public InvoiceType getInvoiceType()
    {
        return INVOICE_TYPE; 
    }
    public String getDueDate()
    {
        return dueDate;
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
        System.out.println("DueDate:  " + dueDate);
    }
    
    
}
