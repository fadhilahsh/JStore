/**
 * Class Supplier berfungsi sebagai informasi supplier dengan lokasi 
 *
 * @author Fadhilah S Shalihah
 * @version 28/02/2019
 */
public class Supplier
{
    //variable yang digunakan
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private Location location;

    /**
     * Constructor untuk objek dari class Supplier
     */
    public Supplier(int id, String name, String email, String phoneNumber, Location location)
    {
     this.id=id;
     this.name=name;
     this.email=email;
     this.phoneNumber=phoneNumber;
     this.location=location;
    }

    /**
     *menampilkan nomor id supplier 
     *
     * @method getId()
     * @return id
     */
    public int getId()
    {
     return id;
    }
    /**
     *menampilkan nama supplier 
     *
     * @method getName()
     * @return name
     */
     public String getName()
    {
     return name;
    }
    /**
     *menampilkan email supplier 
     *
     * @method getEmail()
     * @return email
     */
     public String getEmail()
    {
     return email;
    }
    /**
     *menampilkan nomor hanphone supplier 
     *
     * @method getPhoneNumber()
     * @return phoneNumber
     */
     public String getPhoneNumber()
    {
     return phoneNumber;
    }
    /**
     *menampilkan lokasi supplier 
     * @method getLocation()
     * @return location
     */
    public Location getLocation()
    {
     return location;
    }
    /**
     *mengubah id supplier 
     * @method setId()
     * @param id
     */
     public void setId(int id)
    {
     this.id=id;
    }
    /**
     *mengubah nama supplier 
     * @method setName()
     * @param name
     */
     public void setName(String name)
    {
     this.name=name;
    }
    /**
     *mengubah email supplier 
     * @method setEmail()
     * @param email
     */
     public void setEmail(String Email)
    {
     this.email=email;
    }
    /**
     *mengubah nomor handphone supplier 
     * @method setPhoneNumber()
     * @param phoneNumber
     */
     public void setPhoneNumber(String phoneNumber )
    {
     this.phoneNumber=phoneNumber;
    }
    /**
     *mengubah lokasi supplier 
     * @method setLocation()
     * @param location
     */
     public void setLocation(Location location)
    {
    this.location=location;
    }
     /**
     * menampilkan nama supplier 
     * @method printData()
     */
     public void printData()
    {
        System.out.println("==========SUPPLIER==========");
        System.out.println("ID: " + id);
        System.out.println("Nama: " + name);
        System.out.println("Email: " + email);
        System.out.println("Nomor Telepon: " + phoneNumber);
        System.out.println("Lokasi: " + location);
    
    }
}
