import java.io.*;

public class ByteArrayStreamImage {
    public static void main(String[] args) {
        String sourceImage = "source.jpg";
        String destImage = "copy.jpg";
        
        try {
            // Read image into byte array
            byte[] imageBytes = readImageToByteArray(sourceImage);
            System.out.println("Image read successfully, size: " + imageBytes.length + " bytes");
            
            // Write byte array back to new image file
            writeByteArrayToImage(imageBytes, destImage);
            System.out.println("Image written successfully to " + destImage);
            
        } catch (IOException e) {
            System.out.println("Error processing image: " + e.getMessage());
        }
    }
    
    private static byte[] readImageToByteArray(String filename) throws IOException {
        try (FileInputStream fis = new FileInputStream(filename);
             ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }
            return baos.toByteArray();
        }
    }
    
    private static void writeByteArrayToImage(byte[] imageBytes, String filename) throws IOException {
        try (ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
             FileOutputStream fos = new FileOutputStream(filename)) {
            
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        }
    }
} 