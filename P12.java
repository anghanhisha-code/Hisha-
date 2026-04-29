import java.util.Scanner;

// Interface
interface Order {
    void placeOrder(String item, int qty);
    void cancelOrder(int orderId);
    void generateBill();
}

// Abstract class with partial implementation
abstract class PartialOrder implements Order {
    protected String item;
    protected int quantity;
    protected int orderId;
    protected static int counter = 1001;

    // Implement only placeOrder()
    public void placeOrder(String item, int qty) {
        this.item = item;
        this.quantity = qty;
        this.orderId = counter++;
        System.out.println("Order placed successfully!");
        System.out.println("Order ID: " + orderId);
    }
}

// Concrete class
class FinalOrder extends PartialOrder {

    // Implement cancelOrder()
    @Override
    public void cancelOrder(int orderId) {
        if (this.orderId == orderId) {
            System.out.println("Order " + orderId + " has been cancelled.");
        } else {
            System.out.println("Invalid Order ID.");
        }
    }

    // Implement generateBill()
    @Override
    public void generateBill() {
        int pricePerItem = 100; // fixed price for simplicity
        int total = quantity * pricePerItem;

        System.out.println("\n----- BILL -----");
        System.out.println("Order ID: " + orderId);
        System.out.println("Item: " + item);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price per item: Rs." + pricePerItem);
        System.out.println("Total Amount: Rs." + total);
        System.out.println("----------------");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FinalOrder order = new FinalOrder();

        // Take order input
        System.out.print("Enter item name: ");
        String item = sc.nextLine();

        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();

        order.placeOrder(item, qty);

        // User choice
        System.out.println("\nChoose an option:");
        System.out.println("1. Generate Bill");
        System.out.println("2. Cancel Order");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            order.generateBill();
        } else if (choice == 2) {
            System.out.print("Enter Order ID to cancel: ");
            int id = sc.nextInt();
            order.cancelOrder(id);
        } else {
            System.out.println("Invalid choice.");
        }

        sc.close();
    }
}
