package main.java.com.partone.test2;

import main.java.com.partone.test.Access2;
import main.java.com.partone.test.TestInterface;

public final class Access extends Access2 implements TestInterface{
    public static void main(String[] args) {
        
    }

    public void getErisim(){
        setPublicErisim(22222);
        System.out.println(getPublicErisim());
    }
    public strictfp void getErisim2(){
        TestInterface.test2();
    }

    @Override
    public void para() {
        // TODO Auto-generated method stub
        
    }
}

/**
 * NonaccessClass
 */
final class NonaccessClass {}
abstract class InnerAccess {}
final strictfp class InnerAccess2{}
