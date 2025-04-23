import java.util.Arrays;

public class ArrayBinarySearchMethod {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 5, 8}; 
        int key = 3; 

        int index = Arrays.binarySearch(numbers, key);

        System.out.printf("Index: %d%n", index);
    }
}
