package com.pluralsight.Shawerma.User;

import java.util.Scanner;

public class ShawermaMenu {
    public static void ShowMenu()throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        int ordering;

        while(running){

            System.out.println("Welcome to the shawerma store:");
            System.out.println("Press 1 for new order");
            System.out.print("Press 0 to exit: ");
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