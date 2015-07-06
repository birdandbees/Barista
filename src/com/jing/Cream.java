package com.jing;

/**
 * Created by jingjing on 6/30/15.
 */
public class Cream extends Ingredient {
    public final String name = "Cream";
    public final double cost = 0.25;
    @Override
    public double getUnitCost()
    {
        return cost;
    }

    @Override
    public String getName() { return name;}
}
