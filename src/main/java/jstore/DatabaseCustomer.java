
/**
 * Write a description of class DatabaseCustomer here.
 *
 * @author fadhilah
 * @version 2019
 */
package jstore;
import java.util.ArrayList;

public class DatabaseCustomer
{
    // instance variables - replace the example below with your own
    private static ArrayList<Customer> CUSTOMER_DATABASE = new ArrayList<Customer>();
    private static int LAST_CUSTOMER_ID = 0;

    /**
     * Constructor for objects of class DatabaseCustomer
     */
    public DatabaseCustomer()
    {

    }

    public static ArrayList<Customer> getCustomerDatabase()
    {
        return CUSTOMER_DATABASE;
    }

    public static int getLastCustomerID()

    {
        return LAST_CUSTOMER_ID++;
    }

    public static boolean addCustomer(Customer customer)throws CustomerAlreadyExistsException
    {
        boolean found = false;
        for(Customer temp : CUSTOMER_DATABASE)
        {
            if(temp.getName() == customer.getName() || temp.getEmail()
                    == customer.getEmail())
            {
                throw new CustomerAlreadyExistsException(customer);
            }
        }
        CUSTOMER_DATABASE.add(customer);
        LAST_CUSTOMER_ID = customer.getId();
        return true;
    }

    public static Customer getCustomer(int id)
    {
        for(Customer customerDB : CUSTOMER_DATABASE)
        {
            if(customerDB.getId()==id)
            {
                return customerDB;
            }
        }
        return null;
    }

    public static boolean removeCustomer(int id)throws CustomerNotFoundException
    {
        for(Customer temp : CUSTOMER_DATABASE)
        {
            if(temp.getId() == id)
            {
                CUSTOMER_DATABASE.remove(temp);
                return true;
            }
        }
        throw new CustomerNotFoundException(id);
    }

    public static Customer getCustomerLogin(String email, String password){
        int i;
        for(i=0;i<CUSTOMER_DATABASE.size();i++){
            if(CUSTOMER_DATABASE.get(i).getEmail().equals(email) && CUSTOMER_DATABASE.get(i).getPassword().equals(password)){
                return CUSTOMER_DATABASE.get(i);

            }

        }
        return null;
    }

}
