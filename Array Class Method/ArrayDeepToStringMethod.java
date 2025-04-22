
import java.util.Arrays;

public class ArrayDeepToStringMethod {
    public static void main(String[] args) {
        int[][] numbers = {
            {122, 228, 300},
            {17, 35, 628},
            {40, 50, 20}
        };

        // Use String[][] instead of char[][]
        String[][] names = {
            {"Benjamin", "Victor", "Deborah"},
            {"Karina", "Eunice", "Ujunwa"},
            {"Davies", "Aniekan", "paradise"}
        };

        // Print both arrays separately
		System.out.println(Arrays.deepToString(numbers));
        System.out.println(Arrays.deepToString(names));

    }
}
