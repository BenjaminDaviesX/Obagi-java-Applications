public class MultiDimensionalArraysForEvenAndOddNumbers {
    public static void main(String[] args) {
        int[][] numbers = {
            {31, 15, 20, 16},
            {45, 12, 34, 35},
            {18, 17, 54, 28}
        };
		int evenSum = 0; 
        int oddCount = 0; 

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < numbers[4]; col++) {
                if (numbers[row][col] % 2 == 0) { 
                    evenSum += numbers[row][col];
                } else { 
                    oddCount++;
                }
            }
        }
        System.out.printf("The sum of all even numbers is %d%n", evenSum);
        System.out.printf("The count of all odd numbers is %d%n", oddCount);
    }
}


