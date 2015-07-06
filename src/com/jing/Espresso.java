package com.jing;

/**
 * Created by jingjing on 6/30/15.
 */
public class Espresso extends Ingredient {
    public final String name = "Espresso";
    public final double cost = 1.10;
    @Override
    public double getUnitCost()
    {
        return cost;
    }

    @Override
    public String getName() { return name;}
}
