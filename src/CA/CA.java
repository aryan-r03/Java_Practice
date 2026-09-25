import java.util.Scanner;

class Student {
    String name;
    int rollNo;
    int marks1;
    int marks2;
    int marks3;

    Student(String name, int rollNo, int marks1, int marks2, int marks3) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }
}

class Result {

    int totalMarks(Student s1) {
        return s1.marks1 + s1.marks2 + s1.marks3;
    }

    double percentage(Student s1) {
        return totalMarks(s1) / 3.0;
    }

    String status(Student s1) {
        if (percentage(s1) >= 40) {
            return "PASS";
        } else {
            return "FAIL";
        }
    }
}

class CA {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
	

        Student s1 = new Student(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());

        Result res = new Result();

        System.out.println("--------------------------------------------");

        System.out.println("Your total marks are: " + res.totalMarks(s1));
        System.out.printf("Your percentage is: %.2f", res.percentage(s1));
        System.out.println();
        System.out.println("Your status is: " + res.status(s1));

        sc.close();
    }
}
