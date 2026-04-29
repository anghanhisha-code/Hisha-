public class Rectangle {
    // Data fields with default values
    double width = 1;
    double height = 1;

    // No-argument constructor
    public Rectangle() {
        // default values already set
    }

    // Parameterized constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Method to calculate area
    public double getArea() {
        return width * height;
    }

    // Method to calculate perimeter
    public double getPerimeter() {
        return 2 * (width + height);
    }
}
