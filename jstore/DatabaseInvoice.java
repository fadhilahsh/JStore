/**
 * Write a description of class DatabaseInvoice here.
 *
 * @author Fadhilah S Shalihah
 * @version 12-04-2019
 */
import java.util.ArrayList;
public class DatabaseInvoice
{
    // instance variables - replace the example below with your own
    //private Invoice[] listInvoice;
    //private Invoice invoice;
    private static ArrayList<Invoice> INVOICE_DATABASE = new ArrayList<Invoice>();
    private static int LAST_INVOICE_ID = 0;

    /**
     * Constructor for objects of class DatabaseInvoice
     */
    public DatabaseInvoice()
    {
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static ArrayList<Invoice> getInvoiceDatabase()
    {
        return INVOICE_DATABASE;
    }
    public static int getLastInvoiceID()
    {
        return LAST_INVOICE_ID;
    }
    public static boolean addInvoice(Invoice invoice)
    {
        INVOICE_DATABASE.add(invoice);
        LAST_INVOICE_ID= invoice.getId();
        return true;
    }
    public Invoice getInvoice(int id)
    {
        Invoice value=null;
        for(Invoice invoice : INVOICE_DATABASE)
        {
            if(invoice.getId()==id)
            {
                value=invoice;
            }
        }
        return value;
        
    }

    public static Invoice getActiveOrderCustomer(Customer customer)
    {
        Invoice value=null;
        for(Invoice invoice : INVOICE_DATABASE)
        {
            if((invoice.getInvoiceStatus()==InvoiceStatus.Installment||invoice.getInvoiceStatus()==InvoiceStatus.Paid)&&invoice.getIsActived()==true)
        {
            value=invoice;
        }
        }
        return value;
    }
  
    
    public static boolean removeInvoice(int id)
    {
        boolean value=false;
        for(Invoice invoice : INVOICE_DATABASE)
        {
            if(invoice.getId()==id&&invoice.getIsActived()==true)
            {
                invoice.setIsActive(false);
                INVOICE_DATABASE.remove(id);
                value=true;
            }
        }
        return value;
    }
}
