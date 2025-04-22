import java.util.Arrays;

public class ArrayCompareMethod{
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 4};

        int result = Arrays.compare(a, b); 

        System.out.println(result); 
    }
}
