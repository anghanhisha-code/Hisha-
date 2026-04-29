import java.util.Scanner;

class College {
    private String collegeName;

    // Constructor for outer class
    public College(String collegeName) {
        this.collegeName = collegeName;
    }

    // Non-static inner class
    class Admission {
        private String studentName;
        private String course;

        // Method to accept student details
        public void inputStudentData() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter student name: ");
            studentName = scanner.nextLine();

            System.out.print("Enter course: ");
            course = scanner.nextLine();
        }

        // Method to display details
        public void displayStudentData() {
            System.out.println("\n--- Admission Details ---");
            System.out.println("College Name: " + collegeName); // Access outer class variable
            System.out.println("Student Name: " + studentName);
            System.out.println("Course: " + course);
        }
    }
}

// Main class
public class CollegeTest {
    public static void main(String[] args) {

        // Create outer class object
        College college = new College("ABC Engineering College");

        // Create inner class object
        College.Admission admission = college.new Admission();

        // Input and display data
        admission.inputStudentData();
        admission.displayStudentData();
    }
}
