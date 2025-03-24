//EXERCISE 2.24 (Largest and Smallest Integers) Write an application that reads five integers and
 //determines and prints the largest and smallest integers in the group

import java.util.InputMismatchException;
import java.util.Scanner;

public class LargestSmallestIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter five integers
        System.out.println("Enter five integers:");
        int[] integers = new int[5];
        for (int i = 0; i < 5; i++) {
            integers[i] = getIntegerInput(scanner, "Enter integer " + (i + 1) + ": ");
        }

        // Determine smallest integer
        int smallest = integers[0];
        for (int i = 1; i < 5; i++) {
            if (integers[i] < smallest) {
                smallest = integers[i];
            }
        }

        // Determine largest integer
        int largest = integers[0];
        for (int i = 1; i < 5; i++) {
            if (integers[i] > largest) {
                largest = integers[i];
            }
        }

        // Display results
        System.out.println("Smallest integer: " + smallest);
        System.out.println("Largest integer: " + largest);
    }

 // method to get integer input from user
    private static int getIntegerInput(Scanner scanner, String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next();
				// Clear invalid input
            }
        }
    }
}
