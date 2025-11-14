package com.pluralsight.Shawerma.MenuItem;

public enum ShawermaSize {
    SMALL(5.50, 0.75),
    MEDIUM(7.00, 1.50),
    LARGE(8.50, 2.25);

    private final double basePrice;
    private final double premiumToppingPrice;

    ShawermaSize(double basePrice, double premiumToppingPrice) {
        this.basePrice = basePrice;
        this.premiumToppingPrice = premiumToppingPrice;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public double getPremiumToppingPrice() {
        return premiumToppingPrice;
    }
}

