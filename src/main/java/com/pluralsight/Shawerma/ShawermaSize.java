package com.pluralsight.Shawerma;

public enum ShawermaSize {
    SMALL(5.50, 1.00, 0.75),
    MEDIUM(7.00, 2.00, 1.50),
    LARGE(8.50, 3.00, 2.25);

    private final double basePrice;
    private final double meatPrice;
    private final double premiumToppingPrice;

    ShawarmaSize(double basePrice, double meatPrice, double premiumToppingPrice) {
        this.basePrice = basePrice;
        this.meatPrice = meatPrice;
        this.premiumToppingPrice = premiumToppingPrice;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public double getMeatPrice() {
        return meatPrice;
    }

    public double getPremiumToppingPrice() {
        return premiumToppingPrice;
    }
}

