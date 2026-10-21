package java_class.Online.Oct7;

class Account{
    private String accountHolder;
    private int accountNumber;
    private double balance;


    Account(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;

            System.out.println("Withdraw  : ₹" + String.format("%.0f", amount)
                          + "\nRemaining : ₹" + String.format("%.0f", balance));
            System.out.println("-------------------------");
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    double getBalance() {
        return balance;
    }

    void displayAccountInfo() {
        System.out.println(" Account Holder : " + accountHolder
                       + "\n Account Number : " + accountNumber
                       + "\n Balance        : ₹" + String.format("%,.0f", balance));
        System.out.println("-------------------------");
    }
}


class SavingsAccount extends Account {

    private double interestRate = 5.0;

    SavingsAccount(String accountHolder, int accountNumber, double balance) {
        super(accountHolder, accountNumber, balance);
    }

    @Override
    void displayAccountInfo() {
        super.displayAccountInfo();

        double interest = getBalance() * interestRate / 100;

        System.out.println("Interest (5%) : ₹" + String.format("%.0f", interest));
        System.out.println("Final Balance : ₹"
                + String.format("%.0f", getBalance() + interest));
        System.out.println("-------------------------");

    }
}


public class Oct7 {

    public static void main(String[] args) {

        SavingsAccount account =
                new SavingsAccount("Rahul", 1025, 10000);

        account.displayAccountInfo();

        account.withdraw(2500);

        double remainingBalance = account.getBalance();
        double interest = remainingBalance * 5 / 100;

        System.out.println("Interest (5%) : ₹" + String.format("%.0f", interest));
        System.out.println("Final Balance : ₹"
                + String.format("%.0f", remainingBalance + interest));

        System.out.println("=========================");
        System.out.println("Transaction Successful!");
        System.out.println("=========================");

    }
}