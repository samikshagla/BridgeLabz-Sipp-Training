// Self Problem 4: E-commerce Platform with Orders, Customers, and Products
import java.util.*;

class Product {
    private String name;
    private double price;
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return name + " ($" + price + ")";
    }
}

class Order {
    private static int nextId = 1;
    private int id;
    private List<Product> products;
    public Order() {
        this.id = nextId++;
        this.products = new ArrayList<>();
    }
    public void addProduct(Product product) {
        products.add(product);
    }
    public void showOrderDetails() {
        System.out.println("Order " + id + " contains:");
        for (Product p : products) {
            System.out.println(p);
        }
    }
}

class CustomerE {
    private String name;
    private List<Order> orders;
    public CustomerE(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }
    public void placeOrder(Order order) {
        orders.add(order);
        System.out.println(name + " placed order " + order);
    }
    public void showOrders() {
        System.out.println(name + "'s Orders:");
        for (Order o : orders) {
            o.showOrderDetails();
        }
    }
}

public class EcommercePlatform {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 1200.0);
        Product p2 = new Product("Phone", 800.0);
        Product p3 = new Product("Headphones", 150.0);

        CustomerE alice = new CustomerE("Alice");
        CustomerE bob = new CustomerE("Bob");

        Order order1 = new Order();
        order1.addProduct(p1);
        order1.addProduct(p3);
        alice.placeOrder(order1);

        Order order2 = new Order();
        order2.addProduct(p2);
        bob.placeOrder(order2);

        alice.showOrders();
        bob.showOrders();
    }
} 