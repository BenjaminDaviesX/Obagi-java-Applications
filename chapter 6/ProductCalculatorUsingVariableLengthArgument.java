public class ProductCalculatorUsingVariableLengthArgument{
    public static void main(String[] args) {
        System.out.println("Product of (2, 3, 4): " + product(2, 3, 4));
        System.out.println("Product of (5, 10): " + product(5, 10));
        System.out.println("Product of (7, 8, 9, 10): " + product(7, 8, 9, 10));
        System.out.println("Product of (12): " + product(12));
    }

    public static int product(int... numbers) {
        int result = 1;
        for (int num : numbers) {
            result *= num;
        }
        return result;
    }
}
