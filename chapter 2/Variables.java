
import java.util.Scanner;


public class Variables{ 
	public static void main(String[] args){
	//2.3 Write statements to accomplish each of the following tasks: 
		// Declare Variable and number to be of type int
	int c, thisIsAVariable, q76354, number;
	
	// prompt the user to enter an integer
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter an integer:");
	
	//Input an integer and assign the result to int variable value
	int value = input.nextInt();
	
	//Use method System.out.println. 
	System.out.println("This is a java program");
	
	// Use method System.out.printf and two %s format specifiers, to print on two lines
	System.out.printf("%s %s%n", "This is a java", "program");
	
	// If the variable number is not equal to 7, display "The variable number is not equal to 7”
	number = 5;
	if (number != 7){
		System.out.println("The variable number is not equal to 7");
	  
	  
	// EXERCISE 2.5  Write declarations, statements or comments that accomplish each of the following tasks: 
	// State that a program will calculate the product of three integers. 
	
	int x, y, z, result;
    
	System.out.print("Enter the first integer: ");
    x = input.nextInt();
	
	System.out.print("Enter the second integer: ");
    y = input.nextInt();
    
	System.out.print("Enter the third integer: ");
    z = input.nextInt();

    result = x * y * z;

    System.out.printf("Product is %d%n", result);
	
	//2.14 Write an application that displays the numbers 1 to 4 on the same line,
	//with each pair of adjacent numbers separated by one space. Use the following techniques:
	
	 
	//Using one System.out.println statement

    System.out.println("1 2 3 4");
 
   
   // Using four System.out.print statements
    
	System.out.print("1 ");
    System.out.print("2 ");
    System.out.print("3 ");
    System.out.print("4");
    
	//Using one System.out.printf statement
    System.out.printf("%d %d %d %d%n", 1, 2, 3, 4);
    
	



	
	
	   }
	}
 }
 