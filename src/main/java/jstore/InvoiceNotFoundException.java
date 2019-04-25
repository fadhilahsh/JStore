package jstore;
/**
 * Write a description of class InvoiceNotFoundException here.
 *
 * @author Fadhilah
 * @version 2019
 */
public class InvoiceNotFoundException extends Exception 
{
    // instance variables - replace the example below with your own
    private int invoice_error;

    /**
     * Constructor for objects of class InvoiceNotFoundException
     */
    public InvoiceNotFoundException(int invoice_input)
    {
        super("Invoice ID: ");
        this.invoice_error = invoice_input;
    }

    public String getExMessage()
    {
        System.out.println("\n====Invoice Not Found Exception====");
        return super.getMessage() + invoice_error + " not found."; 
    }
}
