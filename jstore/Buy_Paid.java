
/**
 * Write a description of class Buy_Paid here.
 *
 * @author Fadhilah Siti Shalihah 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.Calendar;
import java.util.*;
import java.text.*;
public class Buy_Paid extends Invoice
{
    
    private static final InvoiceType INVOICE_TYPE = InvoiceType.Buy;
    private static final InvoiceStatus INVOICE_STATUS = InvoiceStatus.Paid;
    private boolean isActive;
    private SimpleDateFormat dateFormat = new SimpleDateFormat ("dd MMM yyy");
    
    public Buy_Paid(ArrayList<Integer> item)
    {
        super(item);
        isActive = false;
   
    }
    //@Override
    public InvoiceStatus getInvoiceStatus()
    {
        return INVOICE_STATUS;
    }
    public InvoiceType getInvoiceType()
    {
      return INVOICE_TYPE;
    }
    /*
    public void setInvoiceStatus(InvoiceStatus status)
    {
    }
    */
    /*public void printData()
    {
        System.out.println("==========INVOICE DAN ID==========");
        System.out.println("Id: " + getId());
        System.out.println("tanggal: " + getDate());
        System.out.println("item: " + getItem().getName());
        System.out.println("Status Status: " + getInvoiceStatus());
        System.out.println("Invoice Type: " + getInvoiceType());
        System.out.println("total harga:  " + getTotalPrice());
    }*/
    @Override
    public String toString()
    {
        System.out.println("=========INVOICE========");
        System.out.println("ID = " + super.getId());
        ArrayList<Integer> listItemID = DatabaseInvoice.getInvoice(super.getId()).getItem();
        for(int tempID : listItemID)
        {
            System.out.println("Item = " + 
            DatabaseItem.getItemFromID(tempID).getName());
            System.out.println("Price = " + 
            DatabaseItem.getItemFromID(tempID).getPrice());
            System.out.println("Supplier ID = " + 
            DatabaseItem.getItemFromID(tempID).getSupplier().getId());
            System.out.println("Supplier name = " + 
            DatabaseItem.getItemFromID(tempID).getSupplier().getName());
        }
        System.out.println("Buy date = " + dateFormat.format(super.getDate().getTime()));
        System.out.println("Price total = " + super.getTotalPrice());
        System.out.println("Status = " + this.getInvoiceStatus());
        System.out.println("Buy success.");
        return "";
    }
    
}
