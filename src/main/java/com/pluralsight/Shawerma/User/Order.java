package com.pluralsight.Shawerma.User;

import com.pluralsight.Shawerma.MenuItem.MenuItem;

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
    public boolean isEmpty() {
        return items.isEmpty();
    }
    public void clearOrder(){
        items.clear();
    }

    public String getOrderDetails() {
        StringBuilder details = new StringBuilder();
        details.append("================= 🧾 RECEIPT =================\n");
        for (MenuItem item : items) {
            String line = String.format("1x %-30s ....... $%.2f",
                    item.getDetails(), item.getPrice());
            details.append(line).append("\n");
        }
        details.append("---------------------------------------------\n");
        details.append(String.format("TOTAL%35s\n", "➡️   $" + String.format("%.2f", getTotal())));
        details.append("=============================================\n");
        details.append("Thank you for your order! 🙌\n");

        return details.toString();
    }

}
