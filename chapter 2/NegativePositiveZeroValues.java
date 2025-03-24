//Exercise  2.32 (Negative, Positive and Zero Values) Write a program that inputs five numbers and determines and
// prints the number of negative numbers input, the number of positive numbers input and the number of zeros input. 


import java.util.InputMismatchException;
import java.util.Scanner;

public class NegativePositiveZeroValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int negativeCount = 0;
        int positiveCount = 0;
        int zeroCount = 0;

        // Prompt user to enter five numbers
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int number = getIntegerInput(scanner);

            // Update counts
            if (number < 0) {
                negativeCount++;
            } else if (number > 0) {
                positiveCount++;
            } else {
                zeroCount++;
            }
        }

        // Display results
        System.out.println("Negative numbers: " + negativeCount);
        System.out.println("Positive numbers: " + positiveCount);
        System.out.println("Zeros: " + zeroCount);
    }

    //  method to get integer input from user
    private static int getIntegerInput(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); // Clear invalid input
            }
        }
    }
}