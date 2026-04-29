package student;

// Base class
public class Student {
    protected int rollNo;
    protected String name;

    // Constructor
    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    // Method to display student info
    public void displayStudent() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }
}

package exam;

import student.Student;

// Derived class
public class Result extends Student {

    private int marks1, marks2, marks3;

    // Constructor
    public Result(int rollNo, String name, int marks1, int marks2, int marks3) {
        super(rollNo, name);
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    // Method to display result
    public void displayResult() {
        displayStudent();

        int total = marks1 + marks2 + marks3;
        double average = total / 3.0;

        System.out.println("Marks 1: " + marks1);
        System.out.println("Marks 2: " + marks2);
        System.out.println("Marks 3: " + marks3);
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
    }
}

package exam;

public class Main {
    public static void main(String[] args) {

        // Create student result object
        Result student = new Result(101, "Rahul", 85, 90, 88);

        // Display mark sheet
        System.out.println("----- Mark Sheet -----");
        student.displayResult();
    }
}
