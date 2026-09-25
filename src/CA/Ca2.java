package CA2;
import java.util.*;


    class Student{
        // Encapsulating the variables for the Student class
        private String name;
        private int rollNo;
        private double marks;

        // Paratermised Constructor
        Student(String name, int rollNo, double marks){
            this.name = name;
            this.rollNo = rollNo;
            this.marks = marks;
        }

        // To display the details of the students
        void display(){
            System.out.println("---- Student Details ----");
            System.out.println("Student Name     : " + name);
            System.out.println("Student Roll No. : " + rollNo);
            System.out.println("Student Marks    : " + marks);
            System.out.println("-----------------------------");
        }
    }

    public class Ca2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);            // Scanner class to get the input from the user
            ArrayList<Student> s1 = new ArrayList<>();      // Arraylist to store the details of the Students

            // Storing the Students detail , by taking input from the user in runtime
            s1.add(new Student(sc.next(), sc.nextInt(), sc.nextDouble()));
            s1.add(new Student(sc.next(), sc.nextInt(), sc.nextDouble()));
            s1.add(new Student(sc.next(), sc.nextInt(), sc.nextDouble()));


            // Displaying the output using a normal for loop
            for(int i = 0; i < s1.size(); i++){
                s1.get(i).display();
            }
            sc.close();
        }
    }