package main.java.com.partone.test2;

import main.java.com.partone.test.TestClass;

public class TestClass2 extends TestClass{
    public static void main(String[] args) {
        new TestClass2().deneme();
    }

    public void deneme(){
        TestClass test = new TestClass();
        System.out.println(test.deger2);
        System.out.println(new TestClass().deger2);
        System.out.println(deger3);
    }

    public String getLocalVariables(final int c, final String b){

        final String a = "Omer";

        return a;
    }
}
