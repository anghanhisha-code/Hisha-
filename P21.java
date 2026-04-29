import java.util.Scanner;

public class MeterToFeetConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter distance in meters: ");
        double meters = scanner.nextDouble();

        // Convert meters to feet
        double feet = meters * 3.28084;

        // Display result formatted to two decimal places
        System.out.printf("Distance in feet: %.2f\n", feet);

        scanner.close();
    }
}
