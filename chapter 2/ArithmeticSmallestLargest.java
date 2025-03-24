//EXERCISE 2.17Write an application that inputs three integers from the user and 
//displays the sum, average, product, smallest and largest of the numbers.  

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticSmallestLargest {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        // Prompt user to enter three integers
    System.out.println("Enter three integers:");
	int num1 = getIntegerInput(scanner, "Enter first integer: ");
    int num2 = getIntegerInput(scanner, "Enter second integer: ");
    int num3 = getIntegerInput(scanner, "Enter third integer: ");

        // Calculate sum
    int sum = num1 + num2 + num3;

        // Calculate average (integer representation)
    int average = sum / 3;

        // Calculate product
    int product = num1 * num2 * num3;

        // Determine smallest number
    int smallest = num1;
    if (num2 < smallest) {
    smallest = num2;
        }
    if (num3 < smallest) {
		smallest = num3;
        }

        // Determine largest number
    int largest = num1;
    if (num2 > largest) {
    largest = num2;
        }
    if (num3 > largest) {
    largest = num3;
    }

        // Display results
    System.out.println("Sum: " + sum);
    System.out.println("Average: " + average);
    System.out.println("Product: " + product);
    System.out.println("Smallest: " + smallest);
    System.out.println("Largest: " + largest);

    
        // Helper method to get integer input from user
    private static int getIntegerInput(Scanner scanner, String prompt) {
    while (true) {
    try {
    System.out.print(prompt);
    return scanner.nextInt();
            }
    catch (InputMismatchException e) {
    System.out.println("Invalid input. Please enter an integer.");
    scanner.next(); // Clear invalid input
            }
        }
    }
}
