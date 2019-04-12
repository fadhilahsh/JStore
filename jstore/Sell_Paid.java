
/**
 * Write a description of class Buy_Paid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.ArrayList;
public class Sell_Paid extends Invoice
{
    
    private static final InvoiceType INVOICE_TYPE = InvoiceType.Sell;
    private static final InvoiceStatus INVOICE_STATUS = InvoiceStatus.Paid;
    private Customer customer;
    private boolean isActive;
    
    public Sell_Paid(ArrayList<Integer> item, Customer customer)
    {
        super(item);
        this.customer=customer;
        isActive=false;
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
    public void setCustomer(Customer customer)
    {
        this.customer=customer;
    }
    
     public void setInvoiceStatus(InvoiceStatus status)
    {
        
    }
    public String toString()
    {
        {
        String string="==========INVOICE=======";
        string += "\nID ="+getId();
        string += "\nBuy date =" + getDate();
        for (Integer invoice : getItem())
        {
            Item item = DatabaseItem.getItemFromID(invoice.intValue());
            string += "\nItem: " + item.getName();
            string += "\nAmount: " + getItem().size();
            string += "\nPrice: " + item.getPrice();
            string += "\nSupplier ID: " + item.getsupplier().getId();
            string += "\nSupplier Name: " + item.getsupplier().getName();
        }
        string += "\nPrice Total: " + getTotalPrice();
        string += "\nCustomer ID: " + customer.getId();
        string += "\nCustomer Name: " + customer.getName();
        string += "\nStatus: " + INVOICE_STATUS;
        string += "\nSell Success";
        return string;
    }
    }
     
    /*public void printData(){
        System.out.println("===========INVOICE Sell_Paid==========");
        System.out.println("ID: "+getId());
        System.out.println("Tanggal: "+getDate());
        System.out.println("Item: "+getItem().getName());
        System.out.println("Invoice Status: "+getInvoiceStatus());
        System.out.println("Invoice Type: "+getInvoiceType());
        System.out.println("Total Harga: "+getTotalPrice());                
    }*/
    
    
}
