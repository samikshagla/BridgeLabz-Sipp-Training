import java.util.*;
public class CartItem {
    String itemName;
    double price;
    int quantity;
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
    public void addItem(int qty) {
        quantity += qty;
    }
    public void removeItem(int qty) {
        if (qty <= quantity) quantity -= qty;
    }
    public double totalCost() {
        return price * quantity;
    }
    public void display() {
        System.out.println(itemName + " " + price + " " + quantity + " " + totalCost());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        double price = sc.nextDouble();
        int quantity = sc.nextInt();
        CartItem item = new CartItem(name, price, quantity);
        item.addItem(sc.nextInt());
        item.removeItem(sc.nextInt());
        item.display();
    }
}
