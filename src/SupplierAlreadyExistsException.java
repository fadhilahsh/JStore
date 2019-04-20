
/**
 * Write a description of class SupplierAlreadyExistsException here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.io.*;
public class SupplierAlreadyExistsException extends Exception
{
    // instance variables - replace the example below with your own
    private Supplier supplier_error;

    /**
     * Constructor for objects of class SupplierAlreadyExistsException
     */
    public SupplierAlreadyExistsException(Supplier supplier_input)
    {
         super("Supplier Email: ");
        this.supplier_error=supplier_input;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    
    public String getExMessage()
    {
        // put your code here
         return super.getMessage() + supplier_error.getEmail() + " ,or phoneNumber: " + supplier_error.getPhoneNumber()+" already exists.";
    }
}
