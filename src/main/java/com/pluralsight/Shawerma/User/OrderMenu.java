package com.pluralsight.Shawerma.User;

import com.pluralsight.Shawerma.MenuItem.Drink;
import com.pluralsight.Shawerma.MenuItem.ReceiptWriter;
import com.pluralsight.Shawerma.MenuItem.Shawerma;
import com.pluralsight.Shawerma.MenuItem.Side;
import com.pluralsight.Shawerma.builder.DrinkBuilder;
import com.pluralsight.Shawerma.builder.ShawermaBuilder;
import com.pluralsight.Shawerma.builder.SideBuilder;

import java.util.Scanner;

public class OrderMenu {

    private Order order = new Order();

    Scanner scanner = new Scanner(System.in);

    public void startOrdering() {
        boolean ordering = true;

        while (ordering) {

            System.out.println("\n========= 🧾 ORDER MENU =========");
            System.out.println("1️⃣  Add Shawarma");
            System.out.println("2️⃣  Add Drink");
            System.out.println("3️⃣  Add Side");
            System.out.println("4️⃣  View Order & Checkout");
            System.out.println("0️⃣  Cancel Order");
            System.out.println("=================================");
            System.out.print("➡️  Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:

                    ShawermaBuilder builder = new ShawermaBuilder();
                    Shawerma shawerma = builder.BuildShawerma();// Save it to the field
                    order.addItem(shawerma);
                    System.out.println("✅ Shawerma added to your order.");
                    break;
                case 2:
                    DrinkBuilder drinkBuilder = new DrinkBuilder();
                    Drink drink = drinkBuilder.buildDrink();
                    order.addItem(drink);
                    System.out.println("✅ Added: " + drink.getDetails());
                    break;
                case 3:
                    SideBuilder sideBuilder = new SideBuilder();
                    Side side = sideBuilder.buildSide();
                    order.addItem(side);
                    System.out.println("✅ Added: " + side.getDetails());
                    break;
                case 4:
                    if (order.isEmpty()) {
                        System.out.println("❌ Your order is empty.");
                        break;
                    }

                    // Show order summary
                    System.out.println("\n🧾 Your Order:");
                    System.out.println(order.getOrderDetails());

                    // Ask to confirm or cancel
                    System.out.println("\n========= 🧾 ORDER MENU =========");
                    System.out.println("1️⃣  Confirm Order");
                    System.out.println("2️⃣  Cancel Order");
                    System.out.println("=================================");
                    System.out.print("➡️  Choose an option: ");
                    int confirmChoice = scanner.nextInt();
                    scanner.nextLine();

                    switch (confirmChoice) {
                        case 1:
                            ReceiptWriter.writeReceipt(order);
                            System.out.println("✅ Order confirmed! Receipt saved.");
                            order.clearOrder();
                            break;

                        case 2:
                            order.clearOrder();
                            System.out.println("❌ Order canceled.");
                            break;

                        default:
                            System.out.println("Invalid option.");
                    }

                    break;
                case 0:
                    order = null;
                    System.out.println("Order cancelled, back to main menu");
                    ordering = false;
                    break;

                default:
                    System.out.println("Invalid option. Try Again");
            }
        }
    }
}
