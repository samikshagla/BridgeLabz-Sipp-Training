package Collections;
import java.util.*;

public class WordFrequencyCounter {
    public static Map<String, Integer> countWords(String text) {
        Map<String, Integer> freq = new HashMap<>();
        String[] words = text.toLowerCase().replaceAll("[^a-z0-9 ]", "").split("\\s+");
        for (String word : words) {
            if (!word.isEmpty()) freq.put(word, freq.getOrDefault(word, 0) + 1);
        }
        return freq;
    }
    public static void main(String[] args) {
        String input = "Hello world, hello Java!";
        System.out.println("Word frequency: " + countWords(input));
    }
} 