/**
 * Kelas JStore merupakan main menu dari Objek JStore 
 *
 * @author Fadhilah Siti Shalihah
 * @version 28/02/2019
 */
public class JStore
{
    public JStore()
    {
        
    }

    /**
     * Fungsi utama yang akan dijalankan
     */    
    public static void main(String[] args)
    {
	Location lokasi = new Location ("Bandung", "Jawa Barat", "Dingin");
	Supplier sup = new Supplier (1, "Fadhilah", "fadhilah568@gmil.com", "082214318257", lokasi);
	Item item1 = new Item(2, "Pensil", 2, ItemStatus.New, 20000, sup, ItemCategory.Stationery);
	DatabaseItem.addItem(item1);

       Transaction.orderNewItem(DatabaseItem.getItem());
       Transaction.sellItemPaid(DatabaseItem.getItem());
       Transaction.sellItemUnpaid(DatabaseItem.getItem());
       Transaction.sellItemInstallment(DatabaseItem.getItem());
    }
}