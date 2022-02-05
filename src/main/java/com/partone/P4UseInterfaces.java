package main.java.com.partone;

public class P4UseInterfaces {
    
    /** -- Use Interfaces -- */

    // interface metodlar uygulanmak zorundadır ve "public" olarak işaretlenmek zorundadır.
    // Bir abstract class'ta abstract ve nonabstract metodlar tanımlanabilir. Bir interface'de genellikle abstract metodlar vardır.
    // interfacelerin kuralları katıdır.
    // interface metodlar dolaylı olarak "public" ve "abstract" 'tır ("default" veya "static" olarak tanımlanmadıkça).
    // Başka bir deyişle aslında "public" yada "abstract" işaretlerini metod bildiriminde yazmanız gerekmez, ancak metod yinede her zaman public ve abstract'tır.
    // Bir interface'de tanımlanan bütün değişkenler "public", "static" ve "final" olmalıdır.
    // Başka bir deyişle interfaceler "instance variable" 'ları değil yalnızca sabitleri (constant) bildirebilirler.
    // interface metodlar "final", "strictfp" veya "native" olarak işaretlenemezler.
    // Bir interface  bir veya daha fazla diğer interfaceler tarafından kalıtılabilir (extends).
    // Bir interface, başka bir interface dışında kalıtılamaz (extend edilemez).
    // Bir interface, başka bir interface'den "implement" edilemez.
    // Bir interface, "interface" anahtar kelimesiyle tanımlanmak zorundadır.
    // interface tipleri polimorfik olarak kullanılabilir.
    // Legal interface tanımı:
    // * public abstract interface Rollable { }
    // * public interface Rollable { }              ikisde aynıdır.

    // Legal declarations:
    // void bounce();
    // public void bounce();
    // abstract void bounce();
    // public abstract void bounce();
    // abstract public void bounce();

    //won't compile:
    // final void bounce();
    // private void bounce();
    // protected void bounce();

    /* -- Declaring Interface Constants -- */

    // interface sabitleri (constant) "public static final" olmak zorundadır. Belirtilmesede default olarak bu şekildedir.

    // interfaceler için legal değişkenler:
    // public int x = 1;
    // int x = 1;
    // static int x = 1;
    // final int x = 1;
    // public static int x = 1;
    // public final int x = 1;
    // static final int x = 1;
    // public static final int x = 1;

    /* -- Declaring default interface methods -- */

    // Default metodlar "default" anahtar kelimesi ile tanımlanır.
    // Default anahtar kelimesi sadece interface metod yapılarında kullanılır, class metod yapısında kullanılmaz.
    // Default metodlar private, protected, static, final veya abstract olarak işaretlenemezler.
    // Default metodların somut bir metod içeriği olma zorunluluğu vardır.

    // Legal ve illegal bazı default metodların gösterimi:
    // default int m1(){ return 1; } --> legal
    // public default void m2(){ ; } --> legal
    // static default void m3(){ ; } --> illegal
    // default void m4();

    /* -- Declaring static interface methods -- */

    // Java 8'den itibaren, interfaceler somut ve static metodlar içerebilirler.
    // static interface metodlar "static" anahtar kelimesiyle tanımlanır.
    // static interface metodlar public olarak tanımlıdır ve opsiyonel özelliği "public" 'tir.
    // static interface metodlar "private", "protected", "final" veya "abstract" olarak işaretlenemezler.
    // static interface metodlar somut metod içeriğine sahip olmak zorundadır.

    // Legal ve illegal bazı static interface metodların gösterimi:
    // static int m1(){ return 42; }    --> legal
    // public static void m2() { ; }    --> legal
    // final static void m3() { ; }     --> illegal : final not allowed
    // abstract static void m4() { ; }  --> illegal : abstract not allowed
    // static void m5();                --> illegal : needs a method body

}
