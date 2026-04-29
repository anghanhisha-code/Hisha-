public class CommandLineCalc {
    public static void main(String[] args) {

        // Check if two arguments are provided
        if (args.length != 2) {
            System.out.println("Please provide exactly two numbers.");
            return;
        }

        // Convert arguments to double
        double num1 = Double.parseDouble(args[0]);
        double num2 = Double.parseDouble(args[1]);

        // Perform calculation (sum)
        double sum = num1 + num2;

        // Print result
        System.out.println("Sum = " + sum);
    }
}
