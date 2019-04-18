
/**
 * Write a description of class CustomerAlreadyExistsException here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CustomerAlreadyExistsException extends Exception
{
    // instance variables - replace the example below with your own
    private Customer customer_error;

    /**
     * Constructor for objects of class CustomerAlreadyExistsException
     */
    public CustomerAlreadyExistsException(Customer customer_input)
    {
       super("Customer Email: ");
       customer_error = customer_input;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    
    public String getExMessage()
    {
        return super.getMessage() + customer_error.getEmail() + " ,or Username:"+ customer_error.getUsername() + " already exists."; 
    }
}
