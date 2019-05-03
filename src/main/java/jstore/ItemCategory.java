package jstore;
/**
 * Enumeration class ItemCategory - write a description of the enum class here
 *
 * @author fadhilah
 * @version 2019
 */
public enum ItemCategory
{
    Electronics("Electronics"), 
    Furniture("Furniture"), 
    Stationery("Stationery");
    
    private String value;
    private ItemCategory(String value)
    {
        this.value=value;
    }
   
    public String toString()
    {
        return value;
    }
    

}


