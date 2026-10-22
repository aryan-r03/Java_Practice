package java_class.Oct21;

//        Create an ArrayList<string> to store student names.
//
//        Add Students name to the list.
//
//        Display all student names using a loop.
//
//        Add one new student name at the end.
//
//        Remove a student name entered by the user.
//        Search for a particular student name and display whether it exists.
//        Display the total number of students in the list.

import java.util.*;

public class Oct21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> students = new ArrayList<>();

        System.out.println("Enter names of students:");
        students.add(sc.next());
        students.add(sc.next());
        students.add(sc.next());
        students.add(sc.next());

        System.out.println("------------------------------------------");
        System.out.println("List of the Students");

        for (String n : students) {
            System.out.println("Name of the Student is: " + n);
        }

        System.out.println("------------------------------------------");

        System.out.print("Enter the name of the New Student: ");
        students.add(sc.next());

        System.out.println("------------------------------------------");
        System.out.println("Final Students List:");

        for (String n : students) {
            System.out.println("Name of the Student is: " + n);
        }

        System.out.println("------------------------------------------");

        System.out.print("Enter the name of the student to remove: ");
        String removeName = sc.next();

        if (students.remove(removeName)) {
            System.out.println(removeName + " removed successfully.");
        } else {
            System.out.println(removeName + " not found.");
        }

        System.out.println("------------------------------------------");

        System.out.print("Enter the name of the student to search: ");
        String searchName = sc.next();

        if (students.contains(searchName)) {
            System.out.println(searchName + " exists in the list.");
        } else {
            System.out.println(searchName + " does not exist in the list.");
        }

        System.out.println("------------------------------------------");

        System.out.println("Final Students List:");

        for (String n : students) {
            System.out.println("Name of the Student is: " + n);
        }

        System.out.println("------------------------------------------");
        System.out.println("Total number of students: " + students.size());

        sc.close();
    }
}
