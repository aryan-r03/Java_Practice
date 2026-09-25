package OOP;

class parent{
    int x = 10;
}

class child extends parent{
    int x = 20;

    void show(){
        System.out.println(this.x);     // 20
        System.out.println(super.x);    // 10
    }
}

public class thisSuper{
    public static void main(String[] args) {

        child c1 = new child();
        c1.show();

    }
}