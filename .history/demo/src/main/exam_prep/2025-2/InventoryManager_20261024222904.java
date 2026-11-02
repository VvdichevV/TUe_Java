import java.util.*;

public class InventoryManager {
    private List<Product> products = new ArrayList<>();
    private HashMap<String, Double> highestPriceByCategory = new HashMap<>();

    public void addProduct(Product p) {
        
    }

}

class Product {
    private String name; // e.g., "Laptop", "Banana"
    private String category; // e.g., "Electronics", "Food"
    private double price; // e.g., 12.50

    public Product(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}