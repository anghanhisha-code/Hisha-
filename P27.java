import java.util.Scanner;

class Employee {
    // Private instance variables
    private String employeeName;
    private double employeeSalary;

    // Method to read data from user
    public void readEmployeeData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        employeeName = scanner.nextLine();

        System.out.print("Enter employee salary: ");
        employeeSalary = scanner.nextDouble();
    }

    // Method to display data
    public void displayEmployeeData() {
        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + employeeName);
        System.out.println("Salary: " + employeeSalary);
    }
}

// Main class to demonstrate object creation
public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee(); // object creation

        emp.readEmployeeData();       // method call
        emp.displayEmployeeData();    // method call
    }
}
