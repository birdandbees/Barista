package com.jing;

import java.util.Objects;

/**
 * Created by jingjing on 6/30/15.
 */
public abstract class Ingredient {

    public abstract double getUnitCost();
    public abstract String getName();

    public boolean equals(Object obj)
    {
        if (! (obj instanceof Ingredient) )
            return false;
        if ( obj == this)
            return true;

        return ((Ingredient) obj).getName().compareTo(this.getName()) == 0;
    }

    public int hashCode()
    {
        return Objects.hashCode(this.getName());
    }
}
