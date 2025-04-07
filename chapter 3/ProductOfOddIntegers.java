public class ProductOfOddIntegers {
    public static void main(String[] args) {
        int product = 1; 

        for (int i = 1; i <= 15; i += 2) { 
            product *= i; 
        }
        System.out.println("The product of odd integers from 1 to 15 is: " + product);
    }
}
