import java.io.*;

public class StudentFileDemo {

    public static void main(String[] args) {

        FileWriter fw = null;
        BufferedWriter bw = null;
        BufferedReader br = null;

        try {
            // Step 1: Write data to file
            fw = new FileWriter("students.txt");
            bw = new BufferedWriter(fw);

            bw.write("101 Rahul 85");
            bw.newLine();
            bw.write("102 Priya 90");
            bw.newLine();
            bw.write("103 Amit 78");
            bw.newLine();

            bw.flush();

            System.out.println("Data written successfully to students.txt\n");

            // Step 2: Read data from file
            br = new BufferedReader(new FileReader("students.txt"));

            String line;

            System.out.println("Student Records:");
            System.out.println("----------------");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } 
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } 
        finally {
            try {
                if (bw != null) bw.close();
                if (fw != null) fw.close();
                if (br != null) br.close();
            } catch (IOException e) {
                System.out.println("Error closing file resources.");
            }
        }
    }
}
