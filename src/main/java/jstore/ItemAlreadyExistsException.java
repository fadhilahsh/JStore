package jstore;
/**
 * Write a description of class ItemAlreadyExistsException here.
 *
 * @author Fadhilah
 * @version 2019
 */
import java.lang.Exception;

public class ItemAlreadyExistsException extends Exception
{
    // instance variables - replace the example below with your own
    private Item item_error;

    /**
     * Constructor for objects of class ItemAlreadyExistsException
     */
    public ItemAlreadyExistsException(Item item_input)
    {
       super("Item Name: ");
       this.item_error = item_input;
    }

    
    public String getExMessage()
    {
        System.out.println("\n====Item Already Exists Exception====");
        return super.getMessage() + item_error.getName() + " ,Category: " + item_error.getCategory() +" ,Status: " + item_error.getStatus() + " from: " + item_error.getSupplier().getName()+ " already exists."; 
    }
}
