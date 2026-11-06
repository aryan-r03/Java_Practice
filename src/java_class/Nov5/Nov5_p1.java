package java_class.Nov5;

// Write a program to create a Student Result Management System:
// Create a Student class.
// Store name, roll number and marks in 3 subjects.
// Calculate total marks and percentage.
// Display Pass or Fail with Student details.
// Save student detials inn a text file.

import java.util.*;
import java.io.*;

class Student{
    String name;
    int rollNo;
    int m1, m2, m3;
    int total;
    double percent;

    Student(String name, int rollNo, int m1, int m2, int m3){
        this.name = name;
        this.rollNo = rollNo;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    void result(){
        total = m1 + m2 + m3;
        percent = (float) (total / 3.0);
    }

    void display(){
        System.out.println("--------------------------------------");
        System.out.print("Name      : \033[32m" + name + "\033[0m\n");
        System.out.print("Roll No.  : \033[32m" + rollNo + "\033[0m\n");
        System.out.print("Marks-1   : \033[32m" + m1 + "\033[0m\n");
        System.out.print("Marks-2   : \033[32m" + m2 + "\033[0m\n");
        System.out.print("Marks-3   : \033[32m" + m3 + "\033[0m\n");
        System.out.println("--------------------------------------");
        if(m1 >= 33 && m2 >= 33 && m3 >= 33){
            System.out.println("    ************ \033[32mPASS\033[0m ************");
        }
        else{
            System.out.println("    ************ \033[31mFAIL\033[0m ************");
        }
        System.out.println("--------------------------------------");
    }

    void saveFile(){
        try{
            FileWriter fw = new FileWriter("result.txt", true);
            fw.write("-------------------------------------------" + "\n");
            fw.write("Name      : " + name + "\n");
            fw.write("Roll No.  : " + rollNo + "\n");
            fw.write("Marks-1   : " + m1 + "\n");
            fw.write("Marks-2   : " + m2 + "\n");
            fw.write("Marks-3   : " + m3 + "\n");
            fw.write("-------------------------------------------" + "\n");

            if(m1 >= 33 && m2 >= 33 && m3 >= 33){
                fw.write(    "************ PASS ************" + "\n");
            }
            else{
                fw.write("    ************ PASS ************" + "\n");
            }
            fw.write("-------------------------------------------" + "\n");

            fw.close();
            System.out.println("Result created and saved successfully !!!");
        }
        catch(Exception e){
            System.out.println("An Error appeared !! " + e.getMessage());
        }

    }
}


public class Nov5_p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Name : ");
        String name = sc.nextLine();

        System.out.print("Roll No : ");
        int rollNo = sc.nextInt();

        System.out.print("Marks-1 : ");
        int m1 = sc.nextInt();

        System.out.print("Marks-2 : ");
        int m2 = sc.nextInt();

        System.out.print("Marks-3 : ");
        int m3 = sc.nextInt();

        Student s = new Student(name, rollNo, m1, m2, m3);

        s.result();
        s.display();
        s.saveFile();

        sc.close();
    }
}
