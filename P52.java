import java.util.LinkedList;

public class GenericSearch {

    // Generic method to search an element in LinkedList
    public static <T> boolean searchElement(LinkedList<T> list, T element) {
        return list.contains(element);
    }

    public static void main(String[] args) {

        // Test with LinkedList<Integer> (Roll Numbers)
        LinkedList<Integer> rollNumbers = new LinkedList<>();
        rollNumbers.add(101);
        rollNumbers.add(102);
        rollNumbers.add(103);
        rollNumbers.add(104);

        int searchRoll = 103;

        System.out.println("Roll Numbers List: " + rollNumbers);
        System.out.println("Searching " + searchRoll + ": " 
                + searchElement(rollNumbers, searchRoll));

        // Test with LinkedList<String> (Names)
        LinkedList<String> names = new LinkedList<>();
        names.add("Rahul");
        names.add("Priya");
        names.add("Amit");
        names.add("Sneha");

        String searchName = "Amit";

        System.out.println("\nNames List: " + names);
        System.out.println("Searching " + searchName + ": " 
                + searchElement(names, searchName));
    }
}
