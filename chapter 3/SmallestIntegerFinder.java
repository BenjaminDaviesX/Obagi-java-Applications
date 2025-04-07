import java.util.Scanner;

public class SmallestIntegerFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first value: ");
        int smallest = input.nextInt(); 

        while (true) {
            System.out.print("Enter the next value (or a smaller number to stop): ");
            int value = input.nextInt();

            if (value < smallest) { 
                System.out.println("You entered a number smaller than the smallest so far.");
                break;
            }

            if (value < smallest) {
                smallest = value;
            }
        }
        System.out.println("The smallest value entered was: " + smallest);
        input.close();
    }
}
