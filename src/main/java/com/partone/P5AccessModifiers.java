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

    /* -- Nonaccess Member Modifiers -- */

    // Final Methods: final anahtar kelimesi bir metod için, bu metodun bir alt sınıf tarafından override edilmesini önler ve genellikle bir metodun API işlevselliğini zorlamak için kullanılır.

    // Final Arguments: Bir metod parametresi parantez arasında görünen metod bildiriminin bir parçasıdır. --> public Record getRecord(int fileNumber, int recNumber){}
    // Bir metodun argümanları local variables ile aynıdır. --> public Record getRecord (int fileNumber, final int recNumber){}
    // Final anahtar kelimesi argümanda kullanıldıysa bunun değiştirilemez olduğunu gösterir.

    /* -- Abstract Methods -- */

    // Abstract bir metod içierisinde bir şey bulunmaz. Süslü parantezi olmaz. Başka bir deyişle metod body'si yoktur.
    // Alt classların kullanmasını istediğiniz bir metodunuz varsa abstract olarak işaretlersiniz. --> public abstract void showSample();
    // Abstract olmayan bir classta, abstract bir metod tanımlanamaz.
    // Eğer bir abstract classın alt classı da abstract ise metodları (abstract metodları), implemente etme zorunluğu yoktur.
    // Abstract bir alt class, abstract olan üst classın bütün abstract olan metodlarını implemente etmek zorunda değildir. 
    // Ancak abstract bir alt classı implemente eden normal bir class super classın implemente edilmeyen (abstract alt classı tarafından implemente edilmeyen abstract metodlarını) abstract metodlarınıda implemente etmek zorundadır.
    // Bir class asla ve asla "abstract" ve "final" veya "abstract" ve "private" olarak işaretlenemez.
    // Abstract bir metod implemente edilebilir (Bunun anlamı alt classlar tarafından overrride edilebilir). "final" ve "private" olarak işaretlenmiş bir metod asla alt class tarafından "override" edilemez.
    // Abstract metodlar asla static olarak işaretlenemez.

    /* -- Synchronized Methods -- */

    // "Synchronize" anahtar kelimesi, bir metoda aynı anda yalnızca bir iş parçacığı tarafından erişilebileceğini gösterir. "Synchronize" anahtar kelimesi sadece metodlara uygulanabilir.
    // Ayrıca "synchronize" anahtar kelimesi, dört erişim seviyesinden biriyle eşleştirilebilir, tanımlanabilir.

    /* -- Native Methods -- */

    // Sadece metodlara uygulanabilir.  Classlara yada değişkenlere uygulanamaz.
    // Sınavda "native" bir metodun nasıl kullanıldığını bilmek zorunda değilsiniz. Bunun dışında "native" 'in bir erişim belirleyicisi olduğunu bilmeniz yeterlidir.
    
    /* -- Strictfp Meyhods -- */

    // Bir classın veya metodun bildirimini değiştirebilir ancak bir değişken asla "stricctfp" ile tanımlanamaz.

    /* -- Methods with Variable Argument Lists (var-args) -- */

    // Java, değişken sayıda argüman alabilen metodlar oluşturmamıza olanak sağlar.
    // "variable-length argument lists", "variable arguments", "var-args", "varargs", "variable arity parameters" --> bu isimlerin hepsi verilir.
    // Parametre ve Argüman arasındaki fark nedir?
    // Argümanlar, bir metod çağrımında parantez içindeki verilen değerlere "argüman" denir. --> doStuff("a", 2);
    // Parametreler, metod yapısında metod çağrıldığnda metodun ne alması gerektiğini belirten ifadelerdir. --> void doStuff(String s, int a);

    /* -- Değişkenler için Bildirim Kurallarını Gözden Geçirelim -- */
    
    // Var-arg type, bir var-arg parametresi tanımladığınızda metodun bu parametrelerinin alabileceği argümanların türünü belirlemelisiniz.
    // Basic syntax; var-arg parametresiyle tanımlı bir metod kullanılırsa, üç nokta (...), boşluk ve ardından alınan parametreleri tutacak dizinin adını içeren türü işleyiniz.
    // Other parameters; bir metodda var-arg kullanarak başka parametrelere sahip olmak yasaldır.
    // Var-arg limits; metod yapısında son parametre var-arg olmak zorundadır ve bir metodda sadece bir tane var-arg kullanılabilir.
    
    // Bazı legal ve illegal tanımlamalar:
    // void doStuff(int... x){}             --> legal
    // void doStuff2(char c, int... x){}    --> legal
    // void doStuff3(Animal... animal){}    --> legal
    // void doStuff4(int x...){}            --> illegal (bad syntax)
    // void doStuff5(int...x, char... y){}  --> illegal (too many var args)
    // void doStuff6(String... s, byte b){} --> illegal (var-arg must be last)

}
