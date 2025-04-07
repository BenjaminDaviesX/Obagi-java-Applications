import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int NUM_EMPLOYEES = 3; // Number of employees
        final double OVERTIME_RATE = 1.5; // Time-and-a-half rate

        for (int i = 1; i <= NUM_EMPLOYEES; i++) {
            System.out.printf("Employee %d:%n", i);

            // Input hours worked and hourly rate
            System.out.print("Enter hours worked last week: ");
            double hoursWorked = input.nextDouble();

            System.out.print("Enter hourly rate: ");
            double hourlyRate = input.nextDouble();

            
            double totalEarning;
            if (hoursWorked <= 40) {
                totalEarning = hoursWorked * hourlyRate; 
            } else {
                double overtimeHours = hoursWorked - 40;
                totalEarning = (40 * hourlyRate) + (overtimeHours * hourlyRate * OVERTIME_RATE); 
            }

            System.out.printf("Total Earning for Employee %d: $%.2f%n%n", i, totalEarning);            
        }

        System.out.println("Program ended.");
        input.close();
    }
}
