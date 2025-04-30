import java.util.Scanner;

public class OneDiamentionalArrayOperations {
    public static void main(String[] args) {
        // a) Setting the 10 elements of integer array counts to zero.
        int[] counts = new int[10];

        // b) Adding one to each of the 15 elements of integer array bonus
        int[] bonus = new int[15];
        for (int i = 0; i < bonus.length; i++) {
            bonus[i] += 1;
        }

        // c) Displaying the five values of integer array bestScores in column format.  
        int[] bestScores = {95, 87, 78, 92, 88};

        System.out.println("Counts array:");
        for (int num : counts) {
            System.out.print(num + " ");
        }
        System.out.println("\n");

        System.out.println("Bonus array:");
        for (int num : bonus) {
            System.out.print(num + " ");
        }
        System.out.println("\n");

        System.out.println("Best Scores:");
        for (int score : bestScores) {
            System.out.println(score);
        }
    }
}
