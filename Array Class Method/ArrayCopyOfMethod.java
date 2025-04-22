import java.util.Arrays;

public class ArrayCopyOfMethod{
    public static void main(String[] args) {
        int[] original = {1000, 300, 101, 200, 100};

        int[] copy = Arrays.copyOf(original, original.length); // Copy entire array

        System.out.println(Arrays.toString(copy)); // Print copied array
    }
}
