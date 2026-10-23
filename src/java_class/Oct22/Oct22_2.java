package java_class.Oct22;

// Write a program that stores five student marks in an array. Ask the user to enter an index and display the marks at that position.
// Requirements:
//              Store five marks.
//              Use try - catch while accessing the array.
//              If the index is invalid, display "Invalid Index !"

import java.util.*;

public class Oct22_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] marks = {89, 99, 84, 91, 95};

        System.out.print("Enter the Index to check the marks (1 - 5) : ");
        int idx = sc.nextInt();

        try{
            System.out.println("Marks : " + marks[idx - 1]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Index !!");
        }
        finally {
            System.out.println("Program execution completed.");
            sc.close();
        }
    }
}
