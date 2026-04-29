// Interface 1
interface Exam {
    boolean isPassed(int mark);
}

// Interface 2
interface Classify {
    String getDivision(double average);
}

// Class implementing both interfaces
class Result implements Exam, Classify {

    // Implementation of Exam interface method
    public boolean isPassed(int mark) {
        return mark >= 40;
    }

    // Implementation of Classify interface method
    public String getDivision(double average) {
        if (average >= 60) {
            return "First Division";
        } else if (average >= 50) {
            return "Second Division";
        } else if (average >= 40) {
            return "Third Division";
        } else {
            return "Fail";
        }
    }
}

// Main class
public class TestResult {
    public static void main(String[] args) {

        Result r = new Result();

        int mark = 55;
        double average = 67.5;

        // Using Exam interface method
        System.out.println("Mark: " + mark + " -> Passed: " + r.isPassed(mark));

        // Using Classify interface method
        System.out.println("Average: " + average + " -> Division: " + r.getDivision(average));
    }
}
