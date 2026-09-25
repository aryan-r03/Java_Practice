public class classObjects {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Bruno", "Golden Retriver", 3);
        dog1.walk();
        dog1.bark();
        dog1.display();

        Dog dog2 = new Dog("Sherlock", "German Shepard", 4);
        dog2.display();


    }
}


class Dog{
    String name;
    String breed;
    int age;

    Dog(String n, String breed, int age){
        this.name = n;
        this.breed = breed;
        this.age = age;
    }

    void walk(){
        System.out.println("The dog is \033[3m\033[4mwalking\033[0m");
    }

    void bark(){
        System.out.println("The dog is barking");
//        display();
    }

    void display(){
        System.out.println("Dog name is \033[34m" + name +"\033[0m of the \033[34m" + breed + "\033[0m Breed \nHis age is \033[34m" +age+ "\033[0m year"+"\033[0m");
        for(int i = 0; i < 10; i++){
            System.out.print("------");
        }
        System.out.println();
    }
}









