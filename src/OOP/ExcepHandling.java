package OOP;

import java.lang.reflect.Array;
import java.util.Scanner;

public class ExcepHandling {
    // // try ... catch block


    // ArithmeticException
    static void arithmeticExcep(){
        try{
            int result = 10 / 0;
            System.out.println(result);
        }
        catch(ArithmeticException exc){
            System.out.println("Arithmetic Exception ...");
        }
        System.out.println("Program Continues ... .. . ");
    }


    // ArithmeticException -- workflow
    static void aritFlow(){
        try{
            System.out.println("A");
            int num = 10 / 0;
            System.out.println("B");
        }
        catch(ArithmeticException e1){
            System.out.println("C");
        }
        System.out.println("D");
    }


    // ArrayIndexOutOfBondsException
    static void arrExcept(){
        try{
            int[] nums = {1, 2, 3, 4, 5, 6};
            System.out.println(nums[89]);
        }
        catch(ArrayIndexOutOfBoundsException e2){
            System.out.println("The array has only 5 index !");
        }
        System.out.println("--");
    }


    // NullPointerException
    static void pointerExcept(){
        String alp = null;

        try{
            System.out.println(alp.length());
        }
        catch(NullPointerException e3){
            System.out.println("The String 'alp' is a null variable !!! ");
        }
        System.out.println("Program continues !!! ");

    }


    // // try...catch...finally
    static void finallyBlock(){
        int[] arr = {1, 3, 5};
        try{
            System.out.println(arr[5]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("\033[34mThe error is " + e.getMessage() + "\033[0m");
        }
        finally{
            System.out.println("this is the finally... block");
        }
    }


    // // return in try-catch-finally block
    static int abc(){
        try{
            return 13;
        }
        finally{
            System.out.println("Finally block");
        }
    }


    // throws - keyword
    static int test() throws ArithmeticException{
        int c;
        return c = 10 / 0;
    }


    public static void main(String[] args) {
        // try ... catch block
        /*System.out.println("\033[31mArithmetic Exception \033[0m");
        arithmeticExcep();
        System.out.println("\033[32m============================================= \033[0m");

        aritFlow();
        System.out.println("\033[32m============================================= \033[0m");

        System.out.println("\033[31mArray out of bounds Exception \033[0m");
        arrExcept();
        System.out.println("\033[32m============================================= \033[0m");

        System.out.println("\033[31mNUll Pointer Exception \033[0m");
        pointerExcept();
        System.out.println("\033[32m============================================= \033[0m");

        System.out.println("\033[31mtry ... catch ... finally block \033[0m");
        finallyBlock();
        System.out.println("\033[32m============================================= \033[0m");*/

        // return in trty-catch-finally block
        /*int num = abc();
        System.out.println("\033[33mReturn value from abc() --> \033[0m" + num);*/


        // throw ... throws


        Scanner sc = new Scanner(System.in);

        // throw - keyword
        /*int age = 0;
        try{
            System.out.print("Age - > ");
            age = sc.nextInt();
            System.out.println("\033[0m");
            if(age < 0){
                throw new ArithmeticException("\033[34mAge cannot be a -ve number\033[0m");
            }
        }
        finally{
            System.out.println("You have entered your age as -> \033[32m" + age);
        }*/


        // Throws - keyword
        try{
            test();
        }
        catch(ArithmeticException e){
            System.out.println("\033[33m" + e.getMessage() + "\033[0m");
        }
        finally{
            System.out.println("Zero Division Exception");
        }

    }

}
