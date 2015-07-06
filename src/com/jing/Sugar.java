package com.jing;

import java.util.Objects;

/**
 * Created by jingjing on 6/30/15.
 */
public class Sugar extends  Ingredient {

    public final String name = "Sugar";
    public final double cost = 0.25;
    @Override
    public double getUnitCost()
    {
        return cost;
    }

    @Override
    public String getName() { return name;}


}
