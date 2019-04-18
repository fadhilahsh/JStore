/**
 * Class Invoice berfungsi sebagai informasi tagihan barang dan item 
 *
 * @author Fadhilah S Shalihah
 * @version 28/02/2019
 */
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
public abstract class Invoice
{
    //variabel yang digunakan 
    private int id;
    private ArrayList<Integer>item;
    private Calendar date;
    protected int totalPrice;
    //private int totalItem;
    //private InvoiceStatus status;
    //private InvoiceType type;
    private boolean isActive;
    private Customer customer;
    private static InvoiceStatus status;
    //private static InvoiceStatus status;
    //private final ArrayList<Integer> Id = new ArrayList<>(); 
    /**
     * Constructor untuk objek dari class Invoice
     */
    public Invoice(ArrayList<Integer> item)
    {
        
        this.id = DatabaseInvoice.getLastInvoiceID() + 1;
        this.item = item;
        this.date = new GregorianCalendar();
    }

    public int getId()
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
    public abstract String toString();
}