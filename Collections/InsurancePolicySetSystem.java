package Collections;
import java.util.*;
import java.text.*;

class Policy implements Comparable<Policy> {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Policy)) return false;
        Policy p = (Policy) o;
        return policyNumber.equals(p.policyNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyNumber);
    }

    @Override
    public int compareTo(Policy o) {
        return this.expiryDate.compareTo(o.expiryDate);
    }

    @Override
    public String toString() {
        return String.format("[%s, %s, %s, %s, %.2f]", policyNumber, policyholderName, new SimpleDateFormat("yyyy-MM-dd").format(expiryDate), coverageType, premiumAmount);
    }
}

public class InsurancePolicySetSystem {
    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Policy p1 = new Policy("P001", "Alice", sdf.parse("2024-08-10"), "Health", 1200);
        Policy p2 = new Policy("P002", "Bob", sdf.parse("2024-07-25"), "Auto", 900);
        Policy p3 = new Policy("P003", "Carol", sdf.parse("2024-08-01"), "Home", 1500);
        Policy p4 = new Policy("P001", "Alice", sdf.parse("2024-08-10"), "Health", 1200); // duplicate
        Policy p5 = new Policy("P004", "Dave", sdf.parse("2024-07-20"), "Health", 1100);

        // HashSet for quick lookups
        Set<Policy> hashSet = new HashSet<>(Arrays.asList(p1, p2, p3, p4, p5));
        // LinkedHashSet to maintain insertion order
        Set<Policy> linkedHashSet = new LinkedHashSet<>(Arrays.asList(p1, p2, p3, p4, p5));
        // TreeSet to maintain sorted by expiry date
        Set<Policy> treeSet = new TreeSet<>(Arrays.asList(p1, p2, p3, p4, p5));

        System.out.println("All unique policies (HashSet): " + hashSet);
        System.out.println("Insertion order (LinkedHashSet): " + linkedHashSet);
        System.out.println("Sorted by expiry (TreeSet): " + treeSet);

        // Policies expiring within 30 days
        Date now = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(now);
        cal.add(Calendar.DATE, 30);
        Date in30 = cal.getTime();
        System.out.println("Policies expiring in 30 days:");
        for (Policy p : treeSet) {
            if (!p.expiryDate.after(in30) && !p.expiryDate.before(now)) {
                System.out.println(p);
            }
        }

        // Policies with specific coverage type
        String type = "Health";
        System.out.println("Policies with coverage type '" + type + "':");
        for (Policy p : hashSet) {
            if (p.coverageType.equalsIgnoreCase(type)) {
                System.out.println(p);
            }
        }

        // Find duplicate policies by policy number
        Set<String> seen = new HashSet<>();
        Set<String> duplicates = new HashSet<>();
        for (Policy p : Arrays.asList(p1, p2, p3, p4, p5)) {
            if (!seen.add(p.policyNumber)) {
                duplicates.add(p.policyNumber);
            }
        }
        System.out.println("Duplicate policy numbers: " + duplicates);

        // Performance comparison
        int N = 100_000;
        List<Policy> manyPolicies = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            manyPolicies.add(new Policy("PX"+i, "Holder"+i, new Date(now.getTime() + i*1000L*60*60*24), "Auto", 1000+i));
        }
        long t1 = System.nanoTime();
        Set<Policy> hs = new HashSet<>(manyPolicies);
        long t2 = System.nanoTime();
        Set<Policy> lhs = new LinkedHashSet<>(manyPolicies);
        long t3 = System.nanoTime();
        Set<Policy> ts = new TreeSet<>(manyPolicies);
        long t4 = System.nanoTime();
        System.out.println("HashSet add: " + (t2-t1)/1_000_000.0 + " ms");
        System.out.println("LinkedHashSet add: " + (t3-t2)/1_000_000.0 + " ms");
        System.out.println("TreeSet add: " + (t4-t3)/1_000_000.0 + " ms");
        // Remove
        t1 = System.nanoTime(); hs.remove(manyPolicies.get(0)); t2 = System.nanoTime();
        t3 = System.nanoTime(); lhs.remove(manyPolicies.get(0)); t4 = System.nanoTime();
        long t5 = System.nanoTime(); ts.remove(manyPolicies.get(0)); long t6 = System.nanoTime();
        System.out.println("HashSet remove: " + (t2-t1)/1_000_000.0 + " ms");
        System.out.println("LinkedHashSet remove: " + (t4-t3)/1_000_000.0 + " ms");
        System.out.println("TreeSet remove: " + (t6-t5)/1_000_000.0 + " ms");
        // Search
        t1 = System.nanoTime(); hs.contains(manyPolicies.get(N/2)); t2 = System.nanoTime();
        t3 = System.nanoTime(); lhs.contains(manyPolicies.get(N/2)); t4 = System.nanoTime();
        t5 = System.nanoTime(); ts.contains(manyPolicies.get(N/2)); t6 = System.nanoTime();
        System.out.println("HashSet search: " + (t2-t1)/1_000_000.0 + " ms");
        System.out.println("LinkedHashSet search: " + (t4-t3)/1_000_000.0 + " ms");
        System.out.println("TreeSet search: " + (t6-t5)/1_000_000.0 + " ms");
    }
} 