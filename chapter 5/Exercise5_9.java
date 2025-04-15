import java.util.Scanner;

public class Exercise5_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to round: ");
        double x = input.nextDouble();
        double y = Math.floor(x + 0.5);
        System.out.printf("Original: %.2f, Rounded: %.0f%n", x, y);
    }
}