// Interface
interface Classify {
    String getDivision(double average);
}

// Implementing class
class Result implements Classify {

    // Implementing interface method
    public String getDivision(double average) {
        if (average >= 60) {
            return "First Division";
        } else {
            return "Second Division";
        }
    }
}

// Main class
public class TestResult {
    public static void main(String[] args) {

        Result r = new Result();

        double avg1 = 75;
        double avg2 = 45;

        System.out.println("Average: " + avg1 + " -> " + r.getDivision(avg1));
        System.out.println("Average: " + avg2 + " -> " + r.getDivision(avg2));
    }
}
