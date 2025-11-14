package com.pluralsight.Shawerma.User;

import java.util.Scanner;

public class ShawermaMenu {
    public static void ShowMenu()throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        int ordering;

        while(running){

            System.out.println("\n========= SHAWERMA STORE =========");
            System.out.println("1️⃣ NEW ORDER");
            System.out.println("0️⃣ EXIT");
            System.out.println("=================================");
            System.out.print("➡️  Choose an option: ");
            ordering = scanner.nextInt();

            switch(ordering){
                case 1:
                    System.out.println("creating your order");
                    OrderMenu order = new OrderMenu();
                    order.startOrdering();
                    break;
                case 0:
                    System.out.println("Thank you, come again");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid, please try again");
                    break;
            }
        }
    }
}