import java.util.Scanner;

public class SumAndDIfference{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int sumOf6to9 = 0;
		int sumOf4to10 = 0;
		int difference;
		
		for (int i = 1; i<= 10; i++){
			System.out.printf("Enter num%d ",i);
			int num = input.nextInt();
			
			
			
			if(i >= 6 && i <= 9){
				sumOf6to9 += num;
			}
			
			if(i >= 4 && i <= 10){
				sumOf4to10 += num;
			}	
		}
		difference = sumOf4to10 - sumOf6to9;
		
		System.out.printf("The difference is %d",difference);
	}
}	