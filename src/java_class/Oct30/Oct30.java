package java_class.Oct30;

// Imagine a shopping mall where three employees are performing different tasks simultaneously.
// You have to create a Java Program using Multithreading to perform all three tasks at the smae time.
// Requirements :-
// Create three separate thread classes :
// Thread 1 -- Billing             Print billing numbers from 1 to 10               Generating Bill : 1
// Thread 2 -- Packing             Print packing items from 1 to 10                 Packing Item : 1
// Thread 3 -- Delivery            Print delivery updates from 1 to 10              Delivering order : 1

// Instructions ;
// 1. Create three separate classes.
// 2. Each class must extend the Thread class.
// 3. Override the run() method in each class.
// 4. Use a loop to print numbers from 1 to 10.
// 5. Create three thread objects inside the main() method.
// 6. Start all three threads using start().

import java.util.*;

class Billing extends Thread{
    public void run(){
        for (int i = 1; i <= 10; i++) {
            System.out.println("Generating Bill : " + i);
        }
    }
}

class Packing extends Thread{
    public void run(){
        for (int i = 1; i <= 10; i++) {
            System.out.println("Packing Item : " + i);
        }
    }
}

class Delivery extends Thread{
    public void run(){
        for (int i = 1; i <= 10; i++) {
            System.out.println("Delivering Order : " + i);
        }
    }
}

public class Oct30 {
    public static void main(String[] args) {
        Billing thread1 = new Billing();
        Packing thread2 = new Packing();
        Delivery thread3 = new Delivery();


        thread3.start();
        thread2.start();
        thread1.start();

    }
}
