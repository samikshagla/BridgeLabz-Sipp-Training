package Collections;
import java.util.*;
import java.text.*;

class Policy {
    String policyNumber;
    String policyholderName;
    Date expiryDate;
    String coverageType;
    double premiumAmount;

    public Policy(String policyNumber, String policyholderName, Date expiryDate, String coverageType, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyholderName = policyholderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    @Override
    public String toString() {
        return String.format("[%s, %s, %s, %s, %.2f]", policyNumber, policyholderName, new SimpleDateFormat("yyyy-MM-dd").format(expiryDate), coverageType, premiumAmount);
    }
}

public class InsurancePolicyMapSystem {
    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Policy p1 = new Policy("P001", "Alice", sdf.parse("2024-08-10"), "Health", 1200);
        Policy p2 = new Policy("P002", "Bob", sdf.parse("2024-07-25"), "Auto", 900);
        Policy p3 = new Policy("P003", "Carol", sdf.parse("2024-08-01"), "Home", 1500);
        Policy p4 = new Policy("P004", "Alice", sdf.parse("2024-07-20"), "Health", 1100);

        // HashMap: policy number -> policy
        Map<String, Policy> hashMap = new HashMap<>();
        hashMap.put(p1.policyNumber, p1);
        hashMap.put(p2.policyNumber, p2);
        hashMap.put(p3.policyNumber, p3);
        hashMap.put(p4.policyNumber, p4);

        // LinkedHashMap: insertion order
        Map<String, Policy> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(p1.policyNumber, p1);
        linkedHashMap.put(p2.policyNumber, p2);
        linkedHashMap.put(p3.policyNumber, p3);
        linkedHashMap.put(p4.policyNumber, p4);

        // TreeMap: sorted by expiry date (use expiry date as key)
        TreeMap<Date, Policy> treeMap = new TreeMap<>();
        treeMap.put(p1.expiryDate, p1);
        treeMap.put(p2.expiryDate, p2);
        treeMap.put(p3.expiryDate, p3);
        treeMap.put(p4.expiryDate, p4);

        // Retrieve a policy by number
        System.out.println("Policy P002: " + hashMap.get("P002"));

        // List all policies expiring within 30 days
        Date now = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(now);
        cal.add(Calendar.DATE, 30);
        Date in30 = cal.getTime();
        System.out.println("Policies expiring in 30 days:");
        for (Map.Entry<Date, Policy> entry : treeMap.subMap(now, true, in30, true).entrySet()) {
            System.out.println(entry.getValue());
        }

        // List all policies for a specific policyholder
        String holder = "Alice";
        System.out.println("Policies for policyholder '" + holder + "':");
        for (Policy p : hashMap.values()) {
            if (p.policyholderName.equalsIgnoreCase(holder)) {
                System.out.println(p);
            }
        }

        // Remove expired policies (expiry date before now)
        Iterator<Map.Entry<Date, Policy>> it = treeMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Date, Policy> entry = it.next();
            if (entry.getKey().before(now)) {
                it.remove();
            }
        }
        System.out.println("Policies after removing expired:");
        for (Policy p : treeMap.values()) {
            System.out.println(p);
        }
    }
} 