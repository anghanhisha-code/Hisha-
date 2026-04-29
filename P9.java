import java.util.Scanner;

public class PasswordValidator {

    public static boolean isValidPassword(String password) {
        // Check length
        if (password.length() < 8) {
            return false;
        }

        int digitCount = 0;

        // Check each character
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            // Check if character is letter or digit
            if (!Character.isLetterOrDigit(ch)) {
                return false;
            }

            // Count digits
            if (Character.isDigit(ch)) {
                digitCount++;
            }
        }

        // Check if at least 2 digits
        return digitCount >= 2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a password: ");
        String password = input.nextLine();

        if (isValidPassword(password)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }

        input.close();
    }
}
