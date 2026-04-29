import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user
        System.out.print("Enter a single letter: ");
        char ch = scanner.next().charAt(0);

        // Convert to lowercase for easy comparison
        ch = Character.toLowerCase(ch);

        // Check if alphabet
        if (ch >= 'a' && ch <= 'z') {
            // Check vowel or consonant
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("It is a vowel.");
            } else {
                System.out.println("It is a consonant.");
            }
        } else {
            System.out.println("Invalid input. Please enter an alphabet.");
        }

        scanner.close();
    }
}
