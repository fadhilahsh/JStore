/**
 * Class Invoice berfungsi sebagai informasi tagihan barang dan item 
 *
 * @author Fadhilah S Shalihah
 * @version 28/02/2019
 */
public class Invoice
{
    //variabel yang digunakan 
    private int id;
    private Item Item;
    private String date;
    private int totalPrice;
    private int totalItem;
    private InvoiceStatus status;

    /**
     * Constructor untuk objek dari class Invoice
     */
    public Invoice(int id, Item Item, String date, int totalPrice, int totalItem, InvoiceStatus status)
    {
        this.id=id;
        this.Item=Item;
        this.date=date;
        this.totalPrice=totalPrice;
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
        return Item;
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
    public InvoiceStatus getInvoiceStatus()
    {
        return status;
    }
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
    public void setItem(Item Item)
    {
        this.Item=Item;
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
        this.totalPrice = totalPrice;
    }
    public void setInvoiceStatus(InvoiceStatus status)
    {
        this.status = status;
    }
    //Mencetak total harga
    /**
     * @method printData()
     */
    public void printData()
    {
        System.out.println("==========INVOICE DAN ID==========");
        System.out.println("tanggal: " + date);
        System.out.println("item: " + Item);
        System.out.println("total item: " + totalItem);
        System.out.println("total harga:  " + totalPrice);
        System.out.println("Status: " + status);
        
    }
}
