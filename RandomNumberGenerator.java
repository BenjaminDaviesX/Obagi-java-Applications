import java.util.Random;

public class RandomNumberGenerator{
    public static void main(String[] args){ 
	    Random ran = new Random();
		
		Boolean option = ran.nextBoolean();
		System.out.printf("Do you love Java? %b%n",option);
		
		int integer = ran.nextInt();
		System.out.printf("The integer is %d%n",integer);
		
		int integerWithBound = ran.nextInt(100) + 1; // nextInt(int bound) :
		System.out.printf("The integer is %d%n",integerWithBound);
	
		long number = ran.nextLong(); //nextLong():
		System.out.printf("The long integer is %d%n",number);
		
		long numberWithBound = ran.nextLong(8_000_000_000L); // nextLong(with bound) :
		System.out.printf("The integer is %d%n",numberWithBound);
		
		float floatNumber = ran.nextFloat();
        System.out.printf("The number is %f%n", floatNumber);
		
		
		double doublenumber = ran.nextDouble();
        System.out.printf("The double value is %f%n", doublenumber);

		
		

		
	}
}