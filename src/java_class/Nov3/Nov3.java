package java_class.Nov3;
import java.io.*;

public class Nov3 {
    public static void main(String[] args) {

        try {
            File obj = new File("myfile.txt");

            if (obj.createNewFile()) {
                System.out.println("File created: " + obj.getName());
            }
            else {
                System.out.println("File already exists.");
            }

        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

