package main.java.com.parttwo.test;

class Animal2{
    public void eat() throws Exception{

    }
}

/**
 * Dog2
 */
public class Dog2 extends Animal2{

    public void eat(){

    }

    public static void main(String[] args) {
        Animal2 a = new Animal2();
        Dog2 d = new Dog2();
        d.eat();
        //a.eat(); // --> compiler error -unreported exception
    }
}