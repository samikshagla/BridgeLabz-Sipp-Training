import java.util.*;
public class Item {
    int itemCode;
    String itemName;
    double price;
    public Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }
    public void display() {
        System.out.println(itemCode + " " + itemName + " " + price);
    }
    public double totalCost(int quantity) {
        return price * quantity;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int code = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        double price = sc.nextDouble();
        int quantity = sc.nextInt();
        Item item = new Item(code, name, price);
        item.display();
        System.out.println(item.totalCost(quantity));
    }
}
