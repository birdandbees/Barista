package com.jing;

/**
 * Created by jingjing on 6/30/15.
 */
public class Cocoa extends Ingredient {
    public final String name = "Cocoa";
    public final double cost = 0.90;
    @Override
    public double getUnitCost()
    {
        return cost;
    }

    @Override
    public String getName() { return name;}
}
