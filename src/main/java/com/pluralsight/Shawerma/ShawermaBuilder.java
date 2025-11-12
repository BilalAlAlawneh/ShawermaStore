package com.pluralsight.Shawerma;
import java.sql.SQLOutput;
import java.util.Scanner;

public class ShawermaBuilder {
    Scanner scanner = new Scanner(System.in);

    public void BuildShawerma(){
        boolean building = true;

        while (building){
            System.out.println("Build your Shawerma ");

            System.out.println("Please pick your size first:");
            System.out.println("1)small");
            System.out.println("2)medium");
            System.out.println("3)large");
            System.out.print("Choice: ");
            int size = scanner.nextInt();

            System.out.println("Now customize your Shawerma:");
            System.out.println("1)type of bread");
            System.out.println("2)type of meat");
            System.out.println("3)toppings");
            System.out.println("0)back to order menu ");

            System.out.print("Please choose: ");
            int choice = scanner.nextInt();

            switch(choice){
                case 1:
                    System.out.println("What type of bread do you need?");
                    System.out.println("1)pita");
                    System.out.println("2)lavash");
                    System.out.println("3)tortilla");
                    System.out.print("Please choose: ");
                    break;

                case 2:
                    System.out.println("What type of mean do you want?");
                    System.out.println("1)Chicken");
                    System.out.println("2)lamb");
                    System.out.print("Please choose: ");
                    break;

                case 3:
                    System.out.println("What type of toppings do you want?");
                    System.out.println("1)Spicy sauce");
                    System.out.println("2)Pomegranate Molasses");
                    System.out.println("3)Extra meat(Premium topping $1 extra)");
                    System.out.println("4)Cheese(Premium topping $1 extra");
                    break;

                case 0:
                    System.out.println("Taking you back to main page");
                    building = false;
                    break;
            }

        }
    }
}
