package main.java.com.partone;

public class P5AccessModifiers {
    
    /* -- Access Modifiers -- */

    // Bir class 4 erişim seviyesinden sadece ikisini kullanırken (default ve public), üyeler dördünüde kullanabilir.
    // Bir erişim seviyesi yazmadığımızda "default" olarak kabul edilir.
    // "default" ve "protected" bir fark dışında neredeyse aynı davranışa sahiptir.
    // Java 8 ile birlikte "default" kelimesi interfacelerde belirli bir metodu bildirmek içinde kullanılabilir.
    
    /* -- Public Members -- */

    // Bir metod yada değişken üyeler, "public" olarak tanımlandığı zaman, bunun anlamı bütün diğer sınıflar, 
    // hangi pakette olursa olsun üyelere erişebilir (class'ın kendisinin görünür olduğunu varsayarsak).

    /* -- Private Members -- */

    // Private olarak işaretlenmiş üyelere, private üyenin oluşturulduğu classtan başka hiçbir classtan kodla erişilemez.

    /* -- Protected and Default -- */

    // protected ve default erişim seviyeleri arasında bir tane kritik fark vardır.
    // default tanımlanmış bir class'a yalnızca aynı paketten erişilebilirken, protected  bir class'a farklı bir paketteki alt class'tan erişilebilir.
    // Alt class protected bir üyeyi sadece miras olarak görebilir.

    /* -- Local Variables and Access Modifiers -- */

    // Bir erişim seviyesi local bir değişkene uygulanamaz (local variable).
    // Yerel değişkenlere uygulanabilecek tek bir erişim seviyesi vardır. Buda "final" anahtar kelimesidir.

    //      Görünürlük                          Public              Protected               Default                 Private
    //      ----------                          ------              ---------               -------                 -------
    //      Aynı Sınıfta                        Evet                Evet                    Evet                    Evet
    //      Aynı pakette herhangi bir sınıf     Evet                Evet                    Evet                    Hayır
    //      Aynı pakette alt sınıf              Evet                Evet                    Evet                    Hayır
    //      Paket dışı alt sınıf                Evet                Evet (kalıtım yolu)     Hayır                   Hayır
    //      Paket dışı alt sınıf olmayan        Evet                Hayır                   Hayır                   Hayır

    

}
