package jstore;
/**
 * Write a description of class ItemNotFoundException here.
 *
 * @author Fadhilah
 * @version (2019
 */
public class ItemNotFoundException extends Exception{
    private int item_error;

    public ItemNotFoundException(int item_input)
    {
        super("Item ID: ");
        item_error = item_input;
    }

    public String getExMessage()
    {
        return super.getMessage() + item_error + " not found.";
    }
}