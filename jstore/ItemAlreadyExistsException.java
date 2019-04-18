
/**
 * Write a description of class ItemAlreadyExistsException here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
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
       item_error = item_input;
    }

    
    public String getExMessage()
    {
        return super.getMessage() + item_error.getName() + " ,Category: " + item_error.getCategory() +
" ,Status: " + item_error.getStatus() + " from: " + item_error.getSupplier().getName()
+ " already exists."; 
    }
}
