
import java.util.Scanner;

public class Learn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // // Decimal to Binary.
        /*
        System.out.print("Enter the decimal --> ");
        int decimal = sc.nextInt();
        int rem, ans = 0, base = 1;
        System.out.println();

        while (decimal > 0){
            rem = decimal % 2;
            decimal /= 2;

            ans = ans + rem * base;
            base *= 10;
        }
        System.out.println("The Binary form is --> " + ans);
*/


        // // Binary to Decimal.
        /*System.out.print("Enter the binary number --> ");
        int binary = sc.nextInt();
        int rem;
        int answer = 0;
        int base = 1;

        while(binary > 0){
            rem = binary % 10;
            binary /= 10;

            answer = answer + rem * base;
            base *= 2;
        }
        System.out.println(answer);*/


        // //
        int[] numbers = new int[5];
        for(int i = 0; i< numbers.length; i++){
            numbers[i] = sc.nextInt();
        }

        sc.close();
        int smallest = Integer.MAX_VALUE;


        for(int num : numbers){
            if(num < smallest){
                smallest = num;
            }
        }



        System.out.println("The maximum value of the element is : " + smallest);
    }
}
