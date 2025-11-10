package com.pluralsight.Shawerma;

import java.util.Scanner;

public class OrderMenu {

    Scanner scanner = new Scanner(System.in);

    public void startOrdering(){
        boolean ordering = true;

        while (ordering){

            System.out.println("\n🧾 ORDER MENU:");
            System.out.println("1) Add Shawarma");
            System.out.println("2) Add Drink");
            System.out.println("3) Add Side");
            System.out.println("4) View Order & Checkout");
            System.out.println("0) Cancel Order");

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 1:

                    System.out.println("Shawerma added");
                    ShawermaBuilder Shawerma = new ShawermaBuilder();
                    Shawerma.BuildShawerma;
                    break;
                case 2:

                    System.out.println("Drink added");
                    break;
                case 3:

                    System.out.println("Side added");
                    break;

                case 4:
                    System.out.println("Order details:");
                    //classes called here for details and confirmation of checkout
                    ordering = false;
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
