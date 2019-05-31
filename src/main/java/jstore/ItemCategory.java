package jstore;
/**
 * Enumeration class ItemCategory - write a description of the enum class here
 *
 * @author fadhilah
 * @version 2019
 */
public enum ItemCategory
{
    Electronics("Electronics"), Furniture("Furniture"), Stationery("Stationery");

    private String strItemCategory;

    private ItemCategory(String strItemCategory)
    {
        this.strItemCategory=strItemCategory;
    }

    public String toString(){
        return strItemCategory;
    }
}


