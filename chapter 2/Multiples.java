
 //2.26 (Multiples) Write an application that reads two integers, 
 //determines whether the first is a multiple of the second and prints the resul

import java.util.InputMismatchException;
import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter two integers
        System.out.print("Enter first integer: ");
        int num1 = getIntegerInput(scanner);

        System.out.print("Enter second integer: ");
        int num2 = getIntegerInput(scanner);

        // Check if num1 is a multiple of num2
        if (num2 != 0) {
            if (num1 % num2 == 0) {
                System.out.println(num1 + " is a multiple of " + num2);
            } else {
                System.out.println(num1 + " is not a multiple of " + num2);
            }
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }

    //  method to get integer input from user
    private static int getIntegerInput(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); 
            }
        }
    }
}