package jstore;
/**
 * Enumeration class InvoiceType - write a description of the enum class here
 *
 * @author fadhilah
 * @version 2019
 */
public enum InvoiceType
{
    Buy ("Buy"),
    Sell("Sell");
    
    private String value;
    private InvoiceType(String value)
    {
        this.value=value;
    }
    public String toString()
    {
        return value;
    }
}
