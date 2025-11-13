package com.pluralsight.Shawerma;

import java.util.ArrayList;
import java.util.List;

public class Shawerma extends MenuItem {
    private ShawermaSize size;
    private String bread;
    private String meat;
    private boolean toasted;

    private double breadPrice;
    private double premiumToppingPrice;

    private List<String> regularToppings = new ArrayList<>();
    private List<String> premiumToppings = new ArrayList<>();


    public Shawerma(ShawermaSize size, String bread, String meat, boolean toasted,
                    double breadPrice, double premiumToppingPrice,
                    List<String> regularToppings, List<String> premiumToppings) {
        super("Shawerma");
        this.size = size;
        this.bread = bread;
        this.meat = meat;
        this.toasted = toasted;
        this.breadPrice = breadPrice;
        this.premiumToppingPrice = premiumToppingPrice;
        this.regularToppings = regularToppings;
        this.premiumToppings = premiumToppings;
    }


    @Override
    public double getPrice() {
    double total = size.getBasePrice();
    total += size.getMeatPrice();
    total += premiumToppings.size() * size.getPremiumToppingPrice() +
    breadPrice;
        return total;
}

    @Override
    public String getDetails() {
        return size.name().charAt(0) + size.name().substring(1).toLowerCase() + " Shawarma on " + bread +
                " with " + meat + (toasted ? " (Toasted)" : "") +
                "\nRegular Toppings: " + regularToppings +
                "\nPremium Toppings: " + premiumToppings;
    }
}
