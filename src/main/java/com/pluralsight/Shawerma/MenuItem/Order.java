package com.pluralsight.Shawerma.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<MenuItem> items = new ArrayList<>();

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public double getTotal() {
        return items.stream()
                .mapToDouble(MenuItem::getPrice)
                .sum();
    }

    public String getOrderDetails() {
        StringBuilder details = new StringBuilder();
        for (MenuItem item : items) {
            details.append("- ").append(item.getDetails())
                    .append(" | $").append(String.format("%.2f", item.getPrice()))
                    .append("\n");
        }
        details.append("\n--------------------------");
        details.append("\nTotal: $").append(String.format("%.2f", getTotal()));
        return details.toString();
    }

    public List<MenuItem> getItems() {
        return items;
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public void clearOrder() {
        items.clear();
    }
}
