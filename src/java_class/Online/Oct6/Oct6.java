package java_class.Online.Oct6;

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}

class Employee extends Person {
    int salary;

    Employee(String name, int salary) {
        super(name);
        this.salary = salary;
    }
}

class Manager extends Employee {
    int bonus;

    Manager(String name, int salary, int bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Total: " + (salary + bonus));
    }
}

public class Oct6 {
    public static void main(String[] args) {
        Manager m = new Manager("Ravi", 50000, 10000);
        m.display();
    }
}
