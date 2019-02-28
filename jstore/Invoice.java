
/**
 * Write a description of class Invoice here.
 *
 * @author Fadhilah S Shalihah
 * @version 0.0
 */
public class Invoice
{
    // instance variables - replace the example below with your own
    private int id;
    private item item;
    private String date;
    private int totalPrice;

    /**
     * Constructor for objects of class Invoice
     */
    public Invoice(int id, item item, String date, int totalPrice)
    {
        // initialise instance variables
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getId()
    {
        return id;
    }
    public item getIdItem()
    {
        return item;
    }
    public String getDate()
    {
        return date;
    }
    public int getTotalPrice()
    {
        return totalPrice;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public void setItem(item item)
    {
        this.item=item;
    }
    public void setDate(String date)
    {
        this.date = date;
    }
    public void setTotalPrice(int totalPrice)
    {
        this.totalPrice = totalPrice;
    }
}
