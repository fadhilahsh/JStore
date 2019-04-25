package jstore;
/**
 * Write a description of class CustomerDoesntHaveActiveException here.
 *
 * @author Fadhilah
 * @version 2019
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
    this.customer_error = customer_input;
    }

    public String getExMessage()
    {
        System.out.println("\n====Customer Doesnt Have Active Exception====");
        return super.getMessage() + customer_error + " \nDoesnt have active invoice";
    }
}
