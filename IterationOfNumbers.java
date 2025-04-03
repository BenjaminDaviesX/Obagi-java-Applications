public class IterationOfNumbers {
    public static void main(String[] args) {
        System.out.println("Iterating from 1 to 20 while skipping 2, 5, 9, 13, and 19:");

        for (int i = 1; i <= 20; i++) {
           
            if (i == 2 || i == 5 || i == 9 || i == 13 || i == 19) {
                continue;
            }
            System.out.println(i); 
        }
    }
}