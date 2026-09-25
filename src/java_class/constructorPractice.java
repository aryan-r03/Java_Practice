package java_class;

import java.sql.SQLOutput;

class ABC{
    String name;
    int age;

    ABC(String n, int a) {
        this.name = n;
        this.age = a;

        System.out.println("Object created !! ");
    }
}

class show{
    static void display(ABC a){
        System.out.println(a.name);
    }
}


public class constructorPractice {
    public static void main(String[] args) {
        ABC obj = new ABC("ARYAN", 21);
        System.out.println("Name is : \033[34m" + obj.name + "\033[0m");
        System.out.println("Age is  : \033[35m" + obj.age + "\033[0m");

        show.display(obj);
    }
}
