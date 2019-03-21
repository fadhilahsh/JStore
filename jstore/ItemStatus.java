
/**
 * Enumeration class ItemStatus - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public enum ItemStatus
{
    New("New"), 
    Second("Second"), 
    Refubrished("Refubrished"), 
    Sold("Sold");
    
    private String value;
    ItemStatus(String value)
    {
        this.value=value;
    }
   
    public String toString()
    {
    return value;
}
}
