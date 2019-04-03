
/**
 * Write a description of class Buy_Paid here.
 *
 * @author Fadhilah Siti Shalihah 
 * @version (a version number or a date)
 */


public class Buy_Paid extends Invoice
{
    
    private static final InvoiceType INVOICE_TYPE = InvoiceType.Buy;
    private static final InvoiceStatus INVOICE_STATUS = InvoiceStatus.Paid;
    
    public Buy_Paid(int id, Item item, String date, int totalPrice, int totalItem)
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
    
    public void printData()
    {
        System.out.println("==========INVOICE DAN ID==========");
        System.out.println("Id: " + getId());
        System.out.println("tanggal: " + getDate());
        System.out.println("item: " + getItem().getName());
        System.out.println("Status Status: " + getInvoiceStatus());
        System.out.println("Invoice Type: " + getInvoiceType());
        System.out.println("total harga:  " + getTotalPrice());
    }
    
    
}
