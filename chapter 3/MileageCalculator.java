import java.util.Scanner;

public class MileageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double totalMiles = 0;
        double totalGallons = 0;

        while (true) {

            System.out.print("Enter miles driven (-1 to quit): ");
            int miles = input.nextInt();

            if (miles == -1) {
                break;
            }

            System.out.print("Enter gallons used: ");
            int gallons = input.nextInt();

            double milesPerGallon = (double) miles / gallons;
            System.out.printf("Miles per gallon for this trip: %.2f%n", milesPerGallon);

            totalMiles += miles;
            totalGallons += gallons;

            double combinedMilesPerGallon = totalMiles / totalGallons;
            System.out.printf("Combined miles per gallon up to this point: %.2f%n", combinedMilesPerGallon);
        }

        System.out.println("Program ended.");
        input.close();
    }
}
