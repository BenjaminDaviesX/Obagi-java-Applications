import java.util.Arrays;

public class ArrayBinarySearchMethod {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 5, 8}; // Sorted array
        int key = 3; // Number to find

        int index = Arrays.binarySearch(numbers, key); // Search for the key

        System.out.printf("Index: %d%n", index);
    }
}
