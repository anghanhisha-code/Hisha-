public class AverageCalculator {

    // Method with throws clause
    public static double average(String[] values)
            throws NullPointerException, NumberFormatException {

        if (values == null) {
            throw new NullPointerException("Array is null");
        }

        double sum = 0;

        for (String val : values) {

            // Check for null element
            if (val == null) {
                throw new NullPointerException("Array element is null");
            }

            // Convert string to double (may throw NumberFormatException)
            double num = Double.parseDouble(val);
            sum += num;
        }

        return sum / values.length;
    }

    public static void main(String[] args) {

        // Test cases
        String[] validData = {"10", "20", "30"};
        String[] invalidNumber = {"10", "abc", "30"};
        String[] nullElement = {"10", null, "30"};

        // 1. Valid input
        try {
            System.out.println("Average (valid): " + average(validData));
        } catch (Exception e) {
            System.out.println("Error: " + e);
        } finally {
            System.out.println("Finished valid test\n");
        }

        // 2. Invalid number
        try {
            System.out.println("Average (invalid number): " + average(invalidNumber));
        } catch (NumberFormatException e) {
            System.out.println("Number format error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Other error: " + e);
        } finally {
            System.out.println("Finished invalid number test\n");
        }

        // 3. Null element
        try {
            System.out.println("Average (null element): " + average(nullElement));
        } catch (NullPointerException e) {
            System.out.println("Null error: " + e.getMessage());
        } finally {
            System.out.println("Finished null element test");
        }
    }
}
