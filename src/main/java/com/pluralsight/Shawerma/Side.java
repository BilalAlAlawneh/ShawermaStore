package com.pluralsight.Shawerma;

public class Side extends MenuItem {
    private String name;

    public Side(String name){
        super("Side");
        this.name = name;
    }

    @Override
    public double getPrice(){
        return 0.00;
    }

    @Override
    public String getDetails(){
        return "Side: " + name + "(Included)";
    }

}
