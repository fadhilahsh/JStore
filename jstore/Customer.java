
/**
 * Write a description of class Customer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
import java.text.*;
import java.util.regex.*;
import java.text.SimpleDateFormat;

public class Customer
{
    // instance variables - replace the example below with your own
    private String name, email, username, password;
    private int id;
    private Calendar birthDate;
    private SimpleDateFormat dateFormat = new SimpleDateFormat ("dd MMM yyy");
    
    /**
     * Constructor for objects of class Customer
     */
    public Customer(String name, String email, String username, String password, Calendar birthDate)
    {
       this.name = name;
       //Pattern.matches("\\w+[\\_-\\.]?\\w+\\@", email);  
       this.email = email;
       this.username = username;
       this.password = password;
       id = DatabaseCustomer.getLastCustomerID()+1;
       this.birthDate = birthDate;   
    }
    
    public Customer(String name, String email, String username, String password, int id, int year, int month, int dayOfMonth) 
    {
       this.name = name;
       this.email = email;
       this.username = username;
       this.password = password;
       id = DatabaseCustomer.getLastCustomerID()+1;
       this.birthDate = new GregorianCalendar(year, (month-1), dayOfMonth);
    }
   
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getName()
    {
        return name ;
    }
    public String getEmail()
    {
        return email ;
    }
    public String getUsername()
    {
        return username ;
    }
    public String getPassword()
    {
        return password ;
    }
    public int getId()
    {
        return id ;
    }
    public Calendar getBirthDate()
    {
        System.out.println("Birth date: " + dateFormat.format(birthDate.getTime()));
        return birthDate;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setEmail(String email)
    {
        String pattern =  "^[a-zA-Z0-9_+&*-]+(?:\\."+"[a-zA-Z0-9_+&*-]+)*@"+"(?:[a-zA-Z0-9-]+\\.)+[a-z]" +"[A-Z]{2,7}$";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(email);
        if (m.find()) {
            System.out.println("Email : " + m.group());
            this.email = email;
        } else {
            System.out.println("Email : null");
            this.email = email;
        }
    }
     public void setUsername(String username)
    {
         this.username=username;
    }
    public void setPassword(String password)
    {
        String pattern ="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{6,}$";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(password);
        if(m.find())
        {
            System.out.println("Password: NULL");
            this.password = password;
        }
        else
        {
            System.out.println("Password null");
            this.password = "Null";
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
    public void setBirthDate(int year,int month,int dayOfMonth)
    {
         this.birthDate=new GregorianCalendar(year,month-1,dayOfMonth);
    }
    public String toString()
    {
        return "Customer"+
        "\nNama: "+name+
        "\nUsername: "+username+
        "\nEmail: "+email+
        "\nPassword: "+password;
    }
   
    
}
