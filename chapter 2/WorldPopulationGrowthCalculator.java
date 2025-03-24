//Exercise 2.34 (World Population Growth Calculator) Write an application that inputs these values, 
//then displays the estimated world population after one, two, three, four and five years. import java.util.Scanner;
import java.util.Scanner;
public class WorldPopulationGrowthCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter current world population: ");
        long currentPopulation = getValidLongInput(scanner);

        System.out.print("Enter annual world population growth rate (in %): ");
        double growthRate = getValidDoubleInput(scanner);

        // Calculate and display estimated world population after 1-5 years
        System.out.println("Estimated world population after:");
        for (int i = 1; i <= 5; i++) {
            long estimatedPopulation = calculateEstimatedPopulation(currentPopulation, growthRate, i);
            System.out.printf("%d year(s): %,d%n", i, estimatedPopulation);
        }
    }

    private static long getValidLongInput(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextLong();
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid whole number.");
                scanner.next(); // Clear invalid input
            }
        }
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

    private static long calculateEstimatedPopulation(long currentPopulation, double growthRate, int years) {
        return (long) (currentPopulation * Math.pow(1 + growthRate / 100, years));
    }
}