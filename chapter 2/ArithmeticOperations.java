import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter two integers
        System.out.println("Enter two integers:");
        int num1 = getIntegerInput(scanner, "Enter first integer: ");
        int num2 = getIntegerInput(scanner, "Enter second integer: ");

        // Calculate and display sum
        int sum = num1 + num2;
        System.out.println("Sum: " + sum);

        // Calculate and display product
        int product = num1 * num2;
        System.out.println("Product: " + product);

        // Calculate and display difference
        int difference = num1 - num2;
        System.out.println("Difference: " + difference);

        // Check if division is possible
        if (num2 != 0) {
            // Calculate and display quotient
            double quotient = (double) num1 / num2;
            System.out.println("Quotient: " + quotient);

            // Calculate and display modulus (remainder)
            int modulus = num1 % num2;
            System.out.println("Modulus (remainder): " + modulus);
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }

    // Helper method to get integer input from user
    private static int getIntegerInput(Scanner scanner, String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); // Clear invalid input
            }
        }
    }
}
