import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenericSortDemo {

    // Generic method to sort list
    public static <T extends Comparable<T>> void sortList(List<T> list) {
        Collections.sort(list);
    }

    public static void main(String[] args) {

        // Integer list
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(45);
        numbers.add(12);
        numbers.add(89);
        numbers.add(23);

        System.out.println("Before Sorting (Integers): " + numbers);
        sortList(numbers);
        System.out.println("After Sorting (Integers): " + numbers);

        // String list
        ArrayList<String> names = new ArrayList<>();
        names.add("Rahul");
        names.add("Sneha");
        names.add("Amit");
        names.add("Kiran");

        System.out.println("\nBefore Sorting (Names): " + names);
        sortList(names);
        System.out.println("After Sorting (Names): " + names);
    }
}
