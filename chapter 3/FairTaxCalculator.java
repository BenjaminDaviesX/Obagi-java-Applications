import java.util.Scanner;

public class FairTaxCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double FAIR_TAX_RATE = 0.23; 

        String[] categories = {"Housing", "Food", "Clothing", "Transportation", "Education", "Health Care", "Vacations"};
        double totalExpenses = 0.0;

        System.out.println("Enter your expenses for the following categories:");

        // Loop through each category to get user input
        for (String category : categories) {
            System.out.print(category + ": $");
            double expense = input.nextDouble();

            if (expense < 0) {
                System.out.println("Expense cannot be negative. Please enter a valid amount.");
                continue;
            }

            totalExpenses += expense; 
        }

        double fairTax = totalExpenses * FAIR_TAX_RATE;

        System.out.printf("%nTotal Expenses: $%.2f%n", totalExpenses);
        System.out.printf("Estimated FairTax: $%.2f%n", fairTax);

        input.close();
    }
}
