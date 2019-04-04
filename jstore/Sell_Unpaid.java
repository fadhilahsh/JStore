
/**
 * Write a description of class Buy_Paid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
import java.text.*;
import java.util.regex.*;

public class Sell_Unpaid extends Invoice
{
    
    private static final InvoiceType INVOICE_TYPE = InvoiceType.Sell;
    private static final InvoiceStatus INVOICE_STATUS = InvoiceStatus.Unpaid;
    private Calendar dueDate;
    private Customer customer;
   
    public Sell_Unpaid(int id, Item item, int totalItem, Calendar dueDate, Customer customer)
    {
        super(id, item, totalItem);
        this.dueDate= dueDate;
        this.customer=customer;
    }

    public InvoiceStatus getInvoiceStatus()
    {
        return INVOICE_STATUS;
    }
    public InvoiceType getInvoiceType()
    {
        return INVOICE_TYPE; 
    }
    public Customer getCustomer()
    {
        return customer;
    }
    public Calendar getDueDate()
    {
        return dueDate;
    }
    public void setCustomer(Customer customer)
    {
        this.customer=customer;
    }
    public void setDueDate(Calendar dueDate)
    {
        this.dueDate = new GregorianCalendar();
        dueDate.add((GregorianCalendar.DATE), 1);
    }
     public String toString()
    {
        return "";
    }
     public void setInvoiceStatus(InvoiceStatus status)
    {
        
    }
    
    public void printData(){
        System.out.println("===========INVOICE Sell_Unpaid==========");
        System.out.println("ID: "+getId());
        System.out.println("Tanggal: "+getDate());
        System.out.println("Item: "+getItem().getName());
        System.out.println("Invoice Status: "+getInvoiceStatus());
        System.out.println("Invoice Type: "+getInvoiceType());
        System.out.println("Total Harga: "+getTotalPrice());    
        System.out.println("DueDate: "+getDueDate());   
    }
    
    
}
