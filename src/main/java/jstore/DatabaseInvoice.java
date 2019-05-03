
/**
 * Write a description of class DatabaseInvoice here.
 *
 * @author fadhilah
 * @version 2019
 */
package jstore;
import java.util.ArrayList;
import java.util.List;

public class DatabaseInvoice
{
    // instance variables - replace the example below with your own

    private static ArrayList<Invoice> INVOICE_DATABASE = new ArrayList<Invoice>();
    private static int LAST_INVOICE_ID = 0;

    /**
     * Constructor for objects of class DatabaseInvoice
     */
    public static ArrayList<Invoice> getInvoiceDatabase()
    {
        return INVOICE_DATABASE;
    }

    public static int getLastInvoiceID()
    {
        return LAST_INVOICE_ID;
    }

    public static boolean addInvoice(Invoice invoice) throws InvoiceAlreadyExistsException
    {

        for(Invoice temp : INVOICE_DATABASE)
        {
            if((temp.getItem() == invoice.getItem()) &&
                    (temp.getCustomer() == invoice.getCustomer()))
            {
                throw new InvoiceAlreadyExistsException(invoice);
            }
        }
        INVOICE_DATABASE.add(invoice);
        LAST_INVOICE_ID = invoice.getId();
        return true;
    }

    public static Invoice getInvoice (int id)
    {
        for(Invoice invoice : INVOICE_DATABASE)
        {
            if(invoice.getId() == id)
            {
                return invoice;
            }
        }
        return null;
    }

    public static ArrayList<Invoice> getActiveOrder(Customer customer) throws CustomerDoesntHaveActiveException
    {
        ArrayList<Invoice> list = new ArrayList<Invoice>();
        boolean found = false;
        for(Invoice temp : INVOICE_DATABASE)
        {
            if(temp.getCustomer() == customer &&
                    temp.getIsActive() == true)
            {
                list.add(temp);
                found = true;

            }
        }
        if(found)
        {
            return list;
        }
        else
        {
            throw new CustomerDoesntHaveActiveException(customer);
        }
    }

    public static boolean removeInvoice(int id)throws InvoiceNotFoundException
    {
        for(Invoice temp : INVOICE_DATABASE)
        {
            if(temp.getId() == id)
            {
                if(temp.getIsActive() == true)
                {
                    temp.setIsActive(false);
                }
                INVOICE_DATABASE.remove(temp);
                return true;
            }
        }
        throw new InvoiceNotFoundException(id);
    }


}
