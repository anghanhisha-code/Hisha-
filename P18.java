import java.util.ArrayList;

// Generic class
class Box<T> {
    private ArrayList<T> items = new ArrayList<>();

    // Method to add item
    public void addItem(T item) {
        items.add(item);
    }

    // Method to display items
    public void displayItems() {
        for (T item : items) {
            System.out.println(item);
        }
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        // Box for names (String)
        Box<String> nameBox = new Box<>();
        nameBox.addItem("Rahul");
        nameBox.addItem("Sneha");
        nameBox.addItem("Amit");

        System.out.println("Names in Box:");
        nameBox.displayItems();

        // Box for roll numbers (Integer)
        Box<Integer> rollBox = new Box<>();
        rollBox.addItem(101);
        rollBox.addItem(102);
        rollBox.addItem(103);

        System.out.println("\nRoll Numbers in Box:");
        rollBox.displayItems();
    }
}
