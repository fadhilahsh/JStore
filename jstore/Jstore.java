/**
 * Kelas JStore merupakan main menu dari Objek JStore 
 *
 * @author Fadhilah Siti Shalihah
 * @version 28/02/2019
 */
public class JStore
{
    // instance variables - replace the example below with your own

    /**
     * konstruktor untuk objek dari kelas JStore
     */
    public JStore()
    {
        // initialise instance variables
    }

    /**
     * Fungsi utama yang akan dijalankan
     */    
    public static void main(String[] args)
	{
	Location lokasi = new Location ("Bandung", "Jawa Barat", "Dingin");
	Supplier Dila = new Supplier (1, "Fadhilah", "fadhilah568@gmil.com", "082214318257", lokasi);
	/*Item Barang = new Item (1, "samsung", 1, 1000, "Gadget", Dila);
	Invoice tagihan = new Invoice (1, Barang, "20-11-18", 2000);*/
	
	lokasi.printData();
	Dila.printData();
	//Barang.printData();
	
	Transaction pay = new Transaction();
	pay.orderNewItem(Dila);
	pay.orderSecondItem(Dila);
	pay.orderRefubrishedItem(Dila);
	pay.sellItemPaid(Database.getItem());
	pay.sellItemUnpaid(Database.getItem());
	pay.sellItemInstallment(Database.getItem());
	}
}