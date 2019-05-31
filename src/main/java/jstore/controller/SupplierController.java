package jstore.controller;

import jstore.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Calendar;

@RestController
public class SupplierController {
    @RequestMapping(value = "/suppliers", method= RequestMethod.GET)
    public ArrayList<Supplier> suppliersList(){
        return DatabaseSupplier.getSupplierDatabase();
    }

    @RequestMapping(value = "/suppliers/{id_supplier}", method = RequestMethod.GET)
    public Supplier getSupplier(@PathVariable int id_supplier) {
        return DatabaseSupplier.getSupplier(id_supplier);
    }
}