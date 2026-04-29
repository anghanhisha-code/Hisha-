// Base class
class Employee {
    String name;
    String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    // Method to be overridden
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Department: " + department);
    }
}

// Subclass
class Manager extends Employee {
    int teamSize;
    String projectName;

    public Manager(String name, String department, int teamSize, String projectName) {
        super(name, department);
        this.teamSize = teamSize;
        this.projectName = projectName;
    }

    // Overriding method
    @Override
    public void displayDetails() {
        System.out.println("Manager Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Team Size: " + teamSize);
        System.out.println("Project Name: " + projectName);
    }
}

// Main class
public class EmployeeTest {
    public static void main(String[] args) {

        // Employee object
        Employee emp = new Employee("Rahul", "IT");
        System.out.println("Employee Details:");
        emp.displayDetails();

        System.out.println();

        // Manager object
        Employee mgr = new Manager("Priya", "IT", 10, "AI System");
        System.out.println("Manager Details:");
        mgr.displayDetails(); // runtime polymorphism
    }
}
