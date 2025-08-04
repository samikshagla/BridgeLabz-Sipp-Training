import java.io.*;

public class PipedStreamsThreadCommunication {
    public static void main(String[] args) {
        try {
            PipedOutputStream pos = new PipedOutputStream();
            PipedInputStream pis = new PipedInputStream(pos);
            
            // Writer thread
            Thread writerThread = new Thread(() -> {
                try (PrintWriter pw = new PrintWriter(pos)) {
                    for (int i = 1; i <= 5; i++) {
                        pw.println("Message " + i);
                        pw.flush();
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {
                    System.out.println("Writer error: " + e.getMessage());
                }
            });
            
            // Reader thread
            Thread readerThread = new Thread(() -> {
                try (BufferedReader br = new BufferedReader(new InputStreamReader(pis))) {
                    String line;
                    while ((line = br.readLine()) != null) {
                        System.out.println("Received: " + line);
                    }
                } catch (IOException e) {
                    System.out.println("Reader error: " + e.getMessage());
                }
            });
            
            writerThread.start();
            readerThread.start();
            
            writerThread.join();
            readerThread.join();
            
        } catch (IOException | InterruptedException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
} 