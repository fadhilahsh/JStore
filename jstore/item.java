/**
 * Class Item berfungsi sebagai informasi item untuk supplier
 *
 * @author Fadhilah S Shalihah
 * @version 28/02/2019
 */
public class Item
{
    //variable yang digunakan 
    private int id;
    private String name;
    private int stock;
    private int price;
    private Supplier supplier;
    private ItemCategory category;
    private ItemStatus status;
    
    

    /**
     * Constructor untuk objects dari class item
     */
    public Item(int id ,String name,int stock, int price, ItemCategory category, ItemStatus status, Supplier supplier)
    {
        this.name = name;
        this.id=id;
        this.stock=stock;
        this.price=price;
        this.category=category;
        this.supplier=supplier;
    }

    /**
     * Untuk menampilkan nomor id
     *
     * @method getId()
     * @return ke id   
     */
    public int getId ()
    {
        return id;
    }
    /**
     * Untuk menampilkan nama dari Item
     *
     * @method getName()
     * @return ke id   
     */
    public String getName()
    {
        return name;
    }
    /**
     * Untuk menampilkan stock Item
     *
     * @method getStock()
     * @return stock   
     */
    public int getStock()
    {
        return stock;
    }
    /**
     * Untuk menampilkan harga dari Item
     *
     * @method getPrice()
     * @return price  
     */
    public int getPrice()
    {
        return price;
    }
    /**
     * Untuk menampilkan Kategori dari Item
     *
     * @method getCategory()
     * @return category   
     */
    public ItemCategory getCategory()
    {
        return category;
    }
    public ItemStatus getStatus()
    {
        return status;
    }
    //Menampilkan supplier Item
    /**
     * Method getSupplier()
     * @return supplier
     */
    public Supplier getsupplier()
    {
        return supplier;
    }
    //Untuk mengganti nomor id
    /**
     * Method setId()
     * @param id
     */
    public void setId(int id)
    {
        this.id = id;
    }
    //Untuk mengganti nama item
    /**
     * Method setName()
     * @param name
     */
    public void setName(String name)
    {
        this.name = name;
    }
    //Untuk mengganti stock item
    /**
     * Method setStock()
     * @param stock
     */
    public void setStock(int stock)
    {
        this.stock = stock;
    }
    //Untuk mengganti harga item
    /**
     * Method setPrice()
     * @param price
     */
    public void setPrice(int price)
    {
        this.price = price;
    }
    //Untuk mengganti kategori item
    /**
     * Method setCategory()
     * @param category
     */ 
    public void setCategory(ItemCategory category )
    {
        this.category=category;
    }
    public void setStatus(ItemStatus status )
    {
        this.status=status;
    }
    //Untuk mengganti supplier item
    /**
     * Method setSupplier()
     * @param supplier
     */
    public void setSupplier(Supplier supplier)
    {
        this.supplier=supplier;
    }
    /**
    *untuk mencetak nama item
    * method printData()
    */
   public void printData()
    {
        System.out.println("==========ITEM==========");
        System.out.println("id: " + id);
        System.out.println("nama: " + name);
        System.out.println("stok: " + stock);
        System.out.println("Kategory: " + category);
        System.out.println("Status:  " + status);
        System.out.println("Supplier: " + supplier);
        
    }
   
 
}
