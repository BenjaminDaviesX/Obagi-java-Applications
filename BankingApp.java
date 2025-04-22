import java.util.Scanner;

public  class BankingApp{
	String accountName = "James Williams"; 
	String accountNumber = "502994738";
	double accountBalance = 623738.48;
	
	public double deposit(int amount){
		accountBalance += amount;
		return accountBalance;
	}
	
	public double withdrawal(int amount){
		
		if(amount > accountBalance){
			System.out.println("insufficient funds");
		}
		else{
		accountBalance -= amount;
		}
		return accountBalance;
	}
	public double checkBalance(){
		return accountBalance;
	}
	
	public static void main(String[] args){
		BankingApp bankapp = new BankingApp();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to Davaben Bank");
		System.out.println("Enter 1 to Deposit");
		System.out.println("Enter 2 to Withdraw");
		System.out.println("Enter 3 to Check Balance");
		System.out.println();
		
		System.out.print("Enter your choice ");
		int choice = input.nextInt();
		System.out.println();
		
		switch(choice){
			case 1:
			{
				System.out.print("Enter the amount to deposit: ");
				int depositAmount = input.nextInt();
				
				
				System.out.println("================================");
				
				System.out.println("Account Name: " +bankapp.accountName);
				System.out.println("Account Number: " +bankapp.accountNumber);
				System.out.printf("Initial Balance: %c%.2f%n" ,'$',bankapp.accountBalance);
				
				
				bankapp.deposit(depositAmount);
				System.out.printf("Your total balance is: %c%.2f%n",'$',bankapp.checkBalance());
				System.out.println("=================================");
			}
			break;
			
			case 2:
			{
				System.out.print("Enter the amount to withdraw: ");
				int withdrawalAmount = input.nextInt();
				
				
				System.out.println("================================");
				
				System.out.println("Account Name: " +bankapp.accountName);
				System.out.println("Account Number: " +bankapp.accountNumber);
				System.out.printf("Initial Balance: %c%.2f%n" ,'$',bankapp.accountBalance);
		
				
				bankapp.withdrawal(withdrawalAmount);
				System.out.printf("Your total balance is: %c%.2f%n",'$',bankapp.checkBalance());
				System.out.println("=================================");
			}
			break;
			
			case 3:
			{
				System.out.printf("Your total balance is: %c%.2f%n",'$',bankapp.checkBalance());
				System.out.println("=================================");
			}
			break;
			
			default:
			System.out.println("invalid Option");
		}
	}
}