package main.java.com.parttwo.test;

interface SuperClass{
    default int getNumbers(int a, int b){
        return a+b;
    };
}

public class HorseInterface implements SuperClass{
    
    public int getNumbers(int a, int b){
        return a*b;
    };

    public static void main(String[] args) {
        new HorseInterface().getSuper();
        new HorseInterface().getNumbers(5, 10);
    }

    public void getSuper(){
        System.out.println(SuperClass.super.getNumbers(5, 10));
    }
}
