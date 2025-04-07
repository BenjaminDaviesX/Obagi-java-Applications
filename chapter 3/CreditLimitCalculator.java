import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of customers: ");
        int numberOfCustomers = input.nextInt(); // Fixed number of iterations

        for (int i = 1; i <= numberOfCustomers; i++) {
            System.out.printf("%nCustomer %d:%n", i);

            // Input customer details
            System.out.print("Enter account number: ");
            int accountNumber = input.nextInt();

            System.out.print("Enter balance at the beginning of the month: ");
            int beginningBalance = input.nextInt();

            System.out.print("Enter total of all items charged this month: ");
            int charges = input.nextInt();

            System.out.print("Enter total of all credits applied this month: ");
            int credits = input.nextInt();

            System.out.print("Enter allowed credit limit: ");
            int creditLimit = input.nextInt();

            // Calculate the new balance
            int newBalance = beginningBalance + charges - credits;

            // Display the new balance
            System.out.printf("New balance for account %d: %d%n", accountNumber, newBalance);

            // Check if the credit limit is exceeded
            if (newBalance > creditLimit) {
                System.out.println("Credit limit exceeded");
            }
        }

        System.out.println("Program ended.");
        input.close();
    }
}
