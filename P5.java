class BankAccount {
    String accountId;
    String accountHolderName;
    double balance;

    // Method to assign values
    void assignValues(String id, String name, double bal) {
        accountId = id;
        accountHolderName = name;
        balance = bal;
    }

    // Method to display values
    void displayValues() {
        System.out.println("Account ID: " + accountId);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("---------------------------");
    }

    // Static method to search account
    static void searchAccount(BankAccount[] acc, String searchId) {
        boolean found = false;

        for (int i = 0; i < acc.length; i++) {
            if (acc[i].accountId.equals(searchId)) {
                System.out.println("Account Found:");
                acc[i].displayValues();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Account not found!");
        }
    }
}

public class Main {
    public static void main(String[] args) {

        // Create array of 5 BankAccount objects
        BankAccount[] accounts = new BankAccount[5];

        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new BankAccount();
        }

        // Assign values
        accounts[0].assignValues("A101", "Rahul", 5000);
        accounts[1].assignValues("A102", "Priya", 7000);
        accounts[2].assignValues("A103", "Amit", 6000);
        accounts[3].assignValues("A104", "Neha", 8000);
        accounts[4].assignValues("A105", "Karan", 9000);

        // Display all accounts
        System.out.println("All Accounts:");
        for (int i = 0; i < accounts.length; i++) {
            accounts[i].displayValues();
        }

        // Search for an account
        String searchId = "A103"; // you can change this value
        BankAccount.searchAccount(accounts, searchId);
    }
}
