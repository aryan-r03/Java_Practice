package java_class.Sept10;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;


public class Sept10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> num = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the number : ");
            num.add(sc.nextInt());
        }

        System.out.print("Enter the number to check : ");
        int check = sc.nextInt();
        if(num.contains(check)){
            System.out.println("---------------------------------------------------");
            System.out.println("\033[34mThe number exists in the Array List at the index \033[0m" + num.indexOf(check));
            System.out.println("---------------------------------------------------");

        }
        else{
            System.out.println("---------------------------------------------");
            System.out.println("\033[31mThere exists no such number in the ArrayList\033[0m");
            System.out.println("---------------------------------------------");
        }

        sc.close();
    }
}