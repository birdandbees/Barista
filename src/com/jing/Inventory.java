package com.jing;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jingjing on 6/30/15.
 */
public class Inventory {
    private HashMap<Ingredient, Integer> stock = new HashMap<Ingredient, Integer>();
    public boolean checkInventory(Drink drink)
    {

        for ( Map.Entry<Ingredient, Integer>  item : drink.getFormula().entrySet() )
        {
            if ( stock.get(item.getKey()) < item.getValue()) return false;
        }

        return true;
    }
    public void restock(int defaultValue)
    {
        stock.clear();
        stock.put(new Coffee(), defaultValue);
        stock.put(new DecafCoffee(), defaultValue);
        stock.put(new Sugar(), defaultValue);
        stock.put(new Cream(), defaultValue);
        stock.put(new FoamedMilk(), defaultValue);
        stock.put(new SteamedMilk(), defaultValue);
        stock.put(new Espresso(), defaultValue);
        stock.put(new Cocoa(), defaultValue);
        stock.put(new WhippedCream(), defaultValue);

    }

    public Inventory (int defaultValue)
    {
            restock(defaultValue);

    }
    public void display()
    {
        System.out.println("Inventory:");
        for ( Map.Entry<Ingredient, Integer>  item : stock.entrySet() )
        {
            System.out.print(item.getKey().getName());
            System.out.print(",");
            System.out.println(item.getValue());
        }

    }
    public boolean dispense(Drink drink)
    {
         if (checkInventory(drink))
         {   System.out.println("Dispensing: "+drink.getName());
             for ( Map.Entry<Ingredient, Integer>  item : drink.getFormula().entrySet() )
             {
                 stock.put(item.getKey(), stock.get(item.getKey()) - item.getValue() );
             }
             return true;
         }
         System.out.println("Out of stock: " + drink.getName());
         return false;
    }

}
