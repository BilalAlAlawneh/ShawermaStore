package com.pluralsight.Shawerma;

public class Drink extends MenuItem {
    private DrinkSize size;
    private String flavor;

    public Drink(DrinkSize size, String flavor) {
        super("Drink");
        this.size = size;
        this.flavor = flavor;
    }

    @Override
    public double getPrice() {
        return size.getPrice();
    }

    @Override
    public String getDetails() {
        return size.name().charAt(0) + size.name().substring(1).toLowerCase()
                + " " + flavor + " Drink";
    }
}

