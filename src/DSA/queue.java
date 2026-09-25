package DSA;

import java.util.*;

public class queue {
    public static void main(String[] args) {
        //PriorityQueue
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(50);
        pq.add(90);
        pq.add(40);
        pq.add(20);
        pq.add(50);
        pq.add(10);

//        System.out.println(pq);


        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Kiwi");
        fruits.add("Mango");
        fruits.add("Orange");


        Iterator<String> fe = fruits.iterator();
        int i = 1;
        while(fe.hasNext()){
            System.out.println(i + " -- " + fe.next());
            i++;
        }
        System.out.println();

    }
}
