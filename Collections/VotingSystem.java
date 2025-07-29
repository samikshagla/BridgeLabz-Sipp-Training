package Collections;
import java.util.*;

public class VotingSystem {
    public static void main(String[] args) {
        // HashMap: Candidate -> Votes
        Map<String, Integer> voteMap = new HashMap<>();
        // LinkedHashMap: Order of votes
        Map<String, Integer> voteOrder = new LinkedHashMap<>();
        // Simulate voting
        String[] votes = {"Alice", "Bob", "Alice", "Carol", "Bob", "Alice"};
        for (String candidate : votes) {
            voteMap.put(candidate, voteMap.getOrDefault(candidate, 0) + 1);
            voteOrder.put(candidate, voteOrder.getOrDefault(candidate, 0) + 1);
        }
        // TreeMap: Sorted results
        TreeMap<String, Integer> sortedResults = new TreeMap<>(voteMap);
        System.out.println("Vote count (HashMap): " + voteMap);
        System.out.println("Vote order (LinkedHashMap): " + voteOrder);
        System.out.println("Sorted results (TreeMap): " + sortedResults);
    }
} 