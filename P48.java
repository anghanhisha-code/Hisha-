import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileAnalysis {

    public static void main(String[] args) {

        BufferedReader br = null;

        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        try {
            br = new BufferedReader(new FileReader("data.txt"));

            String line;

            while ((line = br.readLine()) != null) {

                lineCount++;

                // Count words
                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }

                // Count characters (excluding spaces)
                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) != ' ') {
                        charCount++;
                    }
                }
            }

            // Display results
            System.out.println("File Analysis Result:");
            System.out.println("----------------------");
            System.out.println("Total Lines: " + lineCount);
            System.out.println("Total Words: " + wordCount);
            System.out.println("Total Characters (excluding spaces): " + charCount);

        } 
        catch (FileNotFoundException e) {
            System.out.println("Error: File not found - " + e.getMessage());
        } 
        catch (IOException e) {
            System.out.println("Error reading file - " + e.getMessage());
        } 
        finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing file.");
            }
        }
    }
}
