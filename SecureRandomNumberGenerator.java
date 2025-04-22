import java.security.SecureRandom;

public class SecureRandomNumberGenerator{
    public static void main(String[] args){ 
	    SecureRandom secureRan = new SecureRandom();
		
		Boolean option = secureRan.nextBoolean();
		System.out.printf("Do you love Java? %b%n",option);
		
		int integer = secureRan.nextInt();
		System.out.printf("The integer is %d%n",integer);
		
		int integerWithBound = secureRan.nextInt(100) + 1; // nextInt(int bound) :
		System.out.printf("The integer is %d%n",integerWithBound);
	
		long number = secureRan.nextLong(); //nextLong():
		System.out.printf("The long integer is %d%n",number);
		
		long numberWithBound = secureRan.nextLong(8_000_000_000L); // nextLong(with bound) :
		System.out.printf("The integer is %d%n",numberWithBound);
		
		float floatNumber = secureRan.nextFloat();
        System.out.printf("The number is %f%n", floatNumber);
	}
}