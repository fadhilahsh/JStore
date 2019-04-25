package jstore;
/**
 * Class Invoice berfungsi sebagai informasi tagihan barang dan item 
 *
 * @author Fadhilah S Shalihah
 * @version 28/02/2019
 */
import java.util.*;
import java.util.ArrayList;

public abstract class Invoice
{
    private static int id;
    private ArrayList<Integer> item = new ArrayList<Integer>();
    private Calendar date;
    private int totalPrice;
    private boolean isActive;
    private Customer customer;
    private static InvoiceStatus status;

    public Invoice(ArrayList<Integer> item)
    {
        
        id = DatabaseInvoice.getLastInvoiceID() + 1;
        this.item = item;
        //this.date = new GregorianCalendar();
    }

    public static int getId()
    {
        return id;
    }
    
    public ArrayList<Integer> getItem()
    {
        return item;
    }
    
    
    public Calendar getDate()
    {
        return date;
    }
    
   
    public int getTotalPrice()
    {
        return totalPrice;
    }
        
    
    public abstract InvoiceStatus getInvoiceStatus();
    
    public abstract InvoiceType getInvoiceType();
      
    
    public boolean getIsActived()
    {
        return isActive;
    }
    
    
    public Customer getCustomer()
    {
        return customer;
    }
    
    
    public void setId(int id)
    {
        this.id = id;
    }
    
    
    public void setItem(ArrayList<Integer> item)
    {
        this.item = item;
    }
    
    /**
     * Method untuk mengubah tanggal invoice
     *
     * @param  date  tanggal dari suatu invoice
     */
    public void setDate(Calendar date)
    {
        this.date = date;
    }
    
    
    public void setTotalPrice(int totalPrice)
    {
        ArrayList<Integer> listItemID = DatabaseInvoice.getInvoice(id).getItem();
        for(int tempID : listItemID)
        {
            this.totalPrice = totalPrice + DatabaseItem.getItemFromID(tempID).getPrice();
        }
        
    }
       
    
    public void setInvoiceStatus(InvoiceStatus status)
    {
        this.status = status;
    }
    
    public void setIsActive(boolean isActive)
    {
        this.isActive = isActive;
    }
    
   
    public void setCustomer(Customer customer)
    {
        this.customer = customer;
    }
    
    /**
     * Method untuk menampilkan total harga pada invoice
     *
     */
    public String toString()
    {
        System.out.println("");
        return "";
    }
}