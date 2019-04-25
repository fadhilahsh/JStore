package jstore.controller;
import jstore.*;
import org.springframework.web.bind.annotation.*;
import java.util.Calendar;
import java.util.*;

public class SupplierController {

    @RequestMapping(value = "/suppliers", method = RequestMethod.GET)
    public ArrayList<Supplier> supplierList()
    {
        ArrayList<Supplier> tempDatabaseSupplier = DatabaseSupplier.getSupplierDatabase();
        return tempDatabaseSupplier;
    }

    @RequestMapping(value = "/suppliers/{id_supplier}", method = RequestMethod.GET)
    public Supplier getSupplier(@PathVariable int id)
    {
        Supplier tempSupplier = DatabaseSupplier.getSupplier(id);
        return tempSupplier;
    }

}
