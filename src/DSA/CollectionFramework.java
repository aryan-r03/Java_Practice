package DSA;
import java.util.*;



public class CollectionFramework {

    // List interfaces
    public static void ListExample(){
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        for(int i = 0; i <3; i++) {
            System.out.println("\033[33m" + fruits.get(i) + "\033[0m");
        }

        List<Integer> dig = new ArrayList<>();
        dig.add(10);
        dig.add(100);
        dig.add(1000);

        for(Integer el : dig){
            System.out.print(el + " ");
        }
        System.out.println();
    }

    // Set interfaces
    public static void SetExamples(){
        Set<Integer> nums = new HashSet<>();

        nums.add(10);
        nums.add(10);
        nums.add(20);

        System.out.println(nums);

    }


    public static void main(String[] args) {
//        ListExample();          // List interfaces

//        SetExamples();          // Set interfaces


        System.out.println();

        List<Integer> n = new ArrayList<>();
        n.add(1);
        n.add(11);
        n.add(111);
        n.add(1111);
        n.add(11111);


        List<Integer> n2 = new ArrayList<>();
        n2.add(1);
        n2.add(2);
        n2.add(3);
        n2.add(4);
        n2.add(5);

        System.out.println(n);
        System.out.println(n2);

//        n.addAll(n2);
//        System.out.println(n);

//        n.removeAll(n2);
//        System.out.println(n);

//        n.retainAll(n2);
//        System.out.println(n);

        Object a[] = n.toArray();
        for(Object e : a){
            System.out.print(e + " ");
        }


        Set<Integer> nums = new HashSet<>();

        nums.add(10);
        nums.add(20);
        nums.add(10);

        System.out.println(nums);

    }
}
