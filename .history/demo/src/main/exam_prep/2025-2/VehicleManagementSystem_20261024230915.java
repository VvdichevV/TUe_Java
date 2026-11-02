
public class VehicleManagementSystem {
    public static void main(String[] args) {

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
}

class Car extends Vehicle {
    double numberOfDoors;

    public Car(String brand, int year, double price, double loadCapacity) {
        super(brand, year, price);
        this.numberOfDoors = loadCapacity;
    }
}