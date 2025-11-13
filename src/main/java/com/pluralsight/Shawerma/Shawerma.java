package com.pluralsight.Shawerma;

import java.util.ArrayList;
import java.util.List;

public class Shawerma extends MenuItem {
    private ShawermaSize size;
    private String bread;
    private String meat;
    private double breadPrice;
    private boolean toasted;

    private List<String> regularToppings = new ArrayList<>();
    private List<String> premiumToppings = new ArrayList<>();

    public Shawerma(ShawermaSize size, String bread, String meat, double breadPrice, boolean toasted) {
        super("Shawerma");
        this.size = size;
        this.bread = bread;
        this.meat = meat;
        this.breadPrice;
        this.toasted = toasted;
    }

    public void addTopping(String topping) {
        regularToppings.add(topping);
    }

    public void addPremiumTopping(String topping) {
        premiumToppings.add(topping);
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
