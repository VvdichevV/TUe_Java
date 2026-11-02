
import java.util.*;

public class VehicleManagementSystem {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("Skoda", 2007, 50000, 4));
        vehicles.add(new Truck("Scania", 2010, 150000, 10));
        vehicles.add(new Car("Porsche 911", 2024, 500000, 2));
        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
        }
    }
}

class Vehicle {
    private String brand;
    private int year;
    private double price;

    public Vehicle(String brand, int year, double price) {
        this.brand = brand;
        this.year = year;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Year: " + year + ", Price: " + price);
    }
}

class Truck extends Vehicle {
    double loadCapacity;

    public Truck(String brand, int year, double price, double loadCapacity) {
        super(brand, year, price);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Maximum load capacity: " + loadCapacity);
    }
}

class Car extends Vehicle {
    int numberOfDoors;

    public Car(String brand, int year, double price, int numberOfDoors) {
        super(brand, year, price);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of doors: " + numberOfDoors);
    }
}