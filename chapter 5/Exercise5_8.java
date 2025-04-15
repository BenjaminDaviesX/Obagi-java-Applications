import java.util.Scanner;

public class Exercise5_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0.0;

        for (int i = 1; i <= 3; i++) {
            System.out.printf("Enter hours parked for customer %d: ", i);
            double hours = input.nextDouble();
            double charge = calculateCharges(hours);
            total += charge;
            System.out.printf("Customer %d charge: $%.2f%n", i, charge);
        }
        System.out.printf("Total receipts: $%.2f%n", total);
    }

    public static double calculateCharges(double hours) {
        double charge = 2.0;
        if (hours > 3) {
            charge += 0.5 * Math.ceil(hours - 3);
        }
        return Math.min(charge, 10.0);
    }
}