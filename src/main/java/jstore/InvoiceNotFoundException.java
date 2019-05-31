package jstore;
/**
 * Write a description of class InvoiceNotFoundException here.
 *
 * @author Fadhilah
 * @version 2019
 */
public class InvoiceNotFoundException extends Exception {
    private int invoice_error;

    public InvoiceNotFoundException(int invoice_input)
    {
        super("Invoice ID: ");
        invoice_error = invoice_input;
    }

    public String getExMessage()
    {
        return super.getMessage() + invoice_error + " not found.";
    }
}