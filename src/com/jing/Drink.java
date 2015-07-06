package com.jing;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jingjing on 6/30/15.
 */
public class Drink {

    private final HashMap<Ingredient, Integer> formula = new HashMap<Ingredient, Integer>();
    private final String Name;
    public static class Builder {
        private int coffee = 0;
        private int decafCoffee = 0;
        private int sugar = 0;
        private int cream = 0;
        private int steamedMilk = 0;
        private int foamedMilk = 0;
        private int espresso = 0;
        private int cocoa = 0;
        private int whippedCream = 0;


        public Builder coffee(int unit)
        {
            coffee = unit;
            return this;
        }
        public Builder decafCoffee(int unit)
        {
            decafCoffee = unit;
            return this;
        }
        public Builder sugar(int unit)
        {
            sugar = unit;
            return this;
        }

        public Builder cream(int unit)
        {
            cream = unit;
            return this;
        }
        public Builder steamedMilk(int unit)
        {
            steamedMilk = unit;
            return this;
        }
        public Builder foamedMilk(int unit)
        {
            foamedMilk = unit;
            return this;
        }
        public Builder espresso(int unit)
        {
            espresso = unit;
            return this;
        }
        public Builder cocoa(int unit)
        {
            cocoa = unit;
            return this;
        }
        public Builder whippedCream(int unit)
        {
            whippedCream = unit;
            return this;
        }
        public  Drink build(String name)
        {
            return new Drink(this, name);
        }
    }

        private Drink(Builder builder, String name)
        {
            this.Name = name;
            if ( builder.coffee != 0 )
                formula.put(new Coffee(), builder.coffee);
            if ( builder.decafCoffee != 0)
                formula.put(new DecafCoffee(), builder.decafCoffee);
            if ( builder.sugar != 0)
                formula.put(new Sugar(), builder.sugar);
            if ( builder.cream != 0)
                formula.put(new Cream(), builder.cream);
            if ( builder.steamedMilk != 0)
                formula.put(new SteamedMilk(), builder.steamedMilk);
            if ( builder.foamedMilk != 0)
                formula.put(new FoamedMilk(), builder.foamedMilk);
            if ( builder.espresso != 0)
                formula.put(new Espresso(), builder.espresso);
            if ( builder.cocoa != 0)
                formula.put(new Cocoa(), builder.cocoa);
            if ( builder.whippedCream != 0)
                formula.put(new WhippedCream(), builder.whippedCream);
        }
     public HashMap<Ingredient, Integer> getFormula() { return formula;} ;
    public String getName() { return Name;} ;
    public double getCost()
    {
        double price = 0;
        for ( Map.Entry<Ingredient, Integer> item: formula.entrySet())
        {
                 price += item.getKey().getUnitCost() * item.getValue().intValue();
        }
            return price;
    };
}
