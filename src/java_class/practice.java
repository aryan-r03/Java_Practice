package java_class;
import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("\033[34mDECIMAL -- BINARY\033[0m");
//
//        System.out.print("Enter the decimal value : ");
//        int dec = sc.nextInt();
//        int ans= 0, rem = 0;
//        int base = 1;
//        while (dec > 0){
//            rem = dec % 2;
//            dec /= 2;
//            ans += rem * base;
//            base *= 10;
//        }
//        System.out.println("The binary value is \033[33m : " + ans + "\033[0m");
//
//
//        System.out.println("\033[34mBINARY -- DECIMAL\033[0m");
//        System.out.print("Enter the binary value : ");
//        int bin = sc.nextInt();
//        int r = 0, a = 0;
//        int b = 1;
//
//        while(b > 0){
//            r = bin % 10;
//            bin /= 10;
//            a += r * b;
//            b *= 2;
//        }
//        System.out.println("The decimal value is \033[33m : " + a + "\033[0m");


//        int x = 3, y = 5;
//        String res = (x > y) ? "X > Y" : "Y > X";
//        System.out.println(res);


        ArrayList<Integer> num = new ArrayList<>();

        for (int i = 1; i < 10; i++) {
            num.add(i);
        }

        for(Integer el : num){
            System.out.print(el + " ");
        }
        System.out.println();

        System.out.println(num);

    }





}
