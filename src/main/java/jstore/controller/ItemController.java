package jstore.controller;
import jstore.*;
import org.springframework.web.bind.annotation.*;
import java.util.Calendar;
import java.util.*;

public class ItemController {

    @RequestMapping(value = "/items", method = RequestMethod.GET)
    public ArrayList<Item> itemsList()
    {
        ArrayList<Item> tempDatabaseItem = DatabaseItem.getItemDatabase();
        return tempDatabaseItem;
    }

    @RequestMapping(value = "/items/{id_item}", method = RequestMethod.GET)
    public Item getItemFromID(@PathVariable int id)
    {
        Item tempItem = DatabaseItem.getItemFromID(id);
        return tempItem;
    }

}