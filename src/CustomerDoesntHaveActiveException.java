
/**
 * Write a description of class CustomerDoesntHaveActiveException here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CustomerDoesntHaveActiveException extends Exception 
{
    // instance variables - replace the example below with your own
    private Customer customer_error;;

    /**
     * Constructor for objects of class CustomerDoesntHaveActiveException
     */
    public CustomerDoesntHaveActiveException(Customer customer_input)
    {
    super("Customer: ");
    customer_error = customer_input;
    }
    public String getExMessage(){
       return super.getMessage() + customer_error + " \ndoesnt have active invoice"; 
    }
}
