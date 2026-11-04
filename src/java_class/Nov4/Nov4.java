package java_class.Nov4;

// Write a program to create a new file named "info.txt" and write :
// Hello Aryan

// What are you doing ?
// Some message Some message Some message Some message Some message Some message
// Some message Some message Some message Some message Some message
// Some message Some message Some message Some message
// Some message Some message Some message
// Some message Some message
// Some message

import java.io.*;
import java.util.*;

public class Nov4 {
    public static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter("info.txt");

            fw.write("Hello Aryan\n");
            fw.write("What are you doing ?\n");

            fw.write("Some message Some message Some message Some message Some message Some message \n");
            fw.write("Some message Some message Some message Some message Some message \n");
            fw.write("Some message Some message Some message Some message \n");
            fw.write("Some message Some message Some message \n");
            fw.write("Some message Some message \n");
            fw.write("Some message \n");

            fw.close();

            System.out.println("The file is created and the data has been written in the file !!");
        }
        catch (Exception e){
            System.out.println("An error has been found : " + e);
        }
    }
}
