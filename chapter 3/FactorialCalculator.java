public class FactorialCalculator {
    public static void main(String[] args) {
        System.out.printf("%-10s %-20s%n", "Number", "Factorial");

        for (int n = 1; n <= 20; n++) {
            long factorial = 1;

            for (int i = 1; i <= n; i++) {
                factorial *= i; 
            }

            System.out.printf("%-10d %-20d%n", n, factorial);
        }
    }
}
//Factorials grow extremely large.
//The factorial of 100 is far beyond the storage capacity of standard data types like long