import java.util.Scanner;

class BillGenerator {

    // For regular customers (no discount)
    void generateBill(int itemTotal) {
        System.out.println("Customer Type: Regular");
        System.out.println("Final Bill Amount: ₹" + itemTotal);
    }

    // For privileged customers (flat discount)
    void generateBill(int itemTotal, int discount) {
        int finalAmount = itemTotal - discount;
        System.out.println("Customer Type: Privileged");
        System.out.println("Discount: ₹" + discount);
        System.out.println("Final Bill Amount: ₹" + finalAmount);
    }

    // For festive offers (percentage discount)
    void generateBill(int itemTotal, double discountPercent) {
        double discount = itemTotal * discountPercent / 100;
        double finalAmount = itemTotal - discount;
        System.out.println("Customer Type: Festive Offer");
        System.out.println("Discount: " + discountPercent + "%");
        System.out.println("Final Bill Amount: ₹" + finalAmount);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BillGenerator bg = new BillGenerator();

        System.out.println("Enter item total amount:");
        int total = sc.nextInt();

        System.out.println("Select Customer Type:");
        System.out.println("1. Regular");
        System.out.println("2. Privileged");
        System.out.println("3. Festive Offer");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                bg.generateBill(total);
                break;

            case 2:
                System.out.println("Enter discount amount (₹):");
                int discount = sc.nextInt();
                bg.generateBill(total, discount);
                break;

            case 3:
                System.out.println("Enter discount percentage:");
                double percent = sc.nextDouble();
                bg.generateBill(total, percent);
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
