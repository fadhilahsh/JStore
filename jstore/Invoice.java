/**
 * Class Invoice berfungsi sebagai informasi tagihan barang dan item 
 *
 * @author Fadhilah S Shalihah
 * @version 28/02/2019
 */
public abstract class Invoice
{
    //variabel yang digunakan 
    private int id;
    private Item item;
    private String date;
    protected int totalPrice;
    private int totalItem;
    private InvoiceStatus status;
    private InvoiceType type;

    /**
     * Constructor untuk objek dari class Invoice
     */
    public Invoice(int id, Item item, String date, int totalItem, int totalPrice )
    {
        this.id=id;
        this.item=item;
        this.date=date;
        this.totalPrice=totalPrice;
        this.totalItem=totalItem;
    }

    /**
     * Menampilkan nomor Id inovice
     * @method  getId()
     * @return  id  
     */
    public int getId()
    {
        return id;
    }
    /**
     * Menampilkan nama item
     * @method  getItem()
     * @return  item  
     */
    public Item getItem()
    {
        return item;
    }
    /**
     * Menampilkan tanggal inovice
     * @method  getDate()
     * @return  date  
     */
    public String getDate()
    {
        return date;
    }
    /**
     * Menampilkan total harga
     * @method  getTotalPrice()
     * @return  totalPrice  
     */
    public int getTotalPrice()
    {
        return totalPrice;
    }
    public int gettotalItem()
    {
        return totalItem;
    }
    public abstract InvoiceStatus getInvoiceStatus();
    public abstract InvoiceType getInvoiceType();
    /**
     * Menggubah nomor Id 
     * @method  setId()
     * @param  id  
     */
    public void setId(int id)
    {
        this.id = id;
    }
    /**
     * Mengubah nama item
     * @method  setItem()
     * @param item  
     */
    public void setItem(Item item)
    {
        this.item=item;
    }
     /**
     * Mengubah tanggal
     * @method  setDate()
     * @param date  
     */
    public void setDate(String date)
    {
        this.date = date;
    }
    /**
     * Mengubah total harga
     * @method  setTotalPrice()
     * @param totalPrice  
     */
    public void setTotalPrice(int totalPrice)
    {
        this.totalPrice=totalPrice;
    }
    public void setTotalItem(int totalItem)
    {
        this.totalItem = totalItem;
    }
    public void setInvoiceStatus(InvoiceStatus status)
    {
        this.status = status;
    }
    //Mencetak total harga
    /**
     * @method printData()
     */
    public abstract void printData();
    
}
