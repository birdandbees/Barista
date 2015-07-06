package com.jing;

/**
 * Created by jingjing on 6/30/15.
 */
public class SteamedMilk extends Ingredient {
    public final String name = "Steamed Milk";
    public final double cost = 0.35;
    @Override
    public double getUnitCost()
    {
        return cost;
    }

    @Override
    public String getName() { return name;}
}
