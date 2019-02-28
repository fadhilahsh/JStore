
/**
 * Write a description of class Invoice here.
 *
 * @author Fadhilah S Shalihah
 * @version 0.0
 */
public class item
{
    // instance variables - replace the example below with your own
    private int id;
    private String name;
    private int stock;
    private int price;
    private String category;
    public static Supplier supplier;
    {
    }

    /**
     * Constructor for objects of class item
     */
    public item(int id ,String name,int stock,int price,String category,Supplier supplier)
    {
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getId ()
    {
        // put your code here
        return id;
    }
    public String getName()
    {
        return name;
    }
    public int getStock()
    {
        return stock;
    }
    public int getPrice()
    {
        return price;
    }
    public String getCategory()
    {
        return category;
    }
    public Supplier getsupplier()
    {
        return supplier;
    }
    /*@return int, return ke nilai id*/
    public void setId(int id)
    {
        this.id = id;
    }
    /*@return int return ke nilai nama*/
    public void setName(String name)
    {
        this.name = name;
    }
    /*@return int*/
    public void setStock(int stock)
    {
        this.stock = stock;
    }
    /*@return int*/
    public void setPrice(int price)
    {
        this.price = price;
    }
    /*@return String*/
    public void setCategory(String category)
    {
        this.category=category;
    }
    public void setSupplier(Supplier supplier)
    {
        this.supplier=supplier;
    }
   
    
}
