package DSA;
import java.util.ArrayList;
import java.util.Scanner;



public class arrrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
//            i = sc.nextInt();
            arr.add(sc.nextInt());
        }

        for(Integer el : arr){
            System.out.print(el + " ");
        }
    }
}
