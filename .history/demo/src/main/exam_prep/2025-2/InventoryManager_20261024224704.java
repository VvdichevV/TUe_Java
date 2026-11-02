import java.util.*;

public class InventoryManager {
    private List<Product> products = new ArrayList<>();
    private HashMap<String, Double> highestPriceByCategory = new HashMap<>();

    public void addProduct(Product p) {
        boolean found = false;
        for (Product product : products) {
            if (product.getName().equals(p.getName())) {
                product.setPrice(p.getPrice());
                found = true;
            }
        }
        if (!found) {
            products.add(p);
        }
        if (highestPriceByCategory.get(p.getCategory()) == null
                || p.getPrice() > highestPriceByCategory.get(p.getCategory())) {
            highestPriceByCategory.put(p.getName(), p.getPrice());
        }
    }

    public List<String> getCategoriesWithHighValue(double treshold) {
        List<String> categoriesWithHighValue = new List<String>() {
            
        };
        for (String category : highestPriceByCategory.keySet()) {
            if (highestPriceByCategory.get(category) >= treshold) {

            }
        }
    }

    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();
        manager.addProduct(new Product("Milk", "Food", 1.50));
        manager.addProduct(new Product("Cheese", "Food", 4.00));
        // Duplicate in name & category → UPDATE price, do NOT add new element
        manager.addProduct(new Product("Milk", "Food", 2.00));
        manager.addProduct(new Product("Laptop", "Electronics", 950.00));
        manager.addProduct(new Product("Camera", "Electronics", 550.00));
        manager.addProduct(new Product("Desk Chair", "Furniture", 620.00));
        System.out.println(manager.getCategoriesWithHighValue(500.0));
        // Output (order may vary): [Electronics, Furniture]
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