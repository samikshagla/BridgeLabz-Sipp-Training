package Collections;
import java.util.*;

public class ShoppingCart {
    public static void main(String[] args) {
        // HashMap: Product -> Price
        Map<String, Integer> priceMap = new HashMap<>();
        priceMap.put("Apple", 50);
        priceMap.put("Banana", 20);
        priceMap.put("Orange", 30);
        priceMap.put("Mango", 60);

        // LinkedHashMap: Order of items added
        Map<String, Integer> cartOrder = new LinkedHashMap<>();
        cartOrder.put("Banana", priceMap.get("Banana"));
        cartOrder.put("Apple", priceMap.get("Apple"));
        cartOrder.put("Mango", priceMap.get("Mango"));
        cartOrder.put("Orange", priceMap.get("Orange"));

        // TreeMap: Items sorted by price
        TreeMap<Integer, List<String>> sortedByPrice = new TreeMap<>();
        for (Map.Entry<String, Integer> entry : cartOrder.entrySet()) {
            sortedByPrice.computeIfAbsent(entry.getValue(), k -> new ArrayList<>()).add(entry.getKey());
        }

        System.out.println("Cart order (LinkedHashMap): " + cartOrder);
        System.out.println("Items sorted by price (TreeMap): " + sortedByPrice);
    }
} 