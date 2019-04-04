/**
 * Class Location berfungsi sebagai informasi lokasi 
 *
 * @author Fadhilah S Shalihah
 * @version 28/02/2019
 */
public class Location
{
    //variabel yang digunakan
    private String province;
    private String description;
    private String city;

    /**
     * Constructor untuk objek dari class Location
     */
    public Location(String city, String province, String description)
    {
        this.city=city;
        this.province=province;
        this.description=description;
    }

    /**
     * Menampilkan nama provinsi
     * @method getprovince()
     * @return province
     */
    public String getProvince()
    {
        return province;
    }
    /**
     * Menampilkan nama kota
     * @method getCity()
     * @return city
     */
    public String getCity()
    {
        return city;
    }
    /**
     * Menampilkan deskripsi
     * @method getDescription()
     * @return description
     */
    public String getDescription()
    {
        return description;
    }
    /**
     * Mengubah nama provinsi
     * @method setprovince()
     * @param province
     */
    public void setProvince(String province)
    {
        this.province=province;
    }
    /**
     * Mengubah nama kota
     * @method setCity()
     * @param city
     */
     public void setCity(String city)
    {
        this.city=city;
    }
    /**
     * Mengubah deskripsi
     * @method setDescription()
     * @param description
     */
     public void setDescription(String description)
    {
        this.description=description;
    }
    /**
     * mencetak nama provinsi
     * Method printData()
     */
    
    /*public void printData()
    {
        System.out.println("==========LOCATION==========");
        System.out.println("Provinsi: " + this.province);
        System.out.println("Kota: " + this.city);
        System.out.println("Deskripsi: " + this.description);
    
    }*/
}
