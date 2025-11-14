package com.pluralsight.Shawerma.builder;

import com.pluralsight.Shawerma.MenuItem.Side;

import java.util.Scanner;
public class SideBuilder {
    private Scanner scanner = new Scanner(System.in);

    public Side buildSide() {
        System.out.println("\n========= SIZE =========");
        System.out.println("1️⃣  FRENCH FRIES");
        System.out.println("2️⃣  HOUSE SALAD");
        System.out.println("=================================");
        System.out.print("➡️  Choose an option: ");

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






