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
    private item item;
    private String date;
    private int totalPrice;

    /**
     * Constructor untuk objek dari class Invoice
     */
    public Invoice(int id, item item, String date, int totalPrice)
    {
        this.id=id;
        this.item=item;
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
    public item getItem()
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
    public void setItem(item item)
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
        this.totalPrice = totalPrice;
    }
    //Mencetak total harga
    /**
     * @method printData()
     */
    public void printData()
    {
        System.out.println(totalPrice); 
    }
}
