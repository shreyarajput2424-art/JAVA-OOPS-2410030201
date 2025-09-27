import  java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        try {
            File obj = new File("myfile.txt"); // creating file object

            // Creating File
            if (obj.createNewFile()) {
                // returns a boolean value
                System.out.println("File created: " + obj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            // Exception Thrown
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
    }
}
