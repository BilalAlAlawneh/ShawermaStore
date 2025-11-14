package com.pluralsight.Shawerma.builder;
import com.pluralsight.Shawerma.MenuItem.Shawerma;
import com.pluralsight.Shawerma.MenuItem.ShawermaSize;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShawermaBuilder {
    private String bread;
    private String meat;
    private boolean toasted;
    private ShawermaSize size;
    private double breadPrice = 0.0;
    private final List<String> regularToppings = new ArrayList<>();
    private final List<String> premiumToppings = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    public Shawerma BuildShawerma(){
        boolean building = true;

        while (building){
            System.out.println("Build your Shawerma 🥙");

            System.out.println("\n========= SIZE =========");
            System.out.println("1️⃣  SMALL");
            System.out.println("2️⃣  MEDIUM");
            System.out.println("3️⃣  LARGE");
            System.out.println("=================================");
            System.out.print("➡️  Choose an option: ");
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

            boolean customizing = true;
            while(customizing) {
                System.out.println("\n========= CUSTOMIZATION =========");
                System.out.println("1️⃣  BREAD");
                System.out.println("2️⃣  MEAT");
                System.out.println("3️⃣  TOPPINGS");
                System.out.println("4️⃣  TOASTED");
                System.out.println("0️⃣  MAIN PAGE");

                System.out.println("=================================");
                System.out.print("➡️  Choose an option: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("\n========= BREAD =========");
                        System.out.println("1️⃣ PITA");
                        System.out.println("2️⃣ LAVASH ($1 EXTRA)");
                        System.out.println("3️⃣ TORTILLA ($1 EXTRA)");
                        System.out.println("=================================");
                        System.out.print("Please choose: ");
                        int breadChoice = scanner.nextInt();

                        switch (breadChoice) {
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
                        System.out.println("\n========= MEAT =========");
                        System.out.println("1️⃣ CHICKEN");
                        System.out.println("2️⃣ MEAT");
                        System.out.println("=================================");
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
                        System.out.println("\n========= TOPPINGS =========");
                        System.out.println("1️⃣ SPICY SAUCE");
                        System.out.println("2️⃣ POMEGRANATE MOLASSES");
                        System.out.println("3️⃣ EXTRA MEAT($0.75 for SMALL, $1.50 for MEDIUM, $2.25 for LARGE)");
                        System.out.println("4️⃣ CHEESE($0.75 for SMALL, $1.50 for MEDIUM, $2.25 for LARGE)");
                        System.out.println("=================================");
                        System.out.print("Please choose: ");
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
                                premiumToppings.add("Extra Meat");
                                break;
                            case 4:
                                System.out.println("Added Cheese.");
                                premiumToppings.add("Extra Cheese");

                                break;
                            default:
                                System.out.println("Invalid choice.");
                        }
                        break;

                    case 4:
                        System.out.println("\n========= TOASTED =========");
                        System.out.print("➡️ (yes or no): ");
                        scanner.nextLine();
                        String toasting = scanner.nextLine().toLowerCase();
                        while (!toasting.equals("yes") && !toasting.equals("no")) {
                            System.out.print("❌ Please type only 'yes' or 'no': ");
                            toasting = scanner.nextLine().toLowerCase();
                        }
                        if (toasting.equalsIgnoreCase("yes")) {
                            toasted = true;
                        } else if (toasting.equalsIgnoreCase("no")) {
                            toasted = false;
                        }
                        break;

                    case 0:
                        System.out.println("\n========= MAIN PAGE =========");
                        building = false;
                        customizing = false;
                        break;
                    default:
                        System.out.println("Invalid choice");
                }

            }
        }
        Shawerma shawerma = new Shawerma(size, bread, meat, toasted, breadPrice, regularToppings, premiumToppings);
        return shawerma;
    }
}
