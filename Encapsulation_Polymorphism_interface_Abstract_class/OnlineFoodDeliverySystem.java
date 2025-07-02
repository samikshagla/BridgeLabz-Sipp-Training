package Encapsulation_Polymorphism_interface_Abstract_class;

interface Discountable {
    void applyDiscount(double percent);
    String getDiscountDetails();
}

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() { return itemName; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
    public void setPrice(double price) { this.price = price; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public void getItemDetails() {
        System.out.println("Item: " + itemName + ", Price: " + price + ", Quantity: " + quantity);
    }

    public abstract double calculateTotalPrice();
}

class VegItem extends FoodItem implements Discountable {
    private double discount;
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }
    @Override
    public double calculateTotalPrice() { return getPrice() * getQuantity() - discount; }
    @Override
    public void applyDiscount(double percent) { discount = getPrice() * getQuantity() * percent / 100; }
    @Override
    public String getDiscountDetails() { return "Discount: " + discount; }
}

class NonVegItem extends FoodItem implements Discountable {
    private double discount;
    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }
    @Override
    public double calculateTotalPrice() { return getPrice() * getQuantity() + 50 - discount; }
    @Override
    public void applyDiscount(double percent) { discount = getPrice() * getQuantity() * percent / 100; }
    @Override
    public String getDiscountDetails() { return "Discount: " + discount; }
}

public class OnlineFoodDeliverySystem {
    public static void processOrder(FoodItem[] items) {
        for (FoodItem item : items) {
            item.getItemDetails();
            if (item instanceof Discountable) {
                ((Discountable)item).applyDiscount(10);
                System.out.println(((Discountable)item).getDiscountDetails());
            }
            System.out.println("Total Price: " + item.calculateTotalPrice());
            System.out.println();
        }
    }
    public static void main(String[] args) {
        FoodItem[] order = {
            new VegItem("Paneer Tikka", 200, 2),
            new NonVegItem("Chicken Biryani", 300, 1)
        };
        processOrder(order);
    }
} 