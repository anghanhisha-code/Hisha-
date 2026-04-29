class BankAccount {
    private String accountHolderName;
    private double balance;

    // Static variable (common for all accounts)
    private static double interestRate = 5.0; // default 5%

    // Constructor
    public BankAccount(String name, double balance) {
        this.accountHolderName = name;
        this.balance = balance;
    }

    // Method to calculate interest
    public double calculateInterest() {
        return (balance * interestRate) / 100;
    }

    // Method to display account details and interest
    public void displayAccountDetails() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Interest Earned: " + calculateInterest());
        System.out.println();
    }

    // Static method to update interest rate
    public static void updateInterestRate(double newRate) {
        interestRate = newRate;
    }
}

// Main class
public class BankTest {
    public static void main(String[] args) {

        // Create objects
        BankAccount acc1 = new BankAccount("Rahul", 10000);
        BankAccount acc2 = new BankAccount("Priya", 20000);

        // Display details with default interest rate
        System.out.println("Before updating interest rate:");
        acc1.displayAccountDetails();
        acc2.displayAccountDetails();

        // Update interest rate
        BankAccount.updateInterestRate(7.5);

        // Display details after updating interest rate
        System.out.println("After updating interest rate:");
        acc1.displayAccountDetails();
        acc2.displayAccountDetails();
    }
}
