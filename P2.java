import java.util.Scanner;

public class AddOneToDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 5-digit number: ");
        int num = sc.nextInt();

        int result = 0;
        int place = 1;
        int carry = 0;

        while (num > 0) {
            int digit = num % 10;

            digit = digit + 1 + carry;

            if (digit == 10) {
                digit = 0;
                carry = 1;
            } else {
                carry = 0;
            }

            result = digit * place + result;
            place *= 10;
            num /= 10;
        }

        // If carry is left (for first digit)
        if (carry == 1) {
            result = carry * place + result;
        }

        System.out.println("New number: " + result);
    }
}
