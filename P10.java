class Vehicle {
    protected String vehicleNumber;
    protected String brand;
    protected String fuelType;

    // Constructor
    public Vehicle(String vehicleNumber, String brand, String fuelType) {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.fuelType = fuelType;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Fuel Type: " + fuelType);
    }
}

// Subclass Car
class Car extends Vehicle {
    protected int numberOfSeats;
    protected boolean ACavailable;

    // Constructor (Constructor Chaining using super)
    public Car(String vehicleNumber, String brand, String fuelType,
               int numberOfSeats, boolean ACavailable) {
        super(vehicleNumber, brand, fuelType);
        this.numberOfSeats = numberOfSeats;
        this.ACavailable = ACavailable;
    }

    // Overriding method
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call parent method
        System.out.println("Number of Seats: " + numberOfSeats);
        System.out.println("AC Available: " + ACavailable);
    }
}

// Subclass ElectricCar
class ElectricCar extends Car {
    private int batteryCapacity;
    private int chargingTime;

    // Constructor chaining
    public ElectricCar(String vehicleNumber, String brand, String fuelType,
                       int numberOfSeats, boolean ACavailable,
                       int batteryCapacity, int chargingTime) {
        super(vehicleNumber, brand, fuelType, numberOfSeats, ACavailable);
        this.batteryCapacity = batteryCapacity;
        this.chargingTime = chargingTime;
    }

    // Overriding method
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
        System.out.println("Charging Time: " + chargingTime + " hours");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        // Object of Vehicle
        Vehicle v1 = new Vehicle("GJ01AB1234", "Tata", "Petrol");
        System.out.println("---- Vehicle Details ----");
        v1.displayDetails();

        // Object of Car
        Vehicle v2 = new Car("GJ05CD5678", "Honda", "Diesel", 5, true);
        System.out.println("\n---- Car Details (Upcasting) ----");
        v2.displayDetails();

        // Object of ElectricCar
        Vehicle v3 = new ElectricCar("GJ10EF9999", "Tesla", "Electric", 5, true, 75, 2);
        System.out.println("\n---- Electric Car Details ----");
        v3.displayDetails();

        // instanceof check and Downcasting
        System.out.println("\n---- Runtime Type Checking ----");

        if (v2 instanceof Car) {
            Car c = (Car) v2; // Downcasting
            System.out.println("v2 is instance of Car");
            System.out.println("Seats in Car: " + c.numberOfSeats);
        }

        if (v3 instanceof ElectricCar) {
            ElectricCar ec = (ElectricCar) v3; // Downcasting
            System.out.println("v3 is instance of ElectricCar");
        }
    }
}
