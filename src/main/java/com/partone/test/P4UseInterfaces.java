package main.java.com.partone.test;

interface StaticIface {
    static int m1(){ return 42; }
}

public class P4UseInterfaces {
    public static void main(String[] args) {
        System.out.println(StaticIface.m1());
        new P4UseInterfaces().go();
    }

    void go(){
        System.out.println(StaticIface.m1());
    }
}


