public class StringBufferVsStringBuilderPerformance {
    public static void main(String[] args) {
        int n = 1_000_000;
        String text = "hello";

        // StringBuilder performance
        long startBuilder = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(text);
        }
        long endBuilder = System.nanoTime();
        long builderTime = endBuilder - startBuilder;

        // StringBuffer performance
        long startBuffer = System.nanoTime();
        StringBuffer sbuf = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sbuf.append(text);
        }
        long endBuffer = System.nanoTime();
        long bufferTime = endBuffer - startBuffer;

        System.out.println("StringBuilder time (ms): " + builderTime / 1_000_000);
        System.out.println("StringBuffer time (ms): " + bufferTime / 1_000_000);
    }
} 