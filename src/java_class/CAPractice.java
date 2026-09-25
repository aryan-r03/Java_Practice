//package java_class;
//import java.util.Scanner;
//
//class Student{
//    String name;
//    int rollNo;
//    int marks1;
//    int marks2;
//    int marks3;
//
//    Student(String name, int rollNo, int marks1, int marks2, int marks3){
//        this.name = name;
//        this.rollNo = rollNo;
//        this.marks1 = marks1;
//        this.marks2 = marks2;
//        this.marks3 = marks3;
//    }
//
//}
//
//class Result extends Student {
//    Result(String name, int rollNo, int marks1, int marks2, int marks3) {
//        super(name, rollNo, marks1, marks2, marks3);
//    }
//
//    int totalMarks() {
//        return marks1 + marks2 + marks3;
//    }
//
//    double percentage() {
//        return totalMarks() / 3.0;
//    }
//
//    String status() {
//        double percent = percentage();
//
//        if (percent >= 70) {
//            return "PASS";
//        } else {
//            return "FAIL";
//        }
//    }
//
//    void display(){
//        System.out.println("Name: " + name);
//        System.out.println("Roll No: " + rollNo);
//        System.out.println("Marks of sub - 1: " + marks1);
//        System.out.println("Marks of sub - 2: " + marks2);
//        System.out.println("Marks of sub - 3: " + marks3);
//        System.out.println("Total Marks: " + totalMarks());
//        System.out.println("Percentage: " + percentage());
//
//        System.out.println("You are : " + status());
//    }
//
//}
//
//
//
//public class CAPractice {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the name of the Student: ");
//        String name = sc.next();
//
//        System.out.print("Enter your roll no: ");
//        int rollNo = sc.nextInt();
//
//        System.out.print("Enter the marks of sub - 1 : ");
//        int marks1 = sc.nextInt();
//
//        System.out.print("Enter the marks of sub - 2 : ");
//        int marks2 = sc.nextInt();
//
//        System.out.print("Enter the marks of sub - 3 : ");
//        int marks3 = sc.nextInt();
//
//        java_class.Sept9.Result r1 = new java_class.Sept9.Result(name, rollNo, marks1, marks2, marks3);
//
//
//        System.out.println("\n______________________________________________________________________\n");
//        r1.display();
//
//        sc.close();
//    }
//}
