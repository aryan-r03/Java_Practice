package OOP;

class one{
    public void printData(){
        System.out.println("1st");
    }
}

class two extends one{

    @Override
    public void printData(){
        System.out.println("Two");
    }
}


public class PolyMorphism {

    public static void main(String[] args) {
        /*two t1 = new two();
        t1.printData();*/

        int a = add(3, 4);
        int b = add(3, 6, 9);
        double c = add(3.14, 2.71);

        System.out.println(" 1 -- > " + a);
        System.out.println(" 2 -- > " + b);
        System.out.println(" 3 -- > " + c);

    }



    public static int add(int a, int b){
        return a + b;
    }

    public static int add(int x, int y, int z){
        return x + y + z;
    }

    public static double add(double a, double b){
        return a + b;
    }
}
