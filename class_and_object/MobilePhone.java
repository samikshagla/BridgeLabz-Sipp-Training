import java.util.*;
public class MobilePhone {
    String brand;
    String model;
    double price;
    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    public void display() {
        System.out.println(brand + " " + model + " " + price);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String brand = sc.nextLine();
        String model = sc.nextLine();
        double price = sc.nextDouble();
        MobilePhone phone = new MobilePhone(brand, model, price);
        phone.display();
    }
} 