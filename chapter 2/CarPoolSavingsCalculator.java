//EXERCISE 2.35 creste an application that calculates your daily driving cost...

import java.util.Scanner;

public class CarPoolSavingsCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter total miles driven per day: ");
        double milesDriven = getValidDoubleInput(scanner);

        System.out.print("Enter cost per gallon of gasoline: $");
        double costPerGallon = getValidDoubleInput(scanner);

        System.out.print("Enter average miles per gallon: ");
        double milesPerGallon = getValidDoubleInput(scanner);

        System.out.print("Enter parking fees per day: $");
        double parkingFees = getValidDoubleInput(scanner);

        System.out.print("Enter tolls per day: $");
        double tolls = getValidDoubleInput(scanner);

        // Calculate daily driving cost
        double dailyDrivingCost = calculateDailyDrivingCost(milesDriven, costPerGallon, milesPerGallon, parkingFees, tolls);

        // Display result
        System.out.printf("Your daily driving cost is: $%.2f%n", dailyDrivingCost);
    }

    private static double getValidDoubleInput(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextDouble();
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Clear invalid input
            }
        }
    }

    private static double calculateDailyDrivingCost(double milesDriven, double costPerGallon, double milesPerGallon, double parkingFees, double tolls) {
        double fuelCost = (milesDriven / milesPerGallon) * costPerGallon;
        return fuelCost + parkingFees + tolls;
    }
}