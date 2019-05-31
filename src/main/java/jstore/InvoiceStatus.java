package jstore;
/**
 * Enumeration class InvoiceStatus - write a description of the enum class here
 *
 * @author Fadhilah S Shalihah
 * @version 2019
 */
public enum InvoiceStatus
{
    Paid("Paid"), Unpaid("Unpaid"), Installment("Installment");

    private String strInvoiceStatus;

    private InvoiceStatus(String strInvoiceStatus)
    {
        this.strInvoiceStatus=strInvoiceStatus;
    }
    /**
     * @return strInvoiceStatus
     */
    public String toString(){
        return strInvoiceStatus;
    }
}
    
