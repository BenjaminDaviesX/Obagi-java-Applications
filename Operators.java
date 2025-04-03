public class Operators{
    public static void main(String[] args){
		//ASSignment operators (=) // declaring a variable
		int num1 = 19;   
		int num2 = 5;
		
		
		// compound assignment operators
		// by adding the value of the 2 variables and updating num1
		num1 += num2;
		num1 *= num2;
		
		

		
	//Arithmetic Operator (+,*,-,/,%) used to perform basic mathematical calculation
	// find sum of the above 
	int sum = num1 + num2;
	
	// find the product
	int product = num1 * num2;
	
	// subtract
	int difference = num1 - num2;
	
	//divide when you use the divides it divides and throw away the remaining
	double quotient =(double) num1 / num2;
	
	// modulos %
	int modulos = num1%num2;
	
	// RELATIONAL OPERATORS or COMPARISON (>,<,>=,<=,==,!=) IS USED TO COMPARE TWO VALUES OR VARIABLES
	boolean isLessThan = num1 < num2; 
	boolean isGreaterThan = num1 > num2;
	boolean isGreaterThanOrEqualTo = num1 >= num2; // when you us or it returns true
    boolean isLessThanOrEqualTo = num1 <= num2;
	boolean isEqualTo = num1 == num2;
	boolean isNotEqualTo = num1 != num2;
	
	// logical operators are used to make descisions and are used together with relational operators
	// theyre 3 in num (&&,=amper sign, ||= OR , != NOT  the boolean is used fot the iteration 
	// EXAMPLE: for AND operator &&
	boolean isAndOperator = num1 > num2 && num1 >= num2;
	
	// OR  operator
	boolean isOrOperator = num1 == num2 || num1 >= num2;
	
	// NOT OPERATORS
	boolean isNotOperator = !(num1 == num2 || num1 >= num2);
	
	
	//print the value of sum
	System.out.printf("The sum of the number is: %d%n",sum);
	System.out.printf("The product of the numbers is: %d%n",product);
	System.out.printf("The difference between %d and %d is: %d%n",num1,num2,difference);	
	System.out.printf("The quotient of num1 and num2 is %f%n",quotient);
	System.out.printf("The Remainder between num1 and num2 is: %d%n",modulos);
	System.out.println("====================================================");
	
	System.out.printf("Is %d < %d? %b%n", num1,num2,isLessThan); // false
	System.out.printf("Is %d > %d? %b%n", num1,num2,isGreaterThan); //true
	System.out.printf("Is %d >= %d? %b%n", num1,num2,isGreaterThanOrEqualTo); // true 
	System.out.printf("Is %d <= %d? %b%n", num1,num2,isLessThanOrEqualTo); // false 
	System.out.printf("Is %d == %d? %b%n", num1,num2,isEqualTo); // false
	System.out.printf("Is %d != %d? %b%n", num1,num2,isNotEqualTo); // true
	System.out.println("====================================================");
	
	System.out.printf("Is %d > %d && %d >= %d? %b%n", num1,num2,num1,num2, isAndOperator);
	System.out.printf("Is %d == %d || %d >= %d? %b%n", num1,num2,num1,num2, isOrOperator);
	System.out.printf("Is !(%d == %d || %d >= %d)? %b%n", num1,num2,num1,num2, isNotOperator);
	System.out.printf("The sum of the number is: %d%n",sum);  
	
	
	}
		
}
	