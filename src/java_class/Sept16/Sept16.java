package java_class.Sept16;

/*
create a java program for an Employee Management System:

An abstract Employee class with an abstract method calculateSalary(),
Constructor overloading to initialize employee details.
An ArrayList to store multiple employees.
Display employee details and calculated salary.

 */

import java.util.ArrayList;
import java.util.Scanner;

abstract class Employee {
    int id;
    String name;
    String dept;

    Employee() {
        id = 0;
        name = "unknown";
        dept = "unknown";
    }

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
        this.dept = "General";
    }

    Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.dept = department;
    }

    abstract double calculateSalary();

    void display() {
        System.out.println("Name       : " + name);
        System.out.println("ID         : " + id);
        System.out.println("Department : " + dept);
        System.out.println("-------------------------");
        System.out.println("Salary     : " + calculateSalary());
        System.out.println("-------------------------");
    }
}

class FullEmp extends Employee {
    double monthlySal;

    FullEmp(String name, int id, String dept, double monthlySal) {
        super(id, name, dept);
        this.monthlySal = monthlySal;
    }

    @Override
    double calculateSalary() {
        return monthlySal;
    }
}

class PartTimeEmp extends Employee {
    double hourlyRate;
    int hoursWorked;

    PartTimeEmp(String name, int id, String dept, double hourlyRate, int hoursWorked) {
        super(id, name, dept);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

public class Sept16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> e1 = new ArrayList<>();

        e1.add(new FullEmp(sc.next(), sc.nextInt(), sc.next(), sc.nextDouble()));
        e1.add(new FullEmp(sc.next(), sc.nextInt(), sc.next(), sc.nextDouble()));

        e1.add(new PartTimeEmp(
                sc.next(), sc.nextInt(), sc.next(),
                sc.nextDouble(), sc.nextInt()));

        e1.add(new PartTimeEmp(
                sc.next(), sc.nextInt(), sc.next(),
                sc.nextDouble(), sc.nextInt()));

        System.out.println("------------------------------------");
        System.out.println("     Employee Management System     ");
        System.out.println("------------------------------------");

        for (Employee e : e1) {
            e.display();
        }

        sc.close();
    }
}

