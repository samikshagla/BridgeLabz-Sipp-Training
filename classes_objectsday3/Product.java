
class Product {
    private static double discount = 10.0; // in percent
    private String productName;
    private double price;
    private int quantity;
    private final String productID;

    public Product(String productName, double price, int quantity, String productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    public void displayDetails() {
        if (this instanceof Product) {
            System.out.println("Product: " + productName);
            System.out.println("Price: " + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Product ID: " + productID);
            System.out.println("Discount: " + discount + "%");
        }
    }

    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 50000, 2, "P1001");
        Product p2 = new Product("Phone", 20000, 5, "P1002");
        p1.displayDetails();
        p2.displayDetails();
        updateDiscount(15.0);
        System.out.println("Updated Discount: " + discount + "%");
    }
} 