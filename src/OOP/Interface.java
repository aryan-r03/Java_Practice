package OOP;
import java.util.Scanner;



interface Calculator{
    int sub(int a, int x);
    int mult(int a, int b);
    float q = 3.11f;
}

class valQ{
    static int q = 5;
}

class result implements Calculator{
    Scanner sc = new Scanner(System.in);


    @Override
    public int sub(int a, int x){
        int c = a - x;
        return c;
    }

    public void display(){
        float q = sc.nextFloat();
//        Calculator.q = (float) this.q;                // will throw an error -- Calculator.q is interface variable (final variable)

        System.out.println(valQ.q);
    }

    public int mult(int a, int b){
        int m = a * b;
        return m;
    }
}

public class Interface {

    public static void main(String[] args) {
        result z1 = new result();

//        System.out.println("The substraction is : " + z1.sub(3, 5));
//        System.out.println("The multiplication is : " + z1.mult(4, 7));
        z1.display();
    }

}
