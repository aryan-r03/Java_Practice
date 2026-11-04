
package java_class.Nov4;

import java.io.*;
import java.util.*;

public class Nov4_Reader {
    public static void main(String[] args) {
        try {
            File file = new File("info.txt");
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }

            sc.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
