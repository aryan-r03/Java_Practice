package java_class.Sept17;
/* Create a class Parent : methods : eat (), sleep()
    Create a child class and extend parent class in it and override all the methods and create one more method : repeat();
                in the main method create an object of child class with the help of reference variable of Parent class and call all the
                methods of both class and see what is happening ?
 */

class Parent{
    void eat(){
        System.out.println("The Parent is eating !!! ");
    }

    void sleep(){
        System.out.println("The Parent is sleeping !!! ");
    }
}

class Child extends Parent{
    @Override
    void eat(){
        System.out.println("The Child is eating !!! ");
    }

    @Override
    void sleep(){
        System.out.println("The Child is Sleep !!! ");
    }

    void repeating(){
        System.out.println("The Child is repeating all the activities !!! ");
    }
}


public class Sept17 {
    public static void main(String[] args) {
        Parent p1 = new Child();
        Parent p2 = new Parent();
        p2.eat();
        p2.sleep();

        System.out.println("-------------------------------");

        p1.eat();
        p1.sleep();
        System.out.println("-------------------------------");
        Child c1 = (Child) p1;
        c1.repeating();
    }
}
