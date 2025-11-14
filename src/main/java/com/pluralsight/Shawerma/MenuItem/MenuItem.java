package com.pluralsight.Shawerma.MenuItem;

public abstract class MenuItem {
    private String name;

    public MenuItem(String name) {
        this.name = name;
    }

    public abstract double getPrice();

    public abstract String getDetails();
}

