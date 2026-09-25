package OOP;
import java.util.Scanner;


public class Vehicle {

    Scanner sc = new Scanner(System.in);
    String model = sc.nextLine();
    int WheelCount = sc.nextInt();

    void display(){
        System.out.println("The vehicle is --> " + model+ "\nThis is a vehicle with " + WheelCount + " wheels");
    }


}
