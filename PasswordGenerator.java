import java.util.Random;

public class PasswordGenerator{
    public static void main(String[] args){
        Random random = new Random();

        // Define the characters to include in the password
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        // Initialize an empty password
        String password = "";

        // Generate an 8-character random password
        for (int i = 0; i < 8; i++) {
            password += characters.charAt(random.nextInt(characters.length()));
        }

        // Print the generated password
        System.out.println("Your generated password is: " + password);
    }
}
