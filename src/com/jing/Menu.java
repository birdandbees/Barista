package com.jing;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jingjing on 6/30/15.
 */
public class Menu {
    private List<Drink> drink;

    public Menu()
    {
        drink = new ArrayList<Drink>();
        Drink Coffee = new Drink.Builder().coffee(3).sugar(1).cream(1).build("Coffee");
        drink.add(Coffee);
        Drink DecafCoffee = new Drink.Builder().decafCoffee(2).sugar(1).cream(1).build("Decaf Coffee");
        drink.add(DecafCoffee);
        Drink CaffeLatte = new Drink.Builder().espresso(2).steamedMilk(1).build("Caffe Latte");
        drink.add(CaffeLatte);
        Drink CaffeAmericano = new Drink.Builder().espresso(3).build("Caffe Americano");
        drink.add(CaffeAmericano);
        Drink CaffeMocha = new Drink.Builder().espresso(1).cocoa(1).steamedMilk(1).whippedCream(1).build("Caffe Mocha");
        drink.add(CaffeMocha);
        Drink Cappuccino = new Drink.Builder().espresso(2).steamedMilk(1).foamedMilk(1).build("Cappuccino");
        drink.add(Cappuccino);

    }

    public void display(Inventory inventory)
    {
        System.out.println("Menu:");
        for (int i = 0; i < drink.size(); i++)
        {
            System.out.print(i+1);
            System.out.print(",");
            System.out.print(drink.get(i).getName());
            System.out.print(",");
            System.out.print(String.format("%.2f", drink.get(i).getCost()));
            System.out.print(",");
            if ( inventory.checkInventory(drink.get(i)) ) {
                System.out.println("true");
            }else{ System.out.println("false");}
        }

    }
    public Drink getDrinkByIndex(int i)
    {
        return drink.get(i);
    }
}
