package jstore;
/**
 * Write a description of class CustomerNotFoundException here.
 *
 * @author Fadhilah
 * @version 2019
 */
public class CustomerNotFoundException extends Exception {
    private int customer_error;

    public CustomerNotFoundException(int customer_input)
    {
        super("Customer ID: ");
        customer_error = customer_input;
    }

    public String getExMessage()
    {
        return super.getMessage() + customer_error + " not found.";
    }
}
