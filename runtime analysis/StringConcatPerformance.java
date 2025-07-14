public class StringConcatPerformance {
    public static void main(String[] args) {
        int[] sizes = {1000, 10000, 1000000};
        String text = "hello";
        for (int n : sizes) {
            // String
            long startString = System.nanoTime();
            String s = "";
            for (int i = 0; i < n; i++) {
                s += text;
            }
            long endString = System.nanoTime();
            System.out.println("String concat - N: " + n + ", Time: " + (endString - startString) / 1_000_000.0 + " ms");

            // StringBuilder
            long startBuilder = System.nanoTime();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                sb.append(text);
            }
            long endBuilder = System.nanoTime();
            System.out.println("StringBuilder concat - N: " + n + ", Time: " + (endBuilder - startBuilder) / 1_000_000.0 + " ms");

            // StringBuffer
            long startBuffer = System.nanoTime();
            StringBuffer sbuf = new StringBuffer();
            for (int i = 0; i < n; i++) {
                sbuf.append(text);
            }
            long endBuffer = System.nanoTime();
            System.out.println("StringBuffer concat - N: " + n + ", Time: " + (endBuffer - startBuffer) / 1_000_000.0 + " ms");
        }
    }
} 