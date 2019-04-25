package jstore;
/**
 * Write a description of class CustomerAlreadyExistsException here.
 *
 * @author Fadhilah
 * @version 2019
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
       this.customer_error = customer_input;
    }
    public String getExMessage()
    {
        System.out.println("\n====Customer Already Exists Exception====");
        return super.getMessage() + customer_error.getEmail() + " ,or Username:"+ customer_error.getUsername() + " already exists."; 
    }
}
