import java.util.Scanner;

public class MathClassMethods{
   public static void main(String[] args){ 
       Scanner scan = new Scanner(System.in);
	   
	   
       System.out.printf("Enter number: ");
	   double num = scan.nextDouble();
	   
	   System.out.printf("The absolute value is %f%n",Math.abs(num)); //abs (double a)
	   
	   System.out.printf("The rounded value is %d%n",Math.abs(Math.round(num))); //round
	   
	   System.out.printf("%f raise to the power 2 is value is %f%n",num,Math.pow(num,2)); //
	   
	   System.out.printf("The square root of %f is  value is %f%n",num,Math.sqrt(num));//
	   System.out.println("===============================================================");
		
	   System.out.print("Enter first number: ");
	   double num1 = scan.nextDouble();
		
	   System.out.printf("Enter second number: ");
	   double num2 = scan.nextDouble();
	   
	   System.out.printf("The minimum number is %f%n",Math.min(num,num2));
	   
	   System.out.printf("The maximum value is %f%n",Math.max(num,num2));
	   System.out.println("=========================================================");
	   
	   System.out.println("The Area of a circle");
	   
	   double radius;
	   double areaOfCircle;
	   
	   System.out.print("Enter radius: ");
	   radius = scan.nextDouble();
	   
	   areaOfCircle = Math.PI * Math.pow(radius,2);
	   
	   System.out.printf("The area of a circle is %.2f%n",areaOfCircle);
	   
	   

		
   } 
}