package main.java.com.parttwo.test;

class Animal{
    public void eat(){}
    public void printYourself(){
        System.out.println("Super classın metoduna ulaştınız.");
    }

}

public class Horse extends Animal {

    public static void main(String[] args) {
        new Horse().printYourself();
    }

    public void printYourself(){
        // super anahtar kelimesi ile super class ın metodnuna ulaşabildik.
        super.printYourself();
    }
}
