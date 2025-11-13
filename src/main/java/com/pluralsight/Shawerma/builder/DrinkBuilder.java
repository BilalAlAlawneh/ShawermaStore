package com.pluralsight.Shawerma.builder;

import com.pluralsight.Shawerma.MenuItem.Drink;
import com.pluralsight.Shawerma.MenuItem.DrinkSize;

import java.util.Scanner;

public class DrinkBuilder {
    private DrinkSize size;
    private String flavor;

    Scanner scanner = new Scanner(System.in);

    public Drink buildDrink(){
        System.out.println("Choose your drink type:");
        System.out.println("1) Cola");
        System.out.println("2) Lemonade");
        System.out.println("3) Orange Juice");
        System.out.print("Choice: ");

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
                System.out.println("Choose drink size:");
                System.out.println("1) Small ($2.00)");
                System.out.println("2) Medium ($2.50)");
                System.out.println("3) Large ($3.00)");
                System.out.print("Choice: ");

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



