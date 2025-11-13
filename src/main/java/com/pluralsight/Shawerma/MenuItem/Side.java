package com.pluralsight.Shawerma.MenuItem;

public class Side extends MenuItem {
    private String name;

    public Side(String name){
        super("Side");
        this.name = name;
    }

    @Override
    public double getPrice(){
        return 1.50;
    }

    @Override
    public String getDetails(){
        return "Side: " + name;
    }

    @Override public String toString(){
        return getDetails();
    }

}
