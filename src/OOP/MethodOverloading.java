public class MethodOverloading {
    public static void main(String[] args) {

        Calc c1 = new Calc();
        System.out.println("The sum of 3 & 4 is       --> " + c1.add(3, 4));
        System.out.println("The sum of 3.14 & 2.73 is --> " + c1.add(3.14, 2.73));


    }
}


class Calc{

    int add(int a, int b){
        return a + b;
    }

    double add(double a, double b){
        return a + b;
    }

}
