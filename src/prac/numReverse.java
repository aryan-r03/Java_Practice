package prac;
import java.util.Scanner;

public class numReverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to reverse : ");
        int num = sc.nextInt();
        int reverse = 0;

        int n = num;
        while (n != 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }

        System.out.println("The reverse of \033[33m" + num + "\033[0m is : \033[34m" + reverse + "\033[0m");

        sc.close();
    }
}
