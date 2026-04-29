// Base class
class Shape {
    double d1, d2;

    // Method to initialize dimensions
    public void getData(double d1, double d2) {
        this.d1 = d1;
        this.d2 = d2;
    }
}

// Derived class: Triangle
class Triangle extends Shape {

    // Method to calculate area of triangle
    public double calculateArea() {
        return 0.5 * d1 * d2;
    }
}

// Derived class: Rectangle
class Rectangle extends Shape {

    // Method to calculate area of rectangle
    public double calculateArea() {
        return d1 * d2;
    }
}

// Main class
public class ShapeTest {
    public static void main(String[] args) {

        // Triangle object
        Triangle t = new Triangle();
        t.getData(10, 5); // base = 10, height = 5
        System.out.println("Area of Triangle: " + t.calculateArea());

        // Rectangle object
        Rectangle r = new Rectangle();
        r.getData(8, 4); // length = 8, width = 4
        System.out.println("Area of Rectangle: " + r.calculateArea());
    }
}
