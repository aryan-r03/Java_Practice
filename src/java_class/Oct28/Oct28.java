package java_class.Oct28;
import java.util.*;

class ATM{
    static double withdraw(double amount, double balance) throws Exception {
        if (amount <= 0){
            throw new Exception ("The withdraw amount should must be greater than aero !");
        }
        if (amount > balance){
            throw new Exception ("Insufficient Balance");
        }

        return balance - amount;
    }
}

public class Oct28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = 5000;

        System.out.print("Enter withdrawal amount : ₹ ");
        double amount = sc.nextDouble();

        try{
            balance = ATM.withdraw(amount, balance);

            System.out.println("------------------------------");
            System.out.println("Withdrawal Successful !! ");
            System.out.println("Amount withdrawn:\033[32m ₹ " + amount);
            System.out.println("\033[0mRemaining balance:\033[32m ₹ " + balance + "\033[0m");
        }
        catch (Exception e){
            System.out.println("Error : " + e.getMessage());
        }
        finally{
            System.out.println("------------------------------");
            System.out.println("thank you for using our ATM !!");
            System.out.println("------------------------------");
            sc.close();
        }
    }
}
