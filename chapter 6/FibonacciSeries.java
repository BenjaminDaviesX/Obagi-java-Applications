import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a value for n: ");  // Part a Calculate nth Fibonacci number
        int n = scanner.nextInt();
        System.out.println("Fibonacci(" + n + ") = " + fibonacci(n));

       
        findLargestIntFibonacci();  // Part b Find largest Fibonacci number that fits in int

        
        findLargestDoubleFibonacci(); // Part c Use double instead of int
    }

    public static int fibonacci(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;

        int a = 0, b = 1, result = 0;
        for (int i = 2; i <= n; i++) {
            result = a + b;
            a = b;
            b = result;
        }
        return result;
    }

    
    public static void findLargestIntFibonacci() {  // Method to find the largest Fibonacci number that fits in int
        int a = 0, b = 1, result = 0, index = 1;
        while (result >= 0) { // to Stop when integer limit is exceeded
            result = a + b;
            if (result < 0) break; 
            a = b;
            b = result;
            index++;
        }
        System.out.println("Largest Fibonacci in int: Fibonacci(" + (index - 1) + ") = " + a);
    }

    // Method to find the largest Fibonacci number using double
    public static void findLargestDoubleFibonacci() {
        double a = 0, b = 1, result = 0;
        int index = 1;
        while (result < Double.MAX_VALUE) {
            result = a + b;
            if (result > Double.MAX_VALUE) break; 
            a = b;
            b = result;
            index++;
        }
        System.out.println("Largest Fibonacci in double: Fibonacci(" + (index - 1) + ") = " + a);
    }
}
