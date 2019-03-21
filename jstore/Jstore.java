/**
 * Kelas JStore merupakan main menu dari Objek JStore 
 *
 * @author Fadhilah Siti Shalihah
 * @version 28/02/2019
 */
public class JStore
{
    

    /**
     * Fungsi utama yang akan dijalankan
     */    
    public static void main(String[] args)
	{
	Location lokasi = new Location ("Bandung", "Jawa Barat", "Dingin");
	Supplier sup = new Supplier (1, "Fadhilah", "fadhilah568@gmil.com", "082214318257", lokasi);
	Item item = new Item(1, "Fadhilah", 100, 10000, ItemCategory.Electronics, ItemStatus.New, sup);
	lokasi.printData();
	sup.printData();
	DatabaseItem.addItem(item);
        Transaction.orderNewItem(item);
        Transaction.sellItemPaid(item);
        Transaction.sellItemUnpaid(item);
        Transaction.sellItemInstallment(item);
	
	
	}
}