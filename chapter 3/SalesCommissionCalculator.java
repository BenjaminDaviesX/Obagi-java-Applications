import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double BASE_SALARY = 200.0; // Fixed weekly salary
        final double COMMISSION_RATE = 0.09; // 9% commission rate

        // Item values
        double[] itemValues = {239.99, 129.75, 99.95, 350.89};

        System.out.print("Enter the number of items sold: ");
        int numberOfItemsSold = input.nextInt(); // Ask how many items to process

        double totalSales = 0.0; // To store the sum of item values

        for (int i = 1; i <= numberOfItemsSold; i++) {
            System.out.print("Enter item number (1-4): ");
            int itemNumber = input.nextInt();

            if (itemNumber < 1 || itemNumber > 4) { // Validate item number
                System.out.println("Invalid item number. Please enter a number between 1 and 4.");
                i--; // Repeat current iteration
                continue;
            }

            totalSales += itemValues[itemNumber - 1]; // Add the item's value to total sales
        }

        // Calculate total earnings
        double totalEarnings = BASE_SALARY + (COMMISSION_RATE * totalSales);

        // Display results
        System.out.printf("%nTotal Sales: $%.2f%n", totalSales);
        System.out.printf("Total Earnings: $%.2f%n", totalEarnings);

        input.close();
    }
}
