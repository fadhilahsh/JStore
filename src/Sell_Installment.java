
/**
 * Write a description of class Buy_Paid here.
 *
 * @author Fadhilah
 * @version 2019
*/
import java.util.ArrayList;
import java.util.Calendar;
public class Sell_Installment extends Invoice
{
    
   private static final InvoiceType INVOICE_TYPE = InvoiceType.Sell;
   private static final InvoiceStatus INVOICE_STATUS = InvoiceStatus.Installment;
   private int installmentPeriod;
   private int installmentPrice;
   private Customer customer;
   private boolean isActive; 
    
  
    public Sell_Installment(ArrayList<Integer> item, int InstallmentPeriod, Customer customer)
    {
         super(item);
         this.installmentPeriod = installmentPeriod;
         //setInstallmentPrice(totalPrice);
         //setTotalPrice(installmentPrice);
         this.customer=customer;
         isActive = true;
    }
    
    public int getInstallmentperiod()
    {
        return installmentPeriod;
    
    }
    public int getInstalllmentPrice()
    {
        return installmentPrice;    
    }
    public Customer getCustomer()
    {
        return customer;    
    }
   
    public InvoiceStatus getInvoiceStatus()
    {
        return INVOICE_STATUS;
    }
    public InvoiceType getInvoiceType()
    {
        return INVOICE_TYPE; 
    }
    
    public void setInstallmentPrice(int totalPrice)
    {
        this.installmentPrice=(totalPrice/installmentPeriod)*102/100;
    }
    public void setTotalPrice()
    {
        this.totalPrice=(installmentPrice*installmentPeriod);
    
    }
    public void setCustomer(Customer customer)
    {
        this.customer=customer;
    }
     public void setInvoiceStatus(InvoiceStatus status)
    {
        
    }
    
    public String toString()
    {
        String string="==========INVOICE=======";
        string += "\nid ="+getId();
        string += "\nBuy date =" + getDate();
        for (Integer invoice : getItem())
        {
            Item item = DatabaseItem.getItemFromID(invoice.intValue());
            string += "\nItem: " + item.getName();
            string += "\nJumlah: " + getItem().size();
            string += "\nHarga: " + item.getPrice();
            string += "\nSupplier id: " + item.getSupplier().getId();
            string += "\nSupplier Name: " + item.getSupplier().getName();
        }
        string += "\nTotal Price: " + getTotalPrice();
        string += "\nInstallment Price: " + installmentPrice;
        string += "\nCustomer id: " + customer.getId();
        string += "\nCustomer Name: " + customer.getName();
        string += "\nStatus: " + INVOICE_STATUS;
        string += "\nInstallment period: " + installmentPeriod;
        string += "\nSell Success";
        return string;
    }
    
}
