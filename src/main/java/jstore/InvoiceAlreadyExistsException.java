package jstore;
/**
 * Write a description of class InvoiceAlreadyExistsException here.
 *
 * @author Fadhilah
 * @version 2019
 */
public class InvoiceAlreadyExistsException extends Exception
{
    // instance variables - replace the example below with your own
    private Invoice invoice_error;

    /**
     * Constructor for objects of class InvoiceAlreadyExistsException
     */
    public InvoiceAlreadyExistsException(Invoice invoice_input)
    {
       super("Invoice with Item list: ");
       this.invoice_error = invoice_input;
    }

    public String getExMessage()
    {
        System.out.println("\n====Invoice Already Exists Exception====");
        return super.getMessage() + invoice_error.getItem() + " already ordered by "  + invoice_error.getCustomer().getUsername();
    }
}
