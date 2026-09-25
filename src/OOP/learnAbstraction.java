package OOP;

abstract class calculator{
    abstract void mod(int a, int x);

    public void add(int a, int b){
        int c = a + b;
        System.out.println(c);
    }
}

class Result extends calculator{

    @Override
    void mod(int a, int x){
        int m = a % x;
        System.out.println(m);
        add(a, x);
    }
}

public class learnAbstraction {

    public static void main(String[] args) {
        Result r1 = new Result();
        r1.mod(10, 4);
    }

}
