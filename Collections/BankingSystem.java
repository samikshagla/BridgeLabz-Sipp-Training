package Collections;
import java.util.*;

class WithdrawalRequest {
    String accountNumber;
    int amount;
    public WithdrawalRequest(String accountNumber, int amount) {
        this.accountNumber = accountNumber;
        this.amount = amount;
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        // HashMap: AccountNumber -> Balance
        Map<String, Integer> accounts = new HashMap<>();
        accounts.put("A001", 5000);
        accounts.put("A002", 3000);
        accounts.put("A003", 7000);
        accounts.put("A004", 2000);

        // TreeMap: Sort by balance (value)
        TreeMap<Integer, List<String>> sortedByBalance = new TreeMap<>();
        for (Map.Entry<String, Integer> entry : accounts.entrySet()) {
            sortedByBalance.computeIfAbsent(entry.getValue(), k -> new ArrayList<>()).add(entry.getKey());
        }
        System.out.println("Accounts sorted by balance: " + sortedByBalance);

        // Queue: Process withdrawal requests
        Queue<WithdrawalRequest> queue = new LinkedList<>();
        queue.add(new WithdrawalRequest("A001", 1000));
        queue.add(new WithdrawalRequest("A003", 2000));
        queue.add(new WithdrawalRequest("A002", 500));
        while (!queue.isEmpty()) {
            WithdrawalRequest req = queue.remove();
            int balance = accounts.getOrDefault(req.accountNumber, 0);
            if (balance >= req.amount) {
                accounts.put(req.accountNumber, balance - req.amount);
                System.out.println("Withdrawal of " + req.amount + " from " + req.accountNumber + " successful. New balance: " + accounts.get(req.accountNumber));
            } else {
                System.out.println("Withdrawal of " + req.amount + " from " + req.accountNumber + " failed. Insufficient funds.");
            }
        }
    }
} 