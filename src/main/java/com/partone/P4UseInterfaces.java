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

}
