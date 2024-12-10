class Product {
    int productId; // Corrected variable name to productId
    String productName;
    double price;
    static int count = 0; // Initialize the static count variable

    // Default constructor
    Product() {
        productName = null;
    }

    // Parameterized constructor
    Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        count++; // Increment the static count variable when a new product is created
    }

    // Method to calculate discount
    double discount(double price, double discountPercentage) {
        return ((100 - discountPercentage) / 100) * price;
    }

    // Method to display product info
    void displayProductInfo() {
        System.out.println("Product Id: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Product Price: " + price);
    }
}

public class Practical2 {
    public static void main(String[] args) {
        // Creating instances of Product class
        Product product1 = new Product(101, "Laptop", 999.99);
        Product product2 = new Product(202, "SmartPhone", 499.95);
        Product product3 = new Product(303, "Tablet", 299.50);
        
        // Create a temporary product instance for calculating discount
        Product calcDiscount = new Product();

        // Display product information
        product1.displayProductInfo();
        product2.displayProductInfo();
        product3.displayProductInfo();

        // Calculate and display discounted price for product1
        double DiscountedPrice = calcDiscount.discount(product1.price, 10); // Applying 10% discount
        System.out.println("Discounted Price: " + DiscountedPrice);

        // Display total number of products created (static count)
        System.out.println("Total products created: " + Product.count);
    }
}
