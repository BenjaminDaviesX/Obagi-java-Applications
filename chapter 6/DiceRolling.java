import java.util.Random;

public class DiceRolling {
    public static void main(String[] args) {
        Random random = new Random();
        int[] sumCounts = new int[13]; 

        for (int i = 0; i < 36000000; i++) {
            int die1 = random.nextInt(6) + 1; 
            int die2 = random.nextInt(6) + 1; 
            int sum = die1 + die2; 
            sumCounts[sum]++;
        }

        
        System.out.println("Sum | Frequency");
        System.out.println("----------------");
        for (int sum = 2; sum <= 12; sum++) {
            System.out.printf("%2d  | %8d\n", sum, sumCounts[sum]);
        }
    }
}
