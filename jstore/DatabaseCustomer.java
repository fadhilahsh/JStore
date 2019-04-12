/**
 * Write a description of class DatabaseCustomer here.
 *
 * @author 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class DatabaseCustomer
{
    // instance variables - replace the example below with your own
    //private Customer[] listCustomer;
    private static ArrayList<Customer> CUSTOMER_DATABASE = new ArrayList<Customer>();
    private static int LAST_CUSTOMER_ID = 0;
    public DatabaseCustomer()
    {
        // initialise instance variables
    }

    public static ArrayList<Customer> getCustomerDatabase()
    {
        return CUSTOMER_DATABASE;
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static int getLastCustomerID()
    {
        return LAST_CUSTOMER_ID;
    }
   
    public static boolean addCustomer(Customer customer)
    {
        boolean value = false;
        for(Customer customerDB : CUSTOMER_DATABASE)
        {
            if(customer.getName()!=customerDB.getName()&&customer.getEmail()!=customerDB.getEmail())
            {
                CUSTOMER_DATABASE.add(customer);
                LAST_CUSTOMER_ID=customer.getId();
                value=true;
            }
        }
        return value;
    }
    
    public static boolean removeCustomer(int id)
    {
        boolean value = false;
        for(Customer customerDB : CUSTOMER_DATABASE)
        {
            if(customerDB.getId()==id)
            {
            CUSTOMER_DATABASE.remove(id);    
            value= true;
        }
        }
        return value;
    }
    
    public static Customer getCustomer(int id)
    {
        Customer value = null;
        for(Customer customerDB : CUSTOMER_DATABASE)
        {
            if(customerDB.getId()==id)
            {
                value=customerDB;
            }
        }
        return value;
    }
    /*
    public static boolean addCustomer(Customer customer)
    {
        // put your code here
        return false;
    }
    public static boolean removeCustomer(Customer customer)
    {
        // put your code here
        return true;
    }
    public static void getCustomer()
    {
        // put your code here
        return ;
    }
    public Customer[] getListCustomer()
    {
        // put your code here
        return listCustomer;
    }
    */
}
