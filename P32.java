class VolumeCalculator {

    // Volume of Cube
    public double calculateVolume(double side) {
        return side * side * side;
    }

    // Volume of Rectangular Cube (Cuboid)
    public double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }

    // Volume of Sphere
    public double calculateVolume(float radius) {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }
}

public class VolumeTest {
    public static void main(String[] args) {

        VolumeCalculator vc = new VolumeCalculator();

        // Cube
        double cubeVolume = vc.calculateVolume(3);
        System.out.println("Volume of Cube: " + cubeVolume);

        // Rectangular Cube
        double cuboidVolume = vc.calculateVolume(4, 5, 6);
        System.out.println("Volume of Rectangular Cube: " + cuboidVolume);

        // Sphere
        double sphereVolume = vc.calculateVolume(2.5f);
        System.out.println("Volume of Sphere: " + sphereVolume);
    }
}
