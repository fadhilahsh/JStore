
/**
 * Write a description of class Invoice here.
 *
 * @author Fadhilah S Shalihah
 * @version 0.0
 */
public class Supplier
{
    // instance variables - replace the example below with your own
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private String City;
    public static Location location;

    /**
     * Constructor for objects of class Supplier
     */
    public Supplier(int id, String name, String email, String phoneNumber, Location location)
    {
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getId()
    {
     return id;
    }
     public String getName()
    {
     return name;
    }
     public String getEmail()
    {
     return email;
    }
     public String getPhoneNumber()
    {
     return phoneNumber;
    }
    public Location getLocation()
    {
     return location;
    }
     public String getCity()
    {
     return City;
    }
     public void setId(int id)
    {
     this.id=id;
    }
     public void setName(String name)
    {
     this.name=name;
    }
     public void setEmail(String Email)
    {
     this.email=email;
    }
     public void setPhoneNumber(String phoneNumber )
    {
     this.phoneNumber=phoneNumber;
    }
     public void setCity(String city)
    {
    this.City=City;
    }
}
