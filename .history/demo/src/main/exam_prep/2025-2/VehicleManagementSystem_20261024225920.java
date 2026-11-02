
public class VehicleManagementSystem {
    public static void main(String[] args) {

    }
}

class Vehicle {
    private String brand;
    private int year;
    private double price;

    public Vehicle(String brand, int year, double price){
        this.brand = brand;
        this.year = year;
        this.price = price;
    }
    
    public getBrand(){
        return brand;
    }
    
}