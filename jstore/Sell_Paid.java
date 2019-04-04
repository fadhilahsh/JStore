
/**
 * Write a description of class Buy_Paid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */


public class Sell_Paid extends Invoice
{
    
    private static final InvoiceType INVOICE_TYPE = InvoiceType.Sell;
    private static final InvoiceStatus INVOICE_STATUS = InvoiceStatus.Paid;
    private Customer customer;
    public Sell_Paid(int id, Item item, int totalItem, Customer customer)
    {
        super(id,item,date,totalItem,totalPrice);
    }
    public Customer getCustomer()
    {
        return INVOICE_STATUS;
    }

    public InvoiceStatus getInvoiceStatus()
    {
        return INVOICE_STATUS;
    }
    public InvoiceType getInvoiceType()
    {
        return INVOICE_TYPE; 
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
        System.out.println("===========INVOICE Sell_Paid==========");
        System.out.println("ID: "+getId());
        System.out.println("Tanggal: "+getDate());
        System.out.println("Item: "+getItem().getName());
        System.out.println("Invoice Status: "+getInvoiceStatus());
        System.out.println("Invoice Type: "+getInvoiceType());
        System.out.println("Total Harga: "+getTotalPrice());                
    }
    
    
}
