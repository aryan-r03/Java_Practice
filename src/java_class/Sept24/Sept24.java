package java_class.Sept24;

/*

Create an abstract Shape class with an area() method.
Create Rectangle and Circle classes using inheritance, constructors, encapsulation and
method overriding to calculate and display their areas.

 */
import java.util.*;

abstract class Shape{
    abstract void area();
}

class Rectangle extends Shape{
    private double length;
    private double breadth;

    Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    void area(){
        double result = length * breadth;
        System.out.printf("Area of Rectangle = %.2f unit - sq",result);
        System.out.println();
    }
}

class Circle extends Shape{
    private double radius;

    Circle(double radius){
        this.radius = radius;
    }

    @Override
    void area(){
        double result = 3.14 * radius * radius;
        System.out.printf("Area of Circle = %.2f unit - sq",result);
        System.out.println();
    }
}

public class Sept24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length and breadth of the rectangle to find it's area : ");
        Rectangle r1 = new Rectangle(sc.nextDouble(), sc.nextDouble());
        r1.area();

        System.out.print("Enter the radius of the circle to find it's area : ");
        Circle c1 = new Circle(sc.nextDouble());
        c1.area();

        sc.close();

    }
}
