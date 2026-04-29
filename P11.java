import java.util.Scanner;

// Superclass
class Payment {
    public void processPayment(int amount) {
        System.out.println("Processing payment of Rs." + amount);
    }
}

// Subclass CreditCardPayment
class CreditCardPayment extends Payment {
    @Override
    public void processPayment(int amount) {
        System.out.println("Payment of Rs." + amount + " done using Credit Card");
    }
}

// Subclass UPIPayment
class UPIPayment extends Payment {
    @Override
    public void processPayment(int amount) {
        System.out.println("Payment of Rs." + amount + " done using UPI");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select Payment Method:");
        System.out.println("1. Credit Card");
        System.out.println("2. UPI");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter amount: ");
        int amount = sc.nextInt();

        Payment p; // reference of superclass

        // Decide object based on user choice
        if (choice == 1) {
            p = new CreditCardPayment();
        } else if (choice == 2) {
            p = new UPIPayment();
        } else {
            System.out.println("Invalid choice");
            sc.close();
            return;
        }

        // Method overriding (runtime polymorphism)
        p.processPayment(amount);

        sc.close();
    }
}
