package jstore;
/**
 * Write a description of class ItemNotFoundException here.
 *
 * @author Fadhilah
 * @version (2019
 */
public class ItemNotFoundException extends Exception
{
    // instance variables - replace the example below with your own
    private int item_error;

    /**
     * Constructor for objects of class ItemNotFoundException
     */
    public ItemNotFoundException(int item_input)
    {
       super("Item ID: ");
       this.item_error = item_input;
    }

    public String getExMessage()
    {
        System.out.println("\n====Item Not Found Exception====");
        return  super.getMessage() + item_error + " not found.";
    }
}
