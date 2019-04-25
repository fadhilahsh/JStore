package jstore;
/**
 * Write a description of class CustomerNotFoundException here.
 *
 * @author Fadhilah
 * @version 2019
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
        this.customer_error = customer_input;
    }
    public String getExMessage()
    {
        System.out.println("\n====Customer Not Found Exception====");
        return super.getMessage() + customer_error + " not found.";
    }

}
