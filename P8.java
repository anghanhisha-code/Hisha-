class University {

    // Static data member
    static int totalStudents;

    // Static variable
    static String universityName;

    // Static block (runs once when class is loaded)
    static {
        universityName = "ABC University";
        totalStudents = 0;
        System.out.println("Static block executed");
    }

    // Instance block (runs every time object is created)
    {
        System.out.println("Instance block executed");
        totalStudents++;
    }

    // Constructor
    University() {
        System.out.println("Constructor executed");
    }

    // Static method
    static int getTotalStudents() {
        return totalStudents;
    }

    // Main method to demonstrate execution
    public static void main(String[] args) {

        System.out.println("Main method started");

        University s1 = new University();
        University s2 = new University();

        System.out.println("University Name: " + universityName);
        System.out.println("Total Students: " + University.getTotalStudents());
    }
}
