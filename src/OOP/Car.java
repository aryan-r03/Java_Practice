package OOP;

public class Car extends Vehicle{

    void start(){
        System.out.println("The reference object is --> " + this);
        System.out.println("The reference instance is --> " + this.model);
        System.out.println("The reference instance is --> " + this.WheelCount);
        System.out.println("The car is starting");


    }

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.display();
        c1.start();
    }
}
