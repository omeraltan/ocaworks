package main.java.com.partone.test2;

enum ClothesSize{
    SMALL(8), MEDIUM(10), LARGE(16);

    ClothesSize(int beden){
        this.size = beden;
    }

    private int size;

    public int getSize(){
        return size;
    }
}

public class TestEnum2 {
    ClothesSize size;
    public static void main(String[] args) {
        TestEnum2 drink = new TestEnum2();
        drink.size = ClothesSize.LARGE;
        System.out.println(drink.size);
    }
}
