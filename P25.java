import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input sides
        System.out.print("Enter side a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter side b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter side c: ");
        double c = scanner.nextDouble();

        // Check triangle validity
        if (a + b > c && a + c > b && b + c > a) {
            
            // Calculate semi-perimeter
            double s = (a + b + c) / 2;

            // Calculate area using Heron's formula
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

            // Display result
            System.out.printf("Area of the triangle: %.2f\n", area);

        } else {
            System.out.println("The given sides do not form a valid triangle.");
        }

        scanner.close();
    }
}
