
/**
 * Write a description of class Buy_Paid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
import java.text.*;
import java.util.Calendar;
import java.util.ArrayList;
import java.util.regex.*;

public class Sell_Unpaid extends Invoice
{
    
    private static InvoiceType INVOICE_TYPE = InvoiceType.Sell;
    private static InvoiceStatus INVOICE_STATUS = InvoiceStatus.Unpaid;
    private SimpleDateFormat dateFormat = new SimpleDateFormat ("dd MMM yyy");
    private Customer customer;
    private boolean isActive;
    private Calendar dueDate;
   
    public Sell_Unpaid(ArrayList<Integer> item, Customer customer)
    {
        super(item);
        this.customer=customer;
        isActive=true;
    }
    @Override
    public InvoiceStatus getInvoiceStatus()
    {
        return INVOICE_STATUS;
    }
    @Override
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
        this.dueDate=dueDate;
    }
    public String toString()
    {{
        String string="==========INVOICE=======";
        string += "\nID ="+getId();
        string += "\nBuy date =" + getDate();
        for (Integer invoice : getItem())
        {
            Item item = DatabaseItem.getItemFromID(invoice.intValue());
            string += "\nItem: " + item.getName();
            string += "\nAmount: " + getItem().size();
            string += "\nPrice: " + item.getPrice();
            string += "\nSupplier ID: " + item.getSupplier().getId();
            string += "\nSupplier Name: " + item.getSupplier().getName();
        }
        string += "\nPrice Total: " + getTotalPrice();
        string += "\nCustomer ID: " + customer.getId();
        string += "\nCustomer Name: " + customer.getName();
        string += "\nStatus: " + INVOICE_STATUS;
        string += "\nDue date: " + getDueDate();
        string += "\nIf payment is not received by dueDate, transaction will be cancelled.";
        return string;
    }
    }
    public void setInvoiceStatus(InvoiceStatus status)
    {
        
    }
    /*
    public void printData(){
        System.out.println("===========INVOICE Sell_Unpaid==========");
        System.out.println("ID: "+getId());
        System.out.println("Tanggal: "+getDate());
        System.out.println("Item: "+getItem().getName());
        System.out.println("Invoice Status: "+getInvoiceStatus());
        System.out.println("Invoice Type: "+getInvoiceType());
        System.out.println("Total Harga: "+getTotalPrice());    
        System.out.println("DueDate: "+getDueDate());   
    }*/
    
    
}
