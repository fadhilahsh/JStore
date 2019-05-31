package jstore;
/**
 * Enumeration class ItemStatus - write a description of the enum class here
 *
 * @author fadhilah
 * @version 2019
 */
public enum ItemStatus
{
    New("New"), Second("Second"), Refurbished("Refurbished"), Sold("Sold");

    private String strItemStatus;

    private ItemStatus(String strItemStatus)
    {
        this.strItemStatus=strItemStatus;
    }

    public String toString(){
        return strItemStatus;
    }
}