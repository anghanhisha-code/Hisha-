import java.util.HashMap;
import java.util.Scanner;

public class WordFrequency {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input sentence from user
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Convert sentence to words
        String[] words = sentence.split("\\s+");

        // HashMap to store word frequency
        HashMap<String, Integer> freqMap = new HashMap<>();

        // Count frequency of each word
        for (String word : words) {

            // Convert to lowercase for uniform counting
            word = word.toLowerCase();

            if (freqMap.containsKey(word)) {
                freqMap.put(word, freqMap.get(word) + 1);
            } else {
                freqMap.put(word, 1);
            }
        }

        // Display results
        System.out.println("\nWord Frequency:");
        for (String word : freqMap.keySet()) {
            System.out.println(word + " -> " + freqMap.get(word));
        }

        scanner.close();
    }
}
