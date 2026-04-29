class VotingApp {

    // Method to check eligibility
    public void checkEligibility(int age) {

        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above to vote");
        } else {
            System.out.println("You are eligible to vote.");
        }
    }
}

public class VotingTest {
    public static void main(String[] args) {

        VotingApp app = new VotingApp();

        int[] testAges = {16, 20, 18};

        for (int age : testAges) {

            try {
                System.out.println("\nChecking age: " + age);
                app.checkEligibility(age);
            }
            catch (IllegalArgumentException e) {
                System.out.println("Exception: " + e.getMessage());
            }
            finally {
                System.out.println("Validation process completed");
            }
        }
    }
}
