package jstore;
/**
 * Enumeration class InvoiceStatus - write a description of the enum class here
 *
 * @author Fadhilah S Shalihah
 * @version 2019
 */
public enum InvoiceStatus
{
    Paid("Paid"), 
    Unpaid("Unpaid"), 
    Installment("Installment");
    
    private String value;
    private InvoiceStatus(String value)
    {
        this.value=value;
    }
    
    public String toString()
    {
    return value;
}
}

    
