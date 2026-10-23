package java_class.Oct22;

// Write a java program that user to enter two integers and displays all arithmetic calculations (+ - x / %).
// Requirements :
//              Take two numbers using scanner.
//              Preform division inside the try block.
//              Handle division by zero using catch.
//              Display "Cannot divide by zero ! " if the second number is zero.


import java.util.*;

public class Oct22_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the 1st number : ");
        int a1 = sc.nextInt();

        System.out.print("Enter the 2nd number : ");
        int a2 = sc.nextInt();

        try {
            System.out.println("------------------------------------------");
            System.out.println("\033[34mAddition\033[0m : " + (a1 + a2));
            System.out.println("------------------------------------------");
            System.out.println("\033[34mMultiplication\033[0m : " + (a1 * a2));
            if (a1 > a2) {
                System.out.println("------------------------------------------");
                System.out.println("\033[34mSubtraction\033[0m : " + (a1 - a2));
            } else {
                System.out.println("-----------------------------------------------------------");
                System.out.println("\033[32mThe SECOND number is smaller !! The Result is a -ve number.\033[0m");
                System.out.println("-----------------------------------------------------------");
                System.out.println("\033[34mSubtrsction\033[0m : -" + (a2 - a1));
            }

            try {
                System.out.println("------------------------------------------");
                System.out.println("\033[34mDivision\033[0m : " + (a1 / a2));
                System.out.println("------------------------------------------");
                System.out.println("\033[34mModulus\033[0m : " + (a1 % a2));
                System.out.println("------------------------------------------");
            }
            catch (ArithmeticException e) {
                System.out.println("\033[31mCannot divide by zero !\033[0m");
            }
        }
        catch (InputMismatchException e1){
            System.out.println("\033[31mInvalid Input !! \033[0m");
        }

        sc.close();
    }
}


