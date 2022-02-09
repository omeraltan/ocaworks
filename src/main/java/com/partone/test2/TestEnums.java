package main.java.com.partone.test2;

enum CoffeeSize{BIG, HUGE, OVERWHELMING}

class Coffee{
    CoffeeSize size;
}

public class TestEnums {
    public static void main(String[] args) {
        Coffee drink = new Coffee();
        drink.size = CoffeeSize.BIG;
    }
}

/**
 * InnerTestEnums
 */
class InnerTestEnums {

    enum Coffee {ITALIAN, TURKISH, ARABIC}
    
}