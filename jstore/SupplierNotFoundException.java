
/**
 * Write a description of class SupplierNotFoundException here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SupplierNotFoundException extends Exception
{
    // instance variables - replace the example below with your own
    private int supplier_error;

    /**
     * Constructor for objects of class SupplierNotFoundException
     */
    public SupplierNotFoundException(int supplier_input)
    {
        super("Supplier ID:");
        this.supplier_error=supplier_input;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    /*
    public int SupplierNotFoundException(int supplier_input)
    {
        // initialise instance variables
        return 0;
    }*/
    public String getExMessage()
    {
        // initialise instance variables
        return super.getMessage() + supplier_error + " not found.";  
    }
}
