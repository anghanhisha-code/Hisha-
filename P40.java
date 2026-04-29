public class DivisionDemo {
    public static void main(String[] args) {

        try {
            // Check if enough arguments are provided
            if (args.length < 2) {
                throw new ArrayIndexOutOfBoundsException("Please provide numerator and denominator.");
            }

            // Convert command-line arguments to integers
            int numerator = Integer.parseInt(args[0]);
            int denominator = Integer.parseInt(args[1]);

            // Perform division
            int result = numerator / denominator;

            System.out.println("Numerator: " + numerator);
            System.out.println("Denominator: " + denominator);
            System.out.println("Result: " + result);

        } 
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } 
        catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid integers only.");
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Missing command-line arguments.");
        } 
        catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }
}
