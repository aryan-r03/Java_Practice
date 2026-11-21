package practice;

// Ques : Check Odd - Even
// 1. without using % operator
// 2. without using %, bit-wise operator
// 3. without using %, bit-wise or / operator

import java.util.Scanner;

class CheckEven{
    int n;

    boolean noMod(int n) {
        if((n & 1) == 0){
            return true;
        }
        else{
            return false;
        }
    }

    boolean noModOrBit(int n){

        if ((n / 2) * 2 == n) {
            return true;
        } else {
            return false;
        }
    }

    boolean noModBitOrArithmetic(int n){
        while(n > 1){
            n = n - 2;
        }
        while(n < 0){
            n = n + 2;
        }
        return n == 0;
    }
}

public class OddEven {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to check Odd-Even : ");
        int n = sc.nextInt();

        CheckEven c1 = new CheckEven();

        // Using no Modulo Operator.                        --> Used bit Wise operator.
        boolean res1 = c1.noModOrBit(n);
        if (res1){
            System.out.println("The number (" + n + ") is : \033[32mEVEN " + "\033[0m");
        }
        else{
            System.out.println("The number (" + n + ") is : \033[31mODD " + "\033[0m");
        }



        // Using no Modulo or Bit Operator.                 --> Used / operator.
        boolean res2 = c1.noMod(n);
        if (res2){
            System.out.println("The number (" + n + ") is : \033[32mEVEN " + "\033[0m");
        }
        else{
            System.out.println("The number (" + n + ") is : \033[31mODD " + "\033[0m");
        }




        // Using no %, Bit or / Operator.                   --> Used +- 2 operation.
        boolean res3 = c1.noMod(n);
        if (res3){
            System.out.println("The number (" + n + ") is : \033[32mEVEN " + "\033[0m");
        }
        else{
            System.out.println("The number (" + n + ") is : \033[31mODD " + "\033[0m");
        }
    }
}
