import java.util.Scanner;

public class MileageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double totalMiles = 0;
        double totalGallons = 0;

        while (true) {
            // Prompt user for miles driven
            System.out.print("Enter miles driven (-1 to quit): ");
            int miles = input.nextInt();

            if (miles == -1) { // Sentinel value to exit
                break;
            }

            // Prompt user for gallons used
            System.out.print("Enter gallons used: ");
            int gallons = input.nextInt();

            // Calculate miles per gallon for this trip
            double milesPerGallon = (double) miles / gallons;
            System.out.printf("Miles per gallon for this trip: %.2f%n", milesPerGallon);

            // Update totals
            totalMiles += miles;
            totalGallons += gallons;

            // Calculate combined miles per gallon
            double combinedMilesPerGallon = totalMiles / totalGallons;
            System.out.printf("Combined miles per gallon up to this point: %.2f%n", combinedMilesPerGallon);
        }

        System.out.println("Program ended.");
        input.close();
    }
}
