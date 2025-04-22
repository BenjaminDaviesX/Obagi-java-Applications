import java.security.SecureRandom;

public class SecureAccountNumberGenerator{
    public static void main(String[] args) {
        SecureRandom secureRan = new SecureRandom();
		
        long accountNumber = secureRan.nextLong(2647653987L);
        System.out.printf("Your 10-digit account number is: %d%n", accountNumber);
    }
}
