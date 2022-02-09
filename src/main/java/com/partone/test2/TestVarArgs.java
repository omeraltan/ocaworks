package main.java.com.partone.test2;

public class TestVarArgs {
    public static void main(String[] args) {
        getVarargs(1,2,3,4,5);
        getVarargs2("Deger", 1,2,3,4,5);
    }

    static void getVarargs(int ... x){
        for (int i : x) {
            System.out.println(i);
        }
    }

    static void getVarargs2(String a, int ... x){
        for (int i : x) {
            System.out.println(a + " " + i);
        }
    }
}
