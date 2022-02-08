package main.java.com.partone.test;

/**
 * Gadget
 */
interface Gadget {

    void doStuff();
}

abstract class Electronic {

    void getPower(){
        System.out.println("plug-in");
    }
}

public class Tablet extends Electronic implements Gadget{

    @Override
    public void doStuff() {
        System.out.println("show book");
    }

    public static void main(String[] args) {
        new Tablet().getPower();
        new Tablet().doStuff();
    }
    
}
