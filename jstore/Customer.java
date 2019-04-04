
/**
 * Write a description of class Customer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
import java.text.*;
import java.util.regex.*;

public class Customer
{
    // instance variables - replace the example below with your own
    private String name, email, username, password;
    private int id;
    private Calendar birthDate;
    
    /**
     * Constructor for objects of class Customer
     */
    public Customer(String name, String email, String username, String password, int id, Calendar birthDate)
    {
       this.name = name;
       Pattern.matches("\\w+[\\_-\\.]?\\w+\\@", email);  
       this.email = email;
       this.username = username;
       this.password = password;
       this.id = id;
       this.birthDate = birthDate;   
    }
    
    public Customer(String name, String email, String username, String password, int id, int year, int month, int dayOfMonth) 
    {
       this.name = name;
       this.email = email;
       this.username = username;
       this.password = password;
       this.id = id;
       this.birthDate = new GregorianCalendar(year, month, dayOfMonth);
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
        SimpleDateFormat ft = new SimpleDateFormat ("dd MMM yyy");
        System.out.println("Birth Date:" + ft.format(birthDate.getTime()));
        return birthDate;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setEmail(String email)
    {
        String pattern =  "^[a-zA-Z0-9_+&*-]+(?:\\."+  
                            "[a-zA-Z0-9_+&*-]+)*@" +  
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" +  
                            "A-Z]{2,7}$";
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
         if(Pattern.matches("\\w+[\\_\\.\\&\\*\\~]?\\w+\\@\\w+\\-", email))
        {
            this.email = email;
        }
        else
        {
            this.email = "";
        }
    }
    public void setPassword(String password)
    {
        if(Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{6,}$", password))
        {
            this.password = password;
        }
        else
        {
            this.password = "";
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
          
    }
    public String toString()
    {
        return "";
    }
   
    
}
