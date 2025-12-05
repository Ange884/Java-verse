package SmartHome;

import SmartHome.appliances.*;
import SmartHome.utils.*;
import SmartHome.Threads.ApplianceThread;

import java.util.*;

public class SmartHomeMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Appliance> appliances = new ArrayList<>();

        System.out.println("Welcome to SmartHome System!");

        // Step 1: Add appliances dynamically
        System.out.print("How many appliances do you want to add?: ");
        int numAppliances = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < numAppliances; i++) {
            System.out.println("\nEnter details for appliance #" + (i + 1));

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Power usage (W): ");
            double power = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("Select type: 1.Light  2.Fan  3.Heater  4.TV");
            int typeChoice = scanner.nextInt();
            scanner.nextLine(); // clear newline

            Appliance appliance = null;

            switch (typeChoice) {
                case 1:
                    appliance = new Light(name, power);
                    break;
                case 2:
                    appliance = new Fan(name, power);
                    break;
                case 3:
                    appliance = new Heater(name, power);
                    break;
                case 4:
                    appliance = new TV(name, power);
                    break;
                default:
                    System.out.println("Invalid type! Skipping appliance.");
            }

            if (appliance != null) {
                appliances.add(appliance);
                System.out.println(name + " added successfully!");
            }
        }

        // Step 2: User Menu
        int choice;
        do {
            System.out.println("\n==== SMART HOME MENU ====");
            System.out.println("1. Show all appliances");
            System.out.println("2. Turn ON an appliance");
            System.out.println("3. Turn OFF an appliance");
            System.out.println("4. Use an appliance");
            System.out.println("5. Show total consumption of all appliances");
            System.out.println("6. Sort by name");
            System.out.println("7. Sort by power usage");
            System.out.println("8. Filter appliances >100W");
            System.out.println("9. Run multithreaded simulation");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // clear input

            switch (choice) {

                case 1:
                    System.out.println("\n=== All Appliances ===");
                    for (int i = 0; i < appliances.size(); i++) {
                        Appliance a = appliances.get(i);
                        System.out.println((i + 1) + ". " + a.getName() + " | Power: " + a.getPowerUsage() + "W | ON: " + a.isOn());
                    }
                    break;

                case 2:
                    System.out.print("Enter appliance number to turn ON: ");
                    int onIndex = scanner.nextInt() - 1;
                    appliances.get(onIndex).turnOn();
                    break;

                case 3:
                    System.out.print("Enter appliance number to turn OFF: ");
                    int offIndex = scanner.nextInt() - 1;
                    appliances.get(offIndex).turnOff();
                    break;

                case 4:
                    System.out.print("Which appliance to use? Enter number: ");
                    int useIndex = scanner.nextInt() - 1;

                    System.out.print("Enter hours to use: ");
                    double hours = scanner.nextDouble();

                    try {
                        appliances.get(useIndex).useFor(hours);
                        appliances.get(useIndex).performFunction();
                    } catch (InvalidOperationException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 5:
                    double total = 0;
                    for (Appliance a : appliances) {
                        total += a.getTotalConsumption();
                    }
                    System.out.println("Total energy consumption: " + total + " Wh");
                    break;

                case 6:
                    Collections.sort(appliances);
                    System.out.println("Sorted by name:");
                    appliances.forEach(a -> System.out.println(a.getName()));
                    break;

                case 7:
                    appliances.sort(new PowerComparator());
                    System.out.println("Sorted by power usage:");
                    appliances.forEach(a -> System.out.println(a.getName() + " => " + a.getPowerUsage()));
                    break;

                case 8:
                    System.out.println("Appliances > 100W:");
                    appliances.stream()
                            .filter(a -> a.getPowerUsage() > 100)
                            .forEach(a -> System.out.println(a.getName()));
                    break;

                case 9:
                    System.out.println("Running multithreaded simulation...");
                    for (Appliance a : appliances) {
                        new ApplianceThread(a).start();
                    }
                    break;

                case 0:
                    System.out.println("Exiting Smart Home System...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 0);

        scanner.close();
    }
}
