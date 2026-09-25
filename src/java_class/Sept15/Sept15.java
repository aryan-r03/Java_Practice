package java_class.Sept15;
import java.util.Scanner;

class Student{
    int id;
    String name;
    int total;
    int marks1;
    int marks2;
    int marks3;

    Student(){
        id = 0;
        name = "unknown";
        total = 0;
        marks1 = 0;
        marks2 = 0;
        marks3 = 0;
    }

    Student(String name, int id, int total, int marks1, int marks2, int marks3){
        this.name = name;
        this.id = id;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
        this.total = total;
    }

    Student(Student s){
        this.id = s.id;
        this.name = s.name;
        this.marks1 = s.marks1;
        this.marks2 = s.marks2;
        this.marks3 = s.marks3;
        this.total = s.total();
    }

    int total(){
        return marks1 + marks2 + marks3;
    }

    void display(){
        System.out.println("Name    : " + name);
        System.out.println("ID      : " + id);
        System.out.println("Marks 1 : " + marks1);
        System.out.println("Marks 2 : " + marks2);
        System.out.println("Marks 3 : " + marks3);
        System.out.println("-------------------");
        System.out.println("Total   : " + total());
        System.out.println("-------------------");
    }

}

public class Sept15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();

        Student s2 = new Student( "Aryan",16,  300, 89, 88, 97);

        Student s3 = new Student(s2);

        System.out.println("Default Constructor:");
        s1.display();

        System.out.println("Parameterized Constructor:");
        s2.display();

        System.out.println("Copy Constructor:");



        sc.close();

    }
}
