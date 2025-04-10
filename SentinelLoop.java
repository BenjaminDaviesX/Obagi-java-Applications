import java.util.Scanner;

public class SentinelLoop{
   public static void main(String[] args){
	   Scanner input = new Scanner(System.in);
	   
        int sum = 0;
		double average;
		int pro = 1;
		int counter = 0;
		
		while (true){
			System.out.print("Enter number: ");
			int num = input.nextInt();
			
			if(num == -1){
				break;
			}
			counter++;
			sum += num;
			pro *= num;
		}
		average = sum/counter;
		
		System.out.printf("The sum is %d%n",sum);
		System.out.printf("The average is %f%n",average);
		System.out.printf("The product: is %d%n",pro);
   }
}