import java.util.ArrayList;  
import java.util.List;    
enum BookCategory {  
    FICTION, NON_FICTION, SCIENCE  
}  

enum ClothingCategory {  
    MEN, WOMEN, CHILDREN  
}  


abstract class Product<T> {  
    String name;  
    T category;  
    double price;  

    public Product(String name, T category, double price) {  
        this.name = name;  
        this.category = category;  
        this.price = price;  
    }  
}  


class Book extends Product<BookCategory> {  
    public Book(String name, BookCategory category, double price) {  
        super(name, category, price);  
    }  
}  

class Clothing extends Product<ClothingCategory> {  
    public Clothing(String name, ClothingCategory category, double price) {  
        super(name, category, price);  
    }  
}  


class Marketplace {  
    public <T extends Product<?>> void applyDiscount(T product, double percentage) {  
        product.price -= product.price * (percentage / 100);  
    }  
}  

 
public class MarketplaceApp {  
    public static void main(String[] args) {  
        Book book = new Book("Effective Java", BookCategory.NON_FICTION, 40.0);  
        Clothing clothing = new Clothing("T-Shirt", ClothingCategory.MEN, 20.0);  

        Marketplace marketplace = new Marketplace();  
        marketplace.applyDiscount(book, 10);  
        marketplace.applyDiscount(clothing, 15);  

        System.out.println(book.price);  
        System.out.println(clothing.price); 
    }  
}