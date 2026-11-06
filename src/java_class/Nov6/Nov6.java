package java_class.Nov6;

/*
Develop a Java application for a College Fees Management System using the concept of Packages, Constructors,
Objects, and Final Variables.
A college charges a fixed registration fees of 10,000 from every student. The tuition fee may vary form
student to student. Your task is to create a Java Package that calculates the total fee payable by a student.

Requirements :
    - Create a package named college.
    - Inside the package, create a public class named FeeStructure.
    - Declare a final variable named Registration_Fee and initialize it with ₹ 10000.
    - Declare an integer named tuitionFee to store the student's tuition fee.
    - Create a parameterized constructor that accepts the tuition fee from the calling class and initializes the
    tuitionFee variable.
    - Create a method named calculateTotalFee() that calculates and displays :
                - Registration Fee
                - Tuition Fee
                - Total Fee

Create another java class named Main outside the college package.
Import the FeeStructure class into Main.java.
Declare a tuition fee variable in the main() method and pass its value to the FeeStructure constructor.
 */



import java_class.Nov6.College.FeeStructure;


public class Nov6 {
    public static void main(String[] args) {

        int tuitionFee = 75000;

        FeeStructure student = new FeeStructure(tuitionFee);

        student.calculateTotalFee();
    }
}
