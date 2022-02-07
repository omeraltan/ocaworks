package main.java.com.partone;

public class P6ConstructorDeclarations {
    
    public static void main(String[] args) {
        
    }

    /* -- Constructor Declarations -- */

    // Her class'ın bit constructor'u vardır. Ancak siz bir tane oluşturmazsanız, derleyici sizin için bir tane oluşturacaktır.
    // Örnek verecek olursak:
    //          class Foo{
    //              protected Foo(){}       --> constructor
    //              protected void Foo(){}  --> this is badly named, but legal, method ("void" metod olduğunu gösterir)
    //          }

    // Dikkat edilmesi gereken ilk şey yapıcıların çok fazla metodlara benxediğidir.
    // Önemli bir fark, bir constructorın asla ve asla bir dönüş türüne sahip olamayacağıdır.
    // Ancak constuctor bildirimleri normal erişim seviyesinin hepsine sahip olabilir ve aynı metodlar gibi argümanlar alabilir (including var-args)
    // En büyük kuralı, classları ile aynı ismi alırlar.
    // Bir class, "static", "final" veya "abstract" olarak işaretlenemez.
    // Bazı legal ve illegal constructor tanımları:
    //          class Foo2{
    //              Foo2(){}                --> legal
    //              private Foo2 (byte b){} --> legal
    //              Foo2(int x){}           --> legal
    //              Foo2(int x, int ...y){} --> legal
    //              
    //              void Foo2(){}           --> it's a method, not a constructor
    //              Foo(){}                 --> not a method on a  constructor
    //              Foo2(){}                --> looks like on abstract method
    //              static Foo2(long x)     --> can't be static
    //              final Foo2(float f){}   --> can't be final
    //              abstract Foo2(char c){} --> can't be abstract
    //              Foo2(int ... x, int t){}--> bad var-arg syntax                
    //          }

    /* -- Variable Declarations -- */

    // Java'da iki tip değişken tanımı vardır.
    // "Primitive" (ilkel); bir primitive tip şu 8 tipten biri olabilir: "char", "boolean", "byte", "short", "int", "long", "double", "float"
    // Bunlardan biri ile primitive tip tanımlanır. Primitive tipler asla değiştirilemezler (Çoğu durumda değeri değiştirilmesine rağmen)
    // "Referance variable"; bir referance variable bir nesneye başvurarak kullanılır. Bir referance variable spesifik tiplerde tanımlanır.
    // Bu tipler asla değiştirilemezler. Bir referance variable tanımlı tiplerde bir nesneye başvurur veya tanımlı tiplerin alt tipine.

    /* -- Declaring Primitives and Primitive Ranges -- */

    // Primitive tip değişkenler class değişkenleri olarak bildirilebilirler veya instance variable, metod parametreleri veya local variables olarak tanımlanabilirler.
    // Tek bir satırda aynı tipte bir çok primitive variables tanımlanabilir.
    //          byte b;
    //          boolean myBooleanPrimitve;  
    //          int x, y, z;                --> declare three int primitives
    // Sınav için tamsayı tipleri olarak küçükten büyüğe doğru sıralarsak byte, short, int, long şeklindedir ve double, float'tan daha büyüktür.
    // Java'daki altı sayı türünün tümü, belirli sayıda 8 bit bayttan oluşru ve imzalanır; bu, negatif veya pozitif olabilecekleri anlamına gelir.
    // En soldaki bit (en anlamlı basamak) 1'in negatif ve 0'ın pozitif olduğu anlamına gelen işareti temsil etmek için kullanılır. 
    // Bitlerin geri kalanı ikinin tamamlayıcı gösterimini kullanarak değeri temsil eder.

    //          Type               Bits             Bytes               Minimum Range               Maximum Range
    //          ----               ----             -----               -------------               -------------
    //          byte                8                 1                       -2^7                        2^7-1
    //          short               16                2                       -2^15                       2^15-1
    //          int                 32                4                       -2^31                       2^31-1
    //          long                64                8                       -2^63                       2^63-1
    //          float               32                4                        n/a                          n/a
    //          double              64                8                        n/a                          n/a
    
    // Boolean: bit derinliği yoktur "Sanal Makineye bağımlıdır."
    // Char   : 16 bit Unicode karakter içerir. Unicode karakterler işaretsiz 16 bit tam sayılarla temsil edilir. 
    // Bu da 0 ile 65535 (216-1) arasında değişen 216 olası değer anlamına gelir.

    /* -- Declaring Referance Variables -- */

    // Referance variables "static variables", "instance variables", "method parameters" veya "local variables" olarak tanımlanabilirler.

    /* -- Instance Variables -- */

    // Classların içinde tanımlanırlar. Ancak herhangi bir metodun dışında tanımlanır ve yalnızca class başlatıldığında başlatılırlar.
    //                  class Employee{
    //                      private String name;
    //                      private String title;
    //                      private String manager;
    //                  }
    // instance variables ile ilgili şunları bilmemiz gereklidir:
    //  * final olarak işaretlenebilirler.
    //  * Transient olarak işaretlenebilirler.
    //  * Abstract olarak işaretlenebilirler.
    //  * Synchronized olarak işaretlenebilirler.
    //  * Strictfp olarak işaretlenebilirler.
    //  * Native olarak işaretlenebilirler.
    //  * Statik olarak işaretlenebilirler.
    //          Local Variables                 Variables(nonlocal)                     Methods
    //          ---------------                 -------------------                     -------
    //                final                             final                            final
    //                                                  public                           public
    //                                                  protected                        protected
    //                                                  private                          private
    //                                                  static                           static
    //                                                  transient                           
    //                                                  volatile                         abstract
    //                                                                                   synchronized
    //                                                                                   strictfp
    //                                                                                   native
    
    /* -- Local (Automatic/Staack/Method) Variables */

    // Bir metod içinde bildirilen bir değişkendir. Local variables, metodların içindeki yaşamına başladığı gibi, metod tamamlandığında da yok olur.
    // Her zaman stack'te tutulur.
    // Bir class içerisinde aynı isimde hem "instance variable" hem de "local variable" tanımlanması mümkündür. Buna "shadowing" denilir.

    //              class Foo{
    //                  int size = 27;
    //                  public void setSize(int size){
    //                      size = size;                --> Which size equals which size???
    //                  }
    //              }
    // Yukarıdaki problemi nasıl çözeriz? tabiki "this" anahtar kelimesini kullanarak. "this" anahtar kelimesi her zaman şu an çalışan nesneye başvurur.
    //              class Foo{
    //                  int size = 27;
    //                  public void setSize(int size){
    //                      this.size = size;
    //                  }
    //              }


}
