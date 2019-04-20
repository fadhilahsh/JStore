
/**
 * Write a description of class DatabaseInvoice here.
 *
 * @author Fadhilah S S
 * @version 18-04-2019
 */


import java.util.ArrayList;
public class DatabaseInvoice
{
    //variabel yang dipakai
    private static ArrayList<Invoice> INVOICE_DATABASE = new ArrayList<Invoice>();
    private static int LAST_INVOICE_ID=0;

    //Menambah supplier
    public static ArrayList<Invoice> getInvoiceDatabase()
    {
        return INVOICE_DATABASE;
    }
    
    public static int getLastInvoiceID()
    {
        return LAST_INVOICE_ID;
    }
    
    /**
     * Method addSupplier()
     * @param supplier
     * @return false
     */
    public static boolean addInvoice(Invoice invoice)throws InvoiceAlreadyExistsException
    {
        for(Invoice temp : INVOICE_DATABASE)
        {
            if((temp.getItem() == invoice.getItem()) ||
                    (temp.getCustomer() == invoice.getCustomer()))
            {
                throw new InvoiceAlreadyExistsException(invoice);
            }
        }
        INVOICE_DATABASE.add(invoice);
        LAST_INVOICE_ID = invoice.getId();
        return true;
    }
 
    
    public static Invoice getInvoice(int id)
    {
        for(Invoice invoice : INVOICE_DATABASE)
        {
            if(invoice.getId()==id)
            {
                return invoice;
            }
        }
        return null;
    }

    public static ArrayList<Invoice> getActiveOrder(Customer customer)throws CustomerDoesntHaveActiveException
    {
        ArrayList<Invoice> list = new ArrayList<Invoice>();
        boolean found = false;
        for(Invoice temp : INVOICE_DATABASE)
        {
            if(temp.getCustomer() == customer &&
                temp.getIsActived() == true)
            {
                list.add(temp);
                found = true;
            }
            else
            {
                throw new CustomerDoesntHaveActiveException(customer);
            }
        }
        if(found)
        {
            return list;
        }
        else
        {
            return null;
        }
    }
    
    //Menghapus supplier
    /**
     * Method remove Supplier()
     * @param supplier
     */
    public static boolean removeInvoice(int id)
    {
        for(Invoice temp : INVOICE_DATABASE) 
        {
            if(temp.getId() == id) 
            {
                if(temp.getIsActived() == true) 
                {
                    temp.setIsActive(false);
                    INVOICE_DATABASE.remove(temp);
                    return true;
                }
            }
        }
        return false;
    }
    /*public static boolean removeInvoice(int id)throws InvoiceNotFoundException
    {
        for(Invoice temp : INVOICE_DATABASE) 
        {
            if(temp.getId() == id) 
            {
                if(temp.getIsActived() == true) 
                {
                    temp.setIsActive(false);
                }
                INVOICE_DATABASE.remove(temp);
                return true;
            }
        }
        throw new InvoiceNotFoundException(id);
    }*/
}