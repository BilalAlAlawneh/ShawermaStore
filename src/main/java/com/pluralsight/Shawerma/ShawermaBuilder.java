package com.pluralsight.Shawerma;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShawermaBuilder {
    private String bread;
    private String meat;
    private boolean toasted;
    private ShawermaSize size;
    private double breadPrice = 0.0;
    private double premiumToppingPrice = 0.0;
    private final List<String> regularToppings = new ArrayList<>();
    private final List<String> premiumToppings = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    public Shawerma BuildShawerma(){
        boolean building = true;

        while (building){
            System.out.println("Build your Shawerma ");

            System.out.println("Please pick your size first:");
            System.out.println("1)small");
            System.out.println("2)medium");
            System.out.println("3)large");
            System.out.print("Choice: ");
            int sizeChoice = scanner.nextInt();

            switch (sizeChoice){
                case 1:
                    size = ShawermaSize.SMALL;
                    break;
                case 2:
                    size = ShawermaSize.MEDIUM;
                    break;
                case 3:
                    size = ShawermaSize.LARGE;
                    break;
                default:
                    size = ShawermaSize.MEDIUM;

            }

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
                    System.out.println("2)lavash($1 extra)");
                    System.out.println("3)tortilla($1 extra)");
                    System.out.print("Please choose: ");
                    int breadChoice = scanner.nextInt();

                    switch (breadChoice){
                        case 1:
                            bread = "Pita";
                            breadPrice = 0.0;
                            break;
                        case 2:
                            bread = "Lavash";
                            breadPrice = 1.0;
                            break;
                        case 3:
                            bread = "Tortilla";
                            breadPrice = 1.0;
                            break;
                        default:
                            bread = "Pita";
                            breadPrice = 0.0;
                            break;
                    }
                    break;

                case 2:
                    System.out.println("What type of mean do you want?");
                    System.out.println("1)Chicken");
                    System.out.println("2)lamb");
                    System.out.print("Please choose: ");
                    int meatChoice = scanner.nextInt();
                    switch (meatChoice) {
                        case 1:
                            meat = "Chicken";
                            break;
                        case 2:
                            meat = "Lamb";
                            break;
                        default:
                            meat = "Chicken";
                            break;
                    }
                    break;

                case 3:
                    System.out.println("What type of toppings do you want?");
                    System.out.println("1)Spicy sauce");
                    System.out.println("2)Pomegranate Molasses");
                    System.out.println("3)Extra meat(Premium topping $1 extra)");
                    System.out.println("4)Cheese(Premium topping $1 extra");
                    int toppingChoice = scanner.nextInt();

                    switch (toppingChoice) {
                        case 1:
                            System.out.println("Added Spicy sauce.");
                            regularToppings.add("Spicy Sauce");
                            break;
                        case 2:
                            System.out.println("Added Pomegranate Molasses.");
                            regularToppings.add("Pomegranate Molasses");
                            break;
                        case 3:
                            System.out.println("Added Extra meat.");
                            premiumToppingPrice += 1.00;
                            premiumToppings.add("Extra Meat");
                            break;
                        case 4:
                            System.out.println("Added Cheese.");
                            premiumToppingPrice += 1.00;
                            premiumToppings.add("Extra Cheese");

                            break;
                        default:
                            System.out.println("Invalid choice.");
                    }
                    break;

                case 4:
                    System.out.println("Would you like it toasted?");
                    System.out.print("Choice(yes or no): ");
                    scanner.nextLine();
                    String toasting = scanner.nextLine().toLowerCase();
                    if(toasting.equalsIgnoreCase("yes")){
                        toasted = true;
                    } else if (toasting.equalsIgnoreCase("no")) {
                        toasted = false;
                    }
                    break;

                case 0:
                    System.out.println("Taking you back to main page");
                    building = false;
                    break;
            }
        }
        Shawerma shawerma = new Shawerma(size, bread, meat, toasted, breadPrice, premiumToppingPrice, regularToppings, premiumToppings);
        return shawerma;
    }
}
