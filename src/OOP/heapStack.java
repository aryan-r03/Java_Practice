package OOP;

class Data{
    int data = 10;
}


public class heapStack {

    static void changeVar(int a, Data n){
        a = 100;
        n.data = 150;
        System.out.println(a + " " + n.data);

    }

    public static void main(String[] args) {
        int num = 5;

        Data n = new Data();
        n.data = 15;

        System.out.print(num + " ");
        changeVar(num, n);

    }


}
