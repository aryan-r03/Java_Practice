package java_class.Oct23;

/* 1. Create an Account class
        - Private variables: accountHolder, accountNumber, and balance.
        - Use a constructor to initialize account details.
        - Provide a getter for the balance.

    2. Create ATM operations
        Implement these methods:
        - checkBalance() — display the current balance.
        - deposit(float amount) — add money if the amount is positive.
        - withdraw(float amount) — deduct money if sufficient balance is available.

    3. Use inheritance
        Create a SavingsAccount class that extends Account.
        - Add a method displayAccountType() that displays "Savings Account".
        - Override the method in the child class if you also create a parent ve₹ion.

    4. Handle exceptions
        Use try, catch, and finally to handle:
        - Lette₹ entered instead of menu numbe₹.
        - Lette₹ entered instead of deposit or withdrawal amounts.
        - Ensure the program displays a message from finally after each transaction attempt.

    5. Create a menu-driven program
    Display this menu repeatedly:
        ========== SMART ATM ==========
        1. Check Balance
        2. Deposit Money
        3. Withdraw Money
        4. Exit
        Enter your choice:
 */


import java.util.*;

class Account {
    private String accountHolder;
    private long accountNumber;
    private float balance;

    Account(String accountHolder, long accountNumber, float balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public float getBalance() {
        return balance;
    }

    public void displayAccountType() {
        System.out.println("General Account");
    }

    public void checkBalance() {
        System.out.printf("Current Balance : ₹. %.2f%n", getBalance());
    }

    public void depositAmount(float amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("Deposit successful !  ₹. %.2f added.%n", amount);
            checkBalance();
        } else {
            System.out.println("Amount must be positive ! ");
        }
    }

    public void withdraw(float amount) {
        if (amount <= 0) {
            System.out.println("Amount must be positive ! ");
        } else if (amount <= balance) {
            balance -= amount;
            System.out.printf(
                    "Withdrawal successful !  ₹. %.2f withdrawn.%n", amount);
            checkBalance();
        } else {
            System.out.println("Insufficient balance ! ");
        }
    }
}

class SavingsAccount extends Account {

    public SavingsAccount(String accountHolder, long accountNumber,
                          float balance) {
        super(accountHolder, accountNumber, balance);
    }

    @Override
    public void displayAccountType() {
        System.out.println("Savings Account");
    }
}

public class Oct23 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SavingsAccount account =
                new SavingsAccount("Aryan", 1000055829L, 10000.00f);

        account.displayAccountType();

        int choice = 0;

        while (choice  != 4) {

            System.out.println("\n========== SMART ATM ==========");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = Integer.parseInt(sc.nextLine());
                System.out.println("------------------------------------------");

                switch (choice) {
                    case 1:
                        try {
                            account.checkBalance();
                        } catch (Exception e) {
                            System.out.println("Error checking balance ! ");
                            System.out.println("------------------------------------------");
                        } finally {
                            System.out.println(
                                    "Transaction attempt completed.");
                            System.out.println("------------------------------------------");
                        }
                        break;

                    case 2:
                        try {
                            System.out.print("Enter deposit amount: ₹. ");
                            float depositAmount = Float.parseFloat(sc.nextLine());

                            account.depositAmount(depositAmount);
                        } catch (NumberFormatException e) {
                            System.out.println(
                                    "Invalid amount !  Enter numbe₹ only.");
                        } finally {
                            System.out.println(
                                    "Transaction attempt completed.");
                        }
                        break;

                    case 3:
                        try {
                            System.out.print(
                                    "Enter withdrawal amount: ₹. ");
                            float withdrawAmount = Float.parseFloat(sc.nextLine());

                            account.withdraw(withdrawAmount);
                        } catch (NumberFormatException e) {
                            System.out.println(
                                    "Invalid amount !  Enter numbe₹ only.");
                        } finally {
                            System.out.println(
                                    "Transaction attempt completed.");
                        }
                        break;

                    case 4:
                        System.out.println(
                                "Thank you for using Smart ATM ! ");
                        break;

                    default:
                        System.out.println("Invalid choice !  Try again.");
                }

            } catch (NumberFormatException e) {
                System.out.println(
                        "Invalid menu input !  Please enter a number.");
            } finally {
                System.out.println("Menu operation completed.");
            }
        }

        sc.close();
    }
}
