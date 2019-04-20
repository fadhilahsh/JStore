
/**
 * Write a description of class ItemNotFoundException here.
 *
 * @author (your name)
 * @version (a version number or a date)
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
       item_error = item_input;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getExMessage()
    {
        return  super.getMessage() + item_error + " not found.";
    }
}
