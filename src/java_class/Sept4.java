package java_class;
import java.util.Scanner;

class Addition{
    int add(int a, int b, int c){
        return a + b + c;
    }

    double add(double a, double b, double c){
        return a + b + c;
    }
}

public class Sept4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Addition a1 = new Addition();

        System.out.println("Enter 3 \033[32mINTEGER\033[0m numbers : ");
        int sum1 = a1.add(sc.nextInt(), sc.nextInt(), sc.nextInt());

        System.out.println("The sum of 3 integers are: \033[34m" + sum1 + "\033[0m\n");



        System.out.println("Enter 3 \033[32mDOUBLE\033[0m numbers : ");
        double sum2 = a1.add(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

        System.out.println("The sum of 3 integers are: \033[34m" + sum2 + "\033[0m\n");

        sc.close();


    }
}
