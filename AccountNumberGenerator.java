import java.util.Random;

public class AccountNumberGenerator {
    public static void main(String[] args) {
        Random random = new Random();
        long accountNumber = 2975352890L + random.nextLong(2647653987L);
        System.out.printf("Your 10-digit account number is: %d%n", accountNumber);
    }
}
