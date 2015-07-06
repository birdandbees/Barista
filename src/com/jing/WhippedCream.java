package com.jing;

/**
 * Created by jingjing on 6/30/15.
 */
public class WhippedCream extends Ingredient{
    public final String name = "Whipped Cream";
    public final double cost = 1.0;
    @Override
    public double getUnitCost()
    {
        return cost;
    }

    @Override
    public String getName() { return name;}
}
