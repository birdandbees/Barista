package com.jing;

/**
 * Created by jingjing on 6/30/15.
 */
public class FoamedMilk extends Ingredient {
    public final String name = "Foamed Milk";
    public final double cost = 0.35;
    @Override
    public double getUnitCost()
    {
        return cost;
    }

    @Override
    public String getName() { return name;}
}
