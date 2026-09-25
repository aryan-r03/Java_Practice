package OOP;

class student implements Cloneable{
    int age = 21;

    public student copy() throws CloneNotSupportedException{
        return (student) clone();
    }
}

class Student{
    int age = 21;

    Student(){}

    Student(int age){
        this.age = age;
    }


    //equals()
    @Override
    public boolean equals(Object obj){
        Student other = (Student) obj;    //  --->   The students are equal if their age is equal.

        return this.age == other.age;
    }

    // hashCode()
    public void hashing(Object x){
        System.out.println("The hash code of the object is --> " + x.hashCode());
    }


    // toString()
    @Override
    public String toString(){
        return "Student age = " + age;
    }
}

public class ObjClass {
    public static void main(String[] args) {
        Student s = new Student(22);
        Student s1 = new Student(22);

        Student s2 = new Student();

        System.out.println(s == s1);
        System.out.println(s.equals(s1));

        s.hashing(s);
        s1.hashing(s1);
        // Since equals() is overridden , despite s and s1 have different hash-codes it is returning that they are equal.

        System.out.println(s2.getClass());
        System.out.println(s2.getClass().getName());



        // Cloneable;




    }
}
