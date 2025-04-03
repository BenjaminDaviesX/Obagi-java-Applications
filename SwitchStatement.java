import java.util.Scanner;

public class SwitchStatement{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter *131# To Subscribe Data");
		System.out.println("Enter *310# To Check Balance");
		System.out.println("Enter *606# To Borrow Data");
		System.out.println("");
		
		System.out.print("Enter Code: ");
		String code = input.nextLine();
		
		switch(code){
			case "*131#":
			{
				System.out.println("Enter 1 for 1 Month Subscription");
				System.out.println("Enter 2 for 2 Month Subscription");
				System.out.println("Enter 3 for 3 Month Subscription");
				System.out.println("Enter 4 for 4 Month Subscription");
				System.out.println("");
				
				System.out.print("Enter Code: ");
				int option = input.nextInt();
				
				switch(option){
					case 1:
					{
						System.out.println(" 1 months Subscription has been activated");
					}
					break;
					
					case 2:
					{
						System.out.println(" 2 months Subscription has been activated");
					}
					break;
					
					case 3:
					{
						System.out.println(" 3 months Subscription has been activated");
					}
					break;
					
					case 4:
					{
						System.out.println(" 4 months Subscription has been activated");
					}
					break;
					
					default:
					System.out.println("Invalid");
				}
				
			}
			break;
			
			case "*310#":
			{
				System.out.println("Your balance is : N764.89");
			}
			break;
			
			case "*606#":
			{
				System.out.println("Enter 1 To Borrow 1000");
				System.out.println("Enter 2 To Borrow 2000");
				System.out.println("Enter 3 To Borrow 3000");
				System.out.println("Enter 4 To Borrow 4000");
				System.out.println("");
				
				
				System.out.print("Enter Code: ");
				int option = input.nextInt();

				switch(option){
					case 1:
					{
						System.out.println(" 1 months Subscription has been activated");
					}
					break;
					
					case 2:
					{
						System.out.println(" 2 months Subscription has been activated");
					}
					break;
					
					case 3:
					{
						System.out.println(" 3 months Subscription has been activated");
					}
					break;
					
					case 4:
					{
						System.out.println(" 4 months Subscription has been activated");
					}
					break;
					
					default:
					System.out.println("Invalid");
				}
			}
			break;
		}

	}
}