package OOP;

// Generic Class (1 dataType)
class One<T> {
    T val;
    public void setVal(T val){
        this.val = val;
    }

    public T display() {
        return val;
    }
}

// Generic Class (2 dataType)
class Two<T, N>{
    T val;
    N name;

    public void setVal(T val, N name){
        this.val = val;
        this.name = name;
    }
    public Two<T, N> display(){
        return this;
    }
}

// Generic Method
class Method{
    public <T> void show(T val){
        System.out.println(val);
    }
}


// Generic Interface
interface Print <T>{
    void print(T val);
}
class PrintM1 implements Print <String>{
    @Override
    public void print(String val){
        System.out.println(val);
    }
}
class PrintM2 implements Print <Integer>{
    @Override
    public void print(Integer val){
        System.out.println(val);
    }
}



public class generic2 {


    public static void main(String[] args) {
        // Generic Class (1 dataType)
        /*One<Integer> o1 = new One<>();
        o1.setVal(123);
        System.out.println("\033[34mInteger type\033[0m");
        System.out.println(o1.display());

        System.out.println("---------------------");

        One<String> o2 = new One<>();
        o2.setVal("abc");
        System.out.println("\033[34mString type\033[0m");
        System.out.println(o2.display());*/


        // Generic Class (2 dataType)
        /*Two<Integer, String> t1 = new Two<>();
        t1.setVal(123, "abc 1");
        Two<Integer, String> d1 = t1.display();
        System.out.println(d1.val);
        System.out.println(d1.name);

        System.out.println("\033[34m ---------------------------- \033[0m");

        Two<String, Integer> t2 = new Two<>();
        t2.setVal("xyz 2", 321);
        Two<String, Integer> d2 = t2.display();
        System.out.println(d2.val);
        System.out.println(d2.name);*/


        // Generic Method
        /*Method m1 =  new Method();
        m1.show(123);
        m1.show("pqrst 1");*/


        // Generic Interface
        PrintM1 p1 = new PrintM1();
        p1.print("String");

        PrintM2 p2 = new PrintM2();
        p2.print(123);


    }

}
