import java.util.Scanner;

public class Numbercounter{
    public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		
		int positive = 0;
		int negative =0;
		int zero = 0;
		
		for(int i = 1; i <= 10; i++){
			System.out.print("Enter an integer");
			int num = scan.nextInt();
			
			if (num > 0){
				positive++;
			}
			else if(num < 0){
				negative++;
			}
			else{
				zero++;
			}
		}
		System.out.printf("The number of positive integer is %d%n",positive);
		System.out.printf("The number of negative integer is %d%n",negative);
		System.out.printf("The number of zero integer is %d%n",zero);
	}
}