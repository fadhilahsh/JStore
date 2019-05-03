package jstore;
/**
 * Enumeration class ItemStatus - write a description of the enum class here
 *
 * @author fadhilah
 * @version 2019
 */
public enum ItemStatus
{
    New("New"), 
    Second("Second"), 
    Refubrished("Refubrished"), 
    Sold("Sold");
    
    private String value;
    private ItemStatus(String value)
    {
        this.value=value;
    }
   
    public String toString()
    {
        return value;
    }
    
}
