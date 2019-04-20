
/**
 * Write a description of class InvoiceAlreadyExistsException here.
 *
 * @author (your name)
 * @version (a version number or a date)
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
       invoice_error = invoice_input;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getExMessage()
    {
        return super.getMessage() + invoice_error.getItem() + " already ordered by "  +
invoice_error.getCustomer().getUsername(); 
    }
}
