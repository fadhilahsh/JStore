
/**
 * Write a description of class Customer here.
 *
 * @author fadhilah
 * @version 2019
 */

package jstore;
import java.util.*;
import java.text.*;
import java.util.regex.*;

public class Customer
{
    // inisiasi variable
    private String name;
    private String email;
    private String username;
    private String password;
    private int id;
    private Calendar birthDate;

    /**
     * Constructor for objects of class Customer
     */
    public Customer(int id, String name, String email, String username, String password, Calendar birthDate)
    {
        // initialise instance variables
        this.name=name;
        this.email=email;
        this.username=username;
        this.password=password;
        this.id=id;
        this.birthDate=birthDate;
    }

    public Customer(String name, String email, String username, String password, Calendar birthDate)
    {
        // initialise instance variables
        this.name=name;
        this.email=email;
        this.username=username;
        this.password=password;
        this.id=DatabaseCustomerPostgre.getLastCustomerId()+1;
        this.birthDate=birthDate;
    }

    public Customer(String name, String email, String username, String password, int year, int month, int dayOfMonth)
    {
        this.name=name;
        this.email=email;
        this.username=username;
        this.password=password;
        this.id=DatabaseCustomerPostgre.getLastCustomerId()+1;
        this.birthDate = new GregorianCalendar(year, month, dayOfMonth);
    }

    /**
     * @return    name
     */
    public String getName()
    {
        // put your code here
        return name;
    }
    /**
     * @return    email
     */
    public String getEmail()
    {
        return email;
    }
    /**
     * @return    username
     */
    public String getUsername()
    {
        return username;
    }
    /**
     * @return    password
     */
    public String getPassword()
    {
        return password;
    }
    /**
     * @return    id
     */
    public int getId()
    {
        return id;
    }

    public Calendar getBirthDate()
    {
        System.out.printf("%s %te %<tB %<tY", "Birth date: ", birthDate);
        System.out.println(" ");
        SimpleDateFormat format = new SimpleDateFormat("dd MMMM yyyy");
        System.out.println("Birth date: " + format.format(birthDate.getTime()));
        return birthDate;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    public void setEmail(String email)
    {
        String pattern = "^[a-zA-Z0-9_+&*-]+(?:\\."+"[a-zA-Z0-9_+&*-]+)*@"+"(?:[a-zA-Z0-9-]+\\.)+[a-z"+"A-Z]{2,7}$";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(email);
        if(m.find())
        {
            System.out.println("Email: " +m.group());
        }
        else
        {
            System.out.println("Email: NULL");
        }
    }

    public void setUsername(String username)
    {
        this.username=username;
    }

    public void setPassword(String password)
    {
        String pattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{6,}$";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(password);
        if(m.find())
        {
            System.out.println("Password: " + m.group());
        }
        else
        {
            System.out.println("Password: NULL");
        }
    }

    public void setId(int id)
    {
        this.id=id;
    }

    public void setBirthDate(Calendar birthDate)
    {
        this.birthDate=birthDate;
    }

    public void setBirthDate(int year, int month, int dayOfMonth)
    {
        GregorianCalendar birthDate = new GregorianCalendar(year, month, dayOfMonth);
    }

    public String toString()
    {
        return "\nID: "+id+"\nName: "+name+"\nEmail: "+email+"\nUername: "+username+"\nPassword: "+password+"\nBirth Date: "+getBirthDate().getTime();
    }
}