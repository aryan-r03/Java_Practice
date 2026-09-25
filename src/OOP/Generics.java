package OOP;

import java.util.ArrayList;

// Generic Class

class Box<T, S>{
    T value;
    S name;
    public void setValue(T value, S name){
        this.value = value;
        this.name = name;
    }

    public Box<T, S> getBox(){
        return this;
    }

}

class Try<T>{
    T abc;
    public void display(T abc){
        this.abc = abc;
    }

    public T getDisplay(){
        return abc;
    }
}

public class Generics {
    public static void main(String[] args) {
        ArrayList <Integer> list1 = new ArrayList<>();
        /*        ---------
                      ^
                      |
                   this part is Datatype parameter (Generic) for the ArrayList          */

        list1.add(31);
        list1.add(-5);
        list1.add(54);
        list1.add(122);

        /*
        for(int i = 0; i < list1.size(); i++){
            try{
                System.out.println(list1.get(i));
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("\033[32m" + e.getMessage() + "\033[0m");
            }
        }
        */




        // Generic Class
        /*Box<Integer, String> box = new Box<>();
        box.setValue(50, "John");
        Box<Integer, String> b = box.getBox();

        System.out.println(b.value);
        System.out.println(b.name);*/

        Try<String> t1 = new Try<> ();
        t1.display("try 1");
        System.out.println("\033[34mString dataType\033[0m");
        System.out.println(t1.getDisplay());

        Try<Integer> t2 = new Try<> ();
        t2.display(21);
        System.out.println("\033[34mInteger dataType\033[0m");
        System.out.println(t2.getDisplay());
    }
}
