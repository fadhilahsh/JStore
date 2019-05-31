package jstore;
/**
 * Write a description of class Buy_Paid here.
 *
 * @author Fadhilah
 * @version 2019
*/

import java.text.*;
import java.util.ArrayList;

public class Sell_Installment extends Invoice
{
    // instance variables - replace the example below with your own
    private static InvoiceType INVOICE_TYPE=InvoiceType.Sell;
    private static InvoiceStatus INVOICE_STATUS=InvoiceStatus.Installment;
    private int installmentPeriod;
    private int installmentPrice;
    private Customer customer;
//    private boolean isActive;

    /**
     * Constructor for objects of class Sell_Installment
     */
    public Sell_Installment(ArrayList<Integer> item, int installmentPeriod, Customer customer)
    {
        // initialise instance variables
        super(item);
        this.installmentPeriod=installmentPeriod;
        this.customer=customer;
        super.setIsActive(true);
        int total = 0;
        for(int id : item){
            Item temp = DatabaseItem.getItemFromID(id);
            int priceTemp = temp.getPrice();
            total += priceTemp;
        }
        super.totalPrice = total;
        this.installmentPrice = (super.totalPrice/installmentPeriod)*102/100;
    }

    /**
     * method getter untuk mengambil data
     * @return installmentPeriod
     */

    public int getInstallmentPeriod()
    {
        return installmentPeriod;
    }
    /**
     * method getter untuk mengambil data
     * @return installmentPrice
     */
    public int getInstallmentPrice()
    {
        return installmentPrice;
    }
    /**
     * method getter untuk mengambil data
     * @return customer
     */
    public Customer getCustomer()
    {
        return customer;
    }
    /**
     * method getter untuk mengambil data
     * @return Invoice_status
     */
    public InvoiceStatus getInvoiceStatus()
    {
        return INVOICE_STATUS;
    }
    /**
     * method getter untuk mengambil data
     * @return invoice_type
     */
    public InvoiceType getInvoiceType()
    {
        return INVOICE_TYPE;
    }
    /**
     * method getter untuk mengambil data
     * @return installmentPeriod
     */
    public void setInstallmentPrice(int installmentPrice)
    {
        this.installmentPrice=installmentPrice;
    }

    public void setTotalPrice()
    {
        totalPrice=installmentPrice*installmentPeriod;
    }

    public void setCustomer(Customer customer)
    {
        this.customer=customer;
    }

    public String toString()
    {
//       setTotalPrice(0);
//       for (int temp1 : this.getItem())
//       {
//           System.out.println(DatabaseItem.getItemFromID(temp1).toString());
//       }

//       SimpleDateFormat sdf = new SimpleDateFormat ("dd MMMMM yyyy");
//       return "\n========INVOICE========" +
//              "\nID: " +  getId() +
//          //  "\nItem: " + getItem().getName() +
//          //  "\nAmount: "  + getTotalItem() +
//          //  "\nBuy date: " + sdf.format(getDate().getTime()) +
//          //  "\nPrice: " + getItem().getPrice() +
//              "\nTotal price: " + getTotalPrice() +
//              "\nInstallment price: " + installmentPrice +
//          //  "\nSupplier ID: " + getItem().getSupplier().getId() +
//          //  "\nSupplier name: " + getItem().getSupplier().getName() +
//              "\nCustomer ID: " + customer.getId() +
//              "\nCustomer Name: " + customer.getName() +
//              "\nStatus: " + InvoiceStatus.Installment +
//              "\nInstallment period: " + installmentPeriod +
//              "\nSell Success\n";
        StringBuilder total = new StringBuilder();
        for(int i : item){
            Item temp = DatabaseItem.getItemFromID(i);
            String stringTemp = null;
            if (temp != null){
                stringTemp = temp.toString();
                total.append(stringTemp);
            }
            total.append("\n");
        }
        return total.toString();
    }
}
