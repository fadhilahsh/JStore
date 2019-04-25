package jstore;
/**
 * Write a description of class DatabaseCustomer here.
 *
 * @author Fadhilah
 * @version 2019
 */
import java.util.ArrayList;

public class DatabaseCustomer {
    //instance variables - replace the example below with your own
    //private Customer[] listCustomer;
    private static ArrayList<Customer> CUSTOMER_DATABASE = new ArrayList<Customer>();
    private static int LAST_CUSTOMER_ID = 0;

    public DatabaseCustomer() {
        // initialise instance variables
    }

    public static ArrayList<Customer> getCustomerDatabase() {
        return CUSTOMER_DATABASE;
    }

    public static int getLastCustomerID() {
        return LAST_CUSTOMER_ID++;
    }

    public static boolean addCustomer(Customer customer) throws CustomerAlreadyExistsException {
        boolean found = false;
        for (Customer temp : CUSTOMER_DATABASE) {
            if (temp.getName() == customer.getName() || temp.getEmail() == customer.getEmail()) {
                throw new CustomerAlreadyExistsException(customer);
            }
        }
        CUSTOMER_DATABASE.add(customer);
        LAST_CUSTOMER_ID = customer.getId();
        return true;
    }

    public static Customer getCustomer(int id) {
        for (Customer temp : CUSTOMER_DATABASE) {
            if (temp.getId() == id) {
                return temp;
            }
        }
        return null;
    }

    public static boolean removeCustomer(int id) throws CustomerNotFoundException {
        for (Customer temp : CUSTOMER_DATABASE) {
            if (temp.getId() == id) {
                CUSTOMER_DATABASE.remove(temp);
                return true;
            }
        }
        throw new CustomerNotFoundException(id);
    }

    public static Customer getCustomerLogin(String email, String password)
    {
        for (Customer temp : CUSTOMER_DATABASE)
        {
            if (temp.getEmail() == email && temp.getPassword() == password)
            {
                return temp;
            }
        }
        return null;
    }
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

