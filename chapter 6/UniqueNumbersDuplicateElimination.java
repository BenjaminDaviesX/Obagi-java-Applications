import java.util.Scanner;

public class UniqueNumbersDuplicateElimination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] uniqueNumbers = new int[5]; 
        int count = 0;

        System.out.println("Enter five numbers (10–100):");

        while (count < 5) {
            int num = scanner.nextInt();
            if (num < 10 || num > 100) continue;

            boolean isDuplicate = false;
            for (int i = 0; i < count; i++) {
                if (uniqueNumbers[i] == num) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                uniqueNumbers[count++] = num;
                System.out.print("Unique so far: ");
                for (int i = 0; i < count; i++) System.out.print(uniqueNumbers[i] + " ");
                System.out.println();
            }
        }

        scanner.close();
        System.out.println("Final unique numbers: ");
        for (int num : uniqueNumbers) System.out.print(num + " ");
    }
}
