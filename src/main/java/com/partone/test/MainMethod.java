package main.java.com.partone.test;

public class MainMethod {

    public static void main(String...args) {
        new MainMethod().test();
        main(1, 2);
    }

    public static void main(String[] args, int b) {
        new MainMethod().test();
    }

    public static void main(int a, int b) {
        System.out.println("overload edilmiş main metodu");
    }

    // public static void main(String[] ömer) {
    //     new MainMethod().test();
    // }

    // public static void main(String bang_a_gang[]) {
    //     new MainMethod().test();
    // }

    public void test(){
        System.out.println("Main methoda ulaşıldı.");
    }
}
