import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        // Writing Text File
        try {
            FileWriter writer = new FileWriter("myfile.txt");
            // Writing File
            writer.write("Files in Java are seriously good!!");
            writer.close();
            System.out.println("Successfully written.");
        } catch (IOException e) {
            // Exception Thrown
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
    }
}
