package jstore;
/**
 * Write a description of class SupplierAlreadyExistsException here.
 *
 * @author Fadhilah
 * @version 2019
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
    
    public String getExMessage()
    {
        System.out.println("\n====Supplier Already Exists Exception====");
        return super.getMessage() + supplier_error.getEmail() + " ,or phoneNumber: " + supplier_error.getPhoneNumber()+" already exists.";
    }
}
