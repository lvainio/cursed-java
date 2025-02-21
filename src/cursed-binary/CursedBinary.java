import java.io.FileInputStream;
import java.io.IOException;

public class CursedBinary {
    public static void main(String[] args) {
        String fileName = "CursedBinary.class"; 
        try (FileInputStream fis = new FileInputStream(fileName)) {
            int magicNumber = (fis.read() << 24) | (fis.read() << 16) | (fis.read() << 8) | fis.read();
            System.out.printf("The first integer in the class file is: 0x%08X\n", magicNumber);
        } catch (IOException e) {
            System.err.println("An error occurred while reading the class file: " + e.getMessage());
        }
    }
}