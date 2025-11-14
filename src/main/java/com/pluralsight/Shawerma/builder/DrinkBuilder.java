package com.pluralsight.Shawerma.builder;

import com.pluralsight.Shawerma.MenuItem.Drink;
import com.pluralsight.Shawerma.MenuItem.DrinkSize;

import java.util.Scanner;

public class DrinkBuilder {
    private DrinkSize size;
    private String flavor;

    Scanner scanner = new Scanner(System.in);

    public Drink buildDrink(){
        System.out.println("\n========= DRINK =========");
        System.out.println("1️⃣  COLA");
        System.out.println("2️⃣  LEMONADE");
        System.out.println("3️⃣  ORANGE JUICE");
        System.out.println("=================================");
        System.out.print("➡️  Choose an option: ");

        int typeChoice = scanner.nextInt();
        scanner.nextLine(); // consume newline

        switch (typeChoice) {
            case 1:
                flavor = "Cola";
                break;
            case 2:
                flavor = "Lemonade";
                break;
            case 3:
                flavor = "Orange Juice";
                break;
            default:
                System.out.println("Invalid choice. Defaulting to Cola.");
                flavor = "Cola";
        }
        System.out.println("\n========= DRINK SIZE =========");
        System.out.println("1️⃣  SMALL");
        System.out.println("2️⃣  MEDIUM");
        System.out.println("3️⃣  LARGE");
        System.out.println("=================================");
        System.out.print("➡️  Choose an option: ");
                int sizeChoice = scanner.nextInt();
        switch (sizeChoice) {
            case 1:
                size = DrinkSize.SMALL;
                break;
            case 2:
                size = DrinkSize.MEDIUM;
                break;
            case 3:
                size = DrinkSize.LARGE;
                break;
            default:
                System.out.println("Invalid choice. Defaulting to Medium.");
                size = DrinkSize.MEDIUM;
        }

        Drink drink = new Drink(size, flavor);
        return drink;
        }
    }




