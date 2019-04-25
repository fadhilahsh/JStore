package jstore;
/**
 * Write a description of class Buy_Paid here.
 *
 * @author Fadhilah
 * @version 2019
 */

import java.util.ArrayList;
import java.text.*;

public class Sell_Paid extends Invoice {

    private static final InvoiceType INVOICE_TYPE = InvoiceType.Sell;
    private static final InvoiceStatus INVOICE_STATUS = InvoiceStatus.Paid;
    private Customer customer;
    private boolean isActive;
    private SimpleDateFormat date = new SimpleDateFormat("dd MMM yyy");

    public Sell_Paid(ArrayList<Integer> item, Customer customer) {
        super(item);
        this.customer = customer;
        isActive = false;
    }

    public Customer getCustomer() {
        return customer;
    }

    public InvoiceStatus getInvoiceStatus() {
        return INVOICE_STATUS;
    }

    public InvoiceType getInvoiceType() {
        return INVOICE_TYPE;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setInvoiceStatus(InvoiceStatus status) {

    }

    @Override
    public String toString() {
        System.out.println("ID = " + super.getId());
        ArrayList<Integer> listItemID = DatabaseInvoice.getInvoice(super.getId()).getItem();
        for (int itemID : listItemID) {
            System.out.println("Item = " +
                    DatabaseItem.getItemFromID(itemID).getName());
            System.out.println("Price = " +
                    DatabaseItem.getItemFromID(itemID).getPrice());
            System.out.println("Supplier ID = " +
                    DatabaseItem.getItemFromID(itemID).getSupplier().getId());
            System.out.println("Supplier name = " +
                    DatabaseItem.getItemFromID(itemID).getSupplier().getName());
        }
        System.out.println("Buy date = " + date.format(super.getDate().getTime()));
        System.out.println("Price total = " + super.getTotalPrice());
        //System.out.println("Customer ID = " + costumer.getId());
        //System.out.println("Customer name = " + costumer.getName());
        System.out.println("Status = " + this.getInvoiceStatus());
        System.out.println("Sell success.");
        return "";
    }
}
     
    /*public void printData(){
        System.out.println("===========INVOICE Sell_Paid==========");
        System.out.println("ID: "+getId());
        System.out.println("Tanggal: "+getDate());
        System.out.println("Item: "+getItem().getName());
        System.out.println("Invoice Status: "+getInvoiceStatus());
        System.out.println("Invoice Type: "+getInvoiceType());
        System.out.println("Total Harga: "+getTotalPrice());                
    }*/
    
    

