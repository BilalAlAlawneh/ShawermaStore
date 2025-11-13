package com.pluralsight.Shawerma;

import java.util.Scanner;

public class OrderMenu {

    private Shawerma shawerma;
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

                    System.out.println("Drink added");
                    break;
                case 3:

                    System.out.println("Side added");
                    break;

                case 4:
                    System.out.println("🧾 Order Details:");

                    if (shawerma != null) {
                        System.out.println(shawerma);// Prints using Shawerma's toString()
                        System.out.println(shawerma.getPrice());
                    } else {
                        System.out.println("❌ No Shawerma in your order.");
                    }

                    ordering = false; // Ends the order menu
                    break;
                case 0:
                    System.out.println("Order cancelled, back to main menu");
                    ordering = false;
                    break;

                default:
                    System.out.println("Invalid option. Try Again");
            }
        }
    }

}
