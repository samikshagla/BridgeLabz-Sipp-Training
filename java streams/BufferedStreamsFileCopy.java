import java.io.*;

public class BufferedStreamsFileCopy {
    public static void main(String[] args) {
        String sourceFile = "largefile.txt";
        String destFile1 = "copy1.txt";
        String destFile2 = "copy2.txt";
        
        // Create a large test file
        createLargeFile(sourceFile, 100 * 1024 * 1024); // 100MB
        
        // Copy using normal streams
        long startTime = System.nanoTime();
        copyWithNormalStreams(sourceFile, destFile1);
        long normalTime = System.nanoTime() - startTime;
        
        // Copy using buffered streams
        startTime = System.nanoTime();
        copyWithBufferedStreams(sourceFile, destFile2);
        long bufferedTime = System.nanoTime() - startTime;
        
        System.out.println("Normal streams time: " + normalTime / 1_000_000.0 + " ms");
        System.out.println("Buffered streams time: " + bufferedTime / 1_000_000.0 + " ms");
    }
    
    private static void copyWithNormalStreams(String source, String dest) {
        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(dest)) {
            
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    private static void copyWithBufferedStreams(String source, String dest) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest))) {
            
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    private static void createLargeFile(String filename, int size) {
        try (FileOutputStream fos = new FileOutputStream(filename)) {
            byte[] data = new byte[1024];
            for (int i = 0; i < size / 1024; i++) {
                fos.write(data);
            }
        } catch (IOException e) {
            System.out.println("Error creating test file: " + e.getMessage());
        }
    }
} 