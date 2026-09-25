
public class methodPrac {
    public static void main(String[] args) {

//        average(5, 9);
//        autoAvg(3, 2);

        int a = 5;
        int b = 55;
        int minimum = Math.min(a, b);
        System.out.println("The min of " + a + " " + b + " is " + minimum);
    }

    public static void autoAvg(int x, int y){
        var avg = (x + y)/2;
        System.out.println("The average could be " + avg);
    }

    public static void average(int a, int b) {
        int avg = (a + b)/2;
        System.out.println("The average is " + avg);
    }


}


