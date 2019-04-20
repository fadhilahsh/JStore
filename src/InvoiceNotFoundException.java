
/**
 * Write a description of class InvoiceNotFoundException here.
 *
 * @author (your name)
 * @version (a version number or a date)
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
        return super.getMessage() + invoice_error + " not found."; 
    }
}
