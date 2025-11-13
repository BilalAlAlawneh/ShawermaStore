package com.pluralsight.Shawerma.builder;

import com.pluralsight.Shawerma.MenuItem.Side;

import java.util.Scanner;
public class SideBuilder {
    private Scanner scanner = new Scanner(System.in);

    public Side buildSide() {
        System.out.println("Choose a side:");
        System.out.println("1) French Fries ($1.50)");
        System.out.println("2) House Salad ($1.50)");
        System.out.print("Your choice: ");

        int choice = scanner.nextInt();
        scanner.nextLine(); // consume newline

        switch (choice) {
            case 1:
                return new Side("French Fries");
            case 2:
                return new Side("House Salad");
            default:
                System.out.println("Invalid choice. Defaulting to French Fries.");
                return new Side("French Fries");
        }
    }
}






