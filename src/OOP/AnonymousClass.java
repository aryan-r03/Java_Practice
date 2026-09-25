package OOP;

class OuterClass{
    void display(){
        System.out.println("Outer class");
    }
}


interface OuterInterface{
    void OuterInterFace();
}

interface FuncInterface{
    void FuncInterFace();
}

interface Lambda{
    void lam(int a);
}

public class AnonymousClass {


    // Anonymous Class extended form SuperClass

    OuterClass obj = new OuterClass() {
        @Override
        void display(){
            System.out.println("Anonymous (Inner) class");
        }
    };


    // Anonymous Class implemented form interface

    OuterInterface obj2 = new OuterInterface() {
        @Override
        public void OuterInterFace() {
            System.out.println("Anonymous (Inner) Interface");
        }
    };


    // Functional Interface -- Lambda Function
    FuncInterface obj3 = () -> {
        System.out.println("Functional  Interface");
    };

    // Lambda Function with a parameter
    Lambda l1 = (int a) -> {
        int c = a * a;
        System.out.println(c);
    };


    public static void main(String[] args) {

        AnonymousClass a1 = new AnonymousClass();

        a1.obj.display();
        a1.obj2.OuterInterFace();
        a1.obj3.FuncInterFace();
        a1.l1.lam(5);



    }
}
