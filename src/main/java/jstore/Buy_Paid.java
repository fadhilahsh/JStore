
/**
 * Write a description of class Buy_Paid here.
 *
 * @author fadhilah
 * @version 2019
 */
package jstore;
import java.text.*;
import java.util.ArrayList;



public class Buy_Paid extends Invoice
{
    // instance variables - replace the example below with your own
    private static InvoiceType INVOICE_TYPE=InvoiceType.Buy;
    private static InvoiceStatus INVOICE_STATUS=InvoiceStatus.Paid;
    private boolean isActive = false;

    /**
     * Constructor for objects of class Buy_Paid
     */
    public Buy_Paid(ArrayList<Integer> item)
    {
        // initialise instance variables
        super(item);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @return    invoice_status
     */
    public InvoiceStatus getInvoiceStatus()
    {
        return INVOICE_STATUS;
    }
    /**
     * @return    invoice_type
     */
    public InvoiceType getInvoiceType()
    {
        return INVOICE_TYPE;
    }

    public String toString()
    {
        StringBuilder total = new StringBuilder();
        total.append("===============INVOICE===============\n");
        for(int i : item){
            Item temp = DatabaseItem.getItemFromID(i);
            String stringTemp = null;
            if (temp != null) {
                stringTemp = temp.toString();
                total.append(stringTemp);
            }
            total.append("\n");
        }
        int price = this.getTotalPrice();
        total.append("\nTotal price = ").append(price);
        return total.toString();
    }
}
