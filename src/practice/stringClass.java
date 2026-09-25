public class stringClass {
    public static void main(String[] args) {

        String s1 = new String("Java");
        String s2 = s1.intern();
        String s3 = "Java";

//        System.out.println(s2);
//        System.out.println(s3 == s2);


        String a = "Apple";
        String b = "Apple";


        System.out.println(a.compareTo(b));

    }
}
