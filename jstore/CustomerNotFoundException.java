
/**
 * Write a description of class CustomerNotFoundException here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CustomerNotFoundException extends Exception
{
    // instance variables - replace the example below with your own
    private int customer_error;

    /**
     * Constructor for objects of class CustomerNotFoundException
     */
    public CustomerNotFoundException(int customer_input)
    {
        super("Supplier Email: ");
        customer_error = customer_input;
    }
    public String getExMessage()
    {
        return super.getMessage() + customer_error + " not found.";
    }

}
