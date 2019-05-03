package jstore.controller;

import jstore.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Calendar;

@RestController
public class ItemController {

    @RequestMapping(value = "/items", method= RequestMethod.GET)
    public ArrayList<Item> itemList()
    {
        ArrayList<Item> list;
        try {
            list = DatabaseItem.getItemDatabase();
        } catch (Exception ex) {
            ex.getMessage();
            return null;
        }
        return list;
    }

    @RequestMapping(value = "/items/{id_item}", method= RequestMethod.GET)
    public Item getItemFromID(@PathVariable int id_item)
    {
        Item item;
        try {
            item = DatabaseItem.getItemFromID(id_item);
        } catch (Exception ex) {
            ex.getMessage();
            return null;
        }
        return item;
    }
}