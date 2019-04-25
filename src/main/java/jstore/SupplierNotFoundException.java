package jstore;
/**
 * Write a description of class SupplierNotFoundException here.
 *
 * @author Fadhilah
 * @version 2019
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

    public String getExMessage()
    {
        System.out.println("\n====Supplier Not Found Exception====");
        return super.getMessage() + supplier_error + " not found.";  
    }
}
