package java_class.MidSem;
import java.util.*;


//class Animal{
//    void sound(){
//        System.out.println("Sound - 1");
//    }
//}
//class Dog extends Animal{
//
//}


//abstract class Dog{
//    abstract void sound();
//
//    void legs(){
//        System.out.println("4 - Legs");
//    }
//}
//
//class GermanShepard extends Dog{
//    @Override
//    void sound(){
//        System.out.println("Barks");
//    }
//}

//interface IrrNum{
//    float pi1 = 3.14f;
//
//    void val();
//}
//class value implements IrrNum{
//    @Override
//    public void val(){
//        System.out.println(pi1);
//    }
//}


class Box {
    int size = 4;
    void change(Box b) {
        b.size = 9;
    }
}

class Parent {
    int value = 5;
}
class Child extends Parent {
    int value = 12;
}



public class MidSem {
    public static void main() {
//        int[][] arr = new int[3][3];
//

//        Box x = new Box();
//        Box y = x;
//        x.change(y);
//        System.out.println(y.size);
//

        Parent p = new Child();
        System.out.println(p.value);



//        int a = 1;
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print((arr[i][j] = a) + " ");
//                a++;
//            }
//            System.out.println();
//        }
//
//
//        int[][] arr2 = new int[3][];
//
//        for (int i = 0; i < arr2.length; i++) {
//            arr2[i] = new int[i + 2];
//        }

//        for(int[] el : arr2){
//            for(int el2 : el){
//                System.out.print(el2 + " ");
//            }
//            System.out.println();
//        }


//        GermanShepard d1 = new GermanShepard();
//        d1.legs();
//        d1.sound();




//    ArrayList<Integer> num = new ArrayList<>();
//
//        int a = 11;
//        for (int i = 0; i < 11; i++) {
//            num.add(a++);
//        }
//
//
//        for(Integer el : num){
//            System.out.print(el + " ");
//        }







//        ArrayList <ArrayList <Integer>> num2 = new ArrayList<>();
//
//        int a = 1;
//        for(int i = 0 ; i < 3; i++){
//            num2.add(new ArrayList<>());
//
//            for(int j = 0; j < 5; j++){
//                num2.get(i).add(a++);
//            }
//        }
//
//        for(ArrayList<Integer> el : num2){
//            for(Integer el2 : el){
//                System.out.print(el2 + " ");
//            }
//            System.out.println();
//        }





    }
}
