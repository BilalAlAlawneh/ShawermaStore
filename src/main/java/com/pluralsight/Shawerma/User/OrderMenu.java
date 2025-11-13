package com.pluralsight.Shawerma.User;

import com.pluralsight.Shawerma.MenuItem.Drink;
import com.pluralsight.Shawerma.MenuItem.Shawerma;
import com.pluralsight.Shawerma.MenuItem.Side;
import com.pluralsight.Shawerma.builder.DrinkBuilder;
import com.pluralsight.Shawerma.builder.ShawermaBuilder;
import com.pluralsight.Shawerma.builder.SideBuilder;

import java.util.Scanner;

public class OrderMenu {

    private Shawerma shawerma;
    private Drink drink;
    private Side side;
    Scanner scanner = new Scanner(System.in);

    public void startOrdering() {
        boolean ordering = true;

        while (ordering) {

            System.out.println("\n🧾 ORDER MENU:");
            System.out.println("1) Add Shawarma");
            System.out.println("2) Add Drink");
            System.out.println("3) Add Side");
            System.out.println("4) View Order & Checkout");
            System.out.println("0) Cancel Order");

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:

                    ShawermaBuilder builder = new ShawermaBuilder();
                    shawerma = builder.BuildShawerma(); // Save it to the field
                    System.out.println("✅ Shawerma added to your order.");
                    break;
                case 2:
                    DrinkBuilder drinkBuilder = new DrinkBuilder();
                     drink = drinkBuilder.buildDrink();
                    System.out.println("✅ Added: " + drink.getDetails());
                    break;
                case 3:
                    SideBuilder sideBuilder = new SideBuilder();
                    side = sideBuilder.buildSide();
                    System.out.println("✅ Added: " + side.getDetails());
                    break;
                case 4:
                    System.out.println("🧾 Order Details:");

                    if (shawerma != null) {
                        System.out.println(shawerma);// Prints using Shawerma's toString()
                        System.out.println(shawerma.getPrice());
                    } else {
                        System.out.println("❌ No items in your order.");
                    }

                    if(drink != null){
                        System.out.println(drink);
                        System.out.println(drink.getPrice());
                    }

                    if(side != null){
                        System.out.println(side);
                        System.out.println(side.getPrice());
                    }

                    ordering = false; // Ends the order menu
                    break;
                case 0:
                    shawerma = null;
                    drink = null;
                    side = null;
                    System.out.println("Order cancelled, back to main menu");
                    ordering = false;
                    break;

                default:
                    System.out.println("Invalid option. Try Again");
            }
        }
    }
}
