import java.util.Scanner;

public class MultiplicationTables {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scan.nextInt();

        System.out.println("The first 15 multiples of " + num);

        int i = 1;
        while (i <= 15) {
            System.out.println(num * i);
            i++;
        }
    }
}