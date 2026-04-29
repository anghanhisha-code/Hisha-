import java.util.Scanner;

// Base class
class BankAccount {
    protected String accountNumber;
    protected String accountHolderName;
    protected double balance;

    // Open account
    public void openAccount(String accNo, String name, double initialBalance) {
        accountNumber = accNo;
        accountHolderName = name;
        balance = initialBalance;
        System.out.println("Account opened successfully!");
    }

    // Deposit money
    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited successfully.");
    }

    // Withdraw money
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // Check balance
    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

// Saving Account subclass
class SavingAccount extends BankAccount {
    private double interestRate = 5.0; // 5% interest

    // Calculate interest
    public void calculateInterest() {
        double interest = (balance * interestRate) / 100;
        System.out.println("Savings Interest: " + interest);
    }
}

// Fixed Deposit Account subclass
class FixedDepositAccount extends BankAccount {
    private int years;
    private double interestRate = 7.0;

    public void setFDDetails(int years) {
        this.years = years;
    }

    // Calculate maturity amount
    public void maturityAmount() {
        double maturity = balance + (balance * interestRate * years) / 100;
        System.out.println("Maturity Amount after " + years + " years: " + maturity);
    }
}

// Main class
public class BankTest {
    public static void main(String[] args) {

        // Saving Account
        SavingAccount sa = new SavingAccount();
        sa.openAccount("S101", "Rahul", 10000);
        sa.deposit(5000);
        sa.checkBalance();
        sa.calculateInterest();
        sa.withdraw(2000);
        sa.checkBalance();

        System.out.println();

        // Fixed Deposit Account
        FixedDepositAccount fd = new FixedDepositAccount();
        fd.openAccount("F201", "Priya", 20000);
        fd.setFDDetails(3); // 3 years FD
        fd.maturityAmount();
        fd.withdraw(5000);
        fd.checkBalance();
    }
}
