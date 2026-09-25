package java_class;
//  20 August 2026

import java.util.*;

public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//
//        System.out.print("Enter your age : ");
//        int age = sc.nextInt();
//
//
//        if(age < 15){
//            System.out.println("\033[31mYou are too young !!!\033[0m");
//        }
//        else if (age > 15 & age < 18) {
//            System.out.println("\033[31mYou are not Eligible !!!\033[0m");
//        }
//        else if (age >= 18 & age <= 60){
//            System.out.println("\033[32mYou are Eligible !!!\033[0m");
//        }
//        else if (age > 60){
//            System.out.println("\033[31mYou are too old !!!\033[0m");
//        }
//        else{
//            System.out.println("\033[31m Invalid Input");
//        }



//        System.out.print("Enter the number to print the Table : ");
//        int n = sc.nextInt();
//
//        for (int i = 1; i < 11; i++) {
//                System.out.println(n + " x " + i + " = \033[34m" + n * i + "\033[0m");
//            }


        /*              factorial
        System.out.print("Enter the number to find it's factorial : ");
        int num = sc.nextInt();



        int ans = 1;
//        for (int i = 1; i <= num; i++){
//            ans *= i;
//        }

        int i = 1;
        do{
            ans *= i;
            i++;
        }
        while (i <= num);

        System.out.println("The factorial of \033[34m"+ num + "\033[0m is : \033[32m" + ans + "\033[0m");

         */



        //   Continue -- Break

        //      ->      First 10 positive numbers , which are not divisible by 3 .

        for(int i = 1; i <= 10; i++) {
            if(i % 3 != 0){
                System.out.print(i + " ");
            }

        }



        sc.close();
        }

    }




