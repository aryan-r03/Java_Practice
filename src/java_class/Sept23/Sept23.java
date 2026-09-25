package java_class.Sept23;

/*
    Create Employee and Manager classes using inheritance.
    Use constructor overloading and encapsulation to store details.
    Override a method to calculate final salary and use if - else to classify it as HIGH, MEDIUM or LOW.
 */

class Employee {
    private String name;
    private double salary;

    Employee() {
        name = "Unknown";
        salary = 0;
    }

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public double calculateSalary() {
        return salary;
    }
}

class Manager extends Employee {

    private double bonus;

    Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return getSalary() + bonus;
    }

    public void display() {

        double finalSalary = calculateSalary();

        System.out.println("Name: " + getName());
        System.out.println("Final Salary: " + finalSalary);

        if (finalSalary >= 100000) {
            System.out.println("Salary Level: HIGH");
        }
        else if (finalSalary >= 50000) {
            System.out.println("Salary Level: MEDIUM");
        }
        else {
            System.out.println("Salary Level: LOW");
        }
    }
}

public class Sept23 {

    public static void main(String[] args) {

        Employee e1 = new Employee();

        Employee e2 = new Employee("Rahul", 60000);

        System.out.println("Employee 1 Salary: " + e1.calculateSalary());
        System.out.println("Employee 2 Salary: " + e2.calculateSalary());

        System.out.println();

        Manager m1 = new Manager("Aryan", 80000, 25000);

        m1.display();
    }
}
