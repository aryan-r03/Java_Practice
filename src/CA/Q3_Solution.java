// Solution for Q3
import java.util.*;  // To import all the necessary packages from Java.util

class Student{
    // Encapsulation of variables of the Student class
    private String name;
    private int rollNo;
    private double marks;


    // Parameterised Constructor
    Student(String name, int rollNo, double marks){
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }


    // To display the details of the students 
    void display(){
        System.out.println("---- Student Details ----");
        System.out.println("Name     : " + name);
        System.out.println("Roll No. : " + rollNo);
        System.out.println("Marks    : " + marks);
        System.out.println("------------------------");
        System.out.println();
    }
}

public class Q3_Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                       // Scanner class to take the details from the user
        ArrayList<Student> s1 = new ArrayList<>();                 // ArrayList class to store the student details 

        s1.add(new Student(sc.next(), sc.nextInt(), sc.nextDouble()));     // Details of student 1
        s1.add(new Student(sc.next(), sc.nextInt(), sc.nextDouble()));     // Details of student 2
        s1.add(new Student(sc.next(), sc.nextInt(), sc.nextDouble()));     // Details of student 3


        // Normal for loop to get the details of all the students 
        for(int i = 0; i < s1.size(); i++){
            s1.get(i).display();
        }
       
        sc.close();   // closing the Scanner class
    }
}