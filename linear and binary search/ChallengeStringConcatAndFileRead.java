import java.io.*;

public class ChallengeStringConcatAndFileRead {
    public static void main(String[] args) {
        int n = 1_000_000;
        String text = "hello";
        String fileName = "largefile.txt"; // Change to your file path

        // StringBuilder
        long startBuilder = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) sb.append(text);
        long endBuilder = System.nanoTime();
        System.out.println("StringBuilder time (ms): " + (endBuilder - startBuilder) / 1_000_000);

        // StringBuffer
        long startBuffer = System.nanoTime();
        StringBuffer sbuf = new StringBuffer();
        for (int i = 0; i < n; i++) sbuf.append(text);
        long endBuffer = System.nanoTime();
        System.out.println("StringBuffer time (ms): " + (endBuffer - startBuffer) / 1_000_000);

        // FileReader
        long startFR = System.nanoTime();
        int wordCountFR = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                wordCountFR += line.split("\\s+").length;
            }
        } catch (IOException e) {
            System.out.println("FileReader error: " + e.getMessage());
        }
        long endFR = System.nanoTime();
        System.out.println("FileReader word count: " + wordCountFR + ", time (ms): " + (endFR - startFR) / 1_000_000);

        // InputStreamReader
        long startISR = System.nanoTime();
        int wordCountISR = 0;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "UTF-8"))) {
            String line;
            while ((line = br.readLine()) != null) {
                wordCountISR += line.split("\\s+").length;
            }
        } catch (IOException e) {
            System.out.println("InputStreamReader error: " + e.getMessage());
        }
        long endISR = System.nanoTime();
        System.out.println("InputStreamReader word count: " + wordCountISR + ", time (ms): " + (endISR - startISR) / 1_000_000);
    }
} 