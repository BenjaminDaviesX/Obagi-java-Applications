import java.util.Scanner;

public class SalesCommission {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        int[] salaryCounts = new int[9]; 

        System.out.println("Enter sales figures (-1 to stop):");
        while (true) {
            System.out.print("Sales Amount: ");
            double sales = scanner.nextDouble();
            if (sales == -1)
				break; 

            int salary = (int) (200 + 0.09 * sales); 

           
            if (salary >= 200 && salary <= 299) salaryCounts[0]++;
            else if (salary >= 300 && salary <= 399) salaryCounts[1]++;
            else if (salary >= 400 && salary <= 499) salaryCounts[2]++;
            else if (salary >= 500 && salary <= 599) salaryCounts[3]++;
            else if (salary >= 600 && salary <= 699) salaryCounts[4]++;
            else if (salary >= 700 && salary <= 799) salaryCounts[5]++;
            else if (salary >= 800 && salary <= 899) salaryCounts[6]++;
            else if (salary >= 900 && salary <= 999) salaryCounts[7]++;
            else salaryCounts[8]++;
        }

        String[] ranges = {
            "$200-299", "$300-399", "$400-499", "$500-599",
            "$600-699", "$700-799", "$800-899", "$900-999", "$1000 and over"
        };

        System.out.println("\nSalespeople salary distribution:");
        for (int i = 0; i < salaryCounts.length; i++) {
            System.out.println(ranges[i] + ": " + salaryCounts[i]);
        }
    }
}
