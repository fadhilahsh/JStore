/**
 * Class Invoice berfungsi sebagai informasi tagihan barang dan item 
 *
 * @author Fadhilah S Shalihah
 * @version 28/02/2019
 */
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
abstract public class Invoice
{
    //variabel yang digunakan 
    private int id;
    private ArrayList<Integer>Item;
    private Calendar date;
    protected int totalPrice;
    //private int totalItem;
    //private InvoiceStatus status;
    //private InvoiceType type;
    private boolean isActive = true;
    private Customer customer;
    //private static InvoiceStatus status;
    //private final ArrayList<Integer> Id = new ArrayList<>(); 
    /**
     * Constructor untuk objek dari class Invoice
     */
    public Invoice(ArrayList<Integer> item)
    {
        
        // this.setTotalPrice(item.getPrice() * this.getTotalItem());
        id = DatabaseInvoice.getLastInvoiceID() + 1;
        this.Item = item;
        //this.date = new GregorianCalendar();
    }

    public int getId()
    {
        return id;
    }
    
    public ArrayList<Integer> getItem()
    {
        return Item;
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
        this.Item = item;
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
        for(Integer invoice : Item)
        {
            totalPrice=totalPrice+DatabaseItem.getItemFromID(invoice).getPrice();
        }
        
    }
       
    
    public abstract void setInvoiceStatus(InvoiceStatus status);
    
    
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
    public abstract String toString();
}