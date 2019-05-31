package jstore;
/**
 * Enumeration class InvoiceType - write a description of the enum class here
 *
 * @author fadhilah
 * @version 2019
 */
public enum InvoiceType
{
    Buy("Buy"), Sell("Sell");

    private String strInvoiceType;

    private InvoiceType(String strInvoiceType)
    {
        this.strInvoiceType=strInvoiceType;
    }
    /**
     * @return strInvoiceType
     */
    public String toString()
    {
        return strInvoiceType;
    }
}
