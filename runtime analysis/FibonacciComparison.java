public class FibonacciComparison {
    public static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }
    public static int fibonacciIterative(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1, sum = 0;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }
    public static void main(String[] args) {
        int[] ns = {10, 30, 50};
        for (int n : ns) {
            // Recursive
            if (n <= 30) {
                long startRec = System.nanoTime();
                int rec = fibonacciRecursive(n);
                long endRec = System.nanoTime();
                System.out.println("Recursive Fibonacci n=" + n + ": " + rec + ", Time: " + (endRec - startRec) / 1_000_000.0 + " ms");
            } else {
                System.out.println("Recursive Fibonacci n=" + n + ": Skipped (too slow)");
            }
            // Iterative
            long startIt = System.nanoTime();
            int it = fibonacciIterative(n);
            long endIt = System.nanoTime();
            System.out.println("Iterative Fibonacci n=" + n + ": " + it + ", Time: " + (endIt - startIt) / 1_000_000.0 + " ms");
        }
    }
} 