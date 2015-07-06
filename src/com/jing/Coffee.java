package com.jing;

/**
 * Created by jingjing on 6/30/15.
 */
public class Coffee extends Ingredient {
    public final String name = "Coffee";
    public final double cost = 0.75;

    @Override
    public double getUnitCost()
    {
        return cost;
    }

    @Override
    public String getName() { return name;}
}
