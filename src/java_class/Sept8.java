package java_class;
import java.util.*;

interface Students {
    void getDetails();
    void showDetails();
}

class StudDetails implements Students{
    String name;
    int rollNo;
    int age;
    int mark;

    @Override
    public void getDetails(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        name = sc.nextLine();

        System.out.print("Enter student age: ");
        age = sc.nextInt();

        System.out.print("Enter roll number: ");
        rollNo = sc.nextInt();

        System.out.print("Enter marks: ");
        mark = sc.nextInt();
    }

    @Override
    public void showDetails() {
        System.out.println("\nStudent Details:");
        System.out.println("-----------------------------------");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + mark);
    }


}

public class Sept8 {
    public static void main(String[] args) {
        Students s = new StudDetails();

        s.getDetails();
        s.showDetails();
    }
}
