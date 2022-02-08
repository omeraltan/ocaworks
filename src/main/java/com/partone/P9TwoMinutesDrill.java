package main.java.com.partone;

public class P9TwoMinutesDrill {
    
    /* -- 2 Dakikalık Egzersiz -- */

    // Tanımlamalar bir harf, alt çizgi veya parabirimi karakteri ile başlayabilir.
    // İlk karakterden sonra tanımlamalar rakamlar da içerebilir.
    // Tanımlayıcılar herhangi bir uzunlukta olabilir.
    // Komut satırını kullanarak java programlarını derleyebilir ve çalıştırabiliriz (sırasıyla javac ve java programları).
    // "main()" metodu owerride edilebilir.
    // Bir class, yalnızca bir "package" ifadesine sahip olabilir ancak birden fazla import içerebilir.
    // "package", bir kaynak dosyada ilk satır olmalıdır.
    // "import" 'lar', package ile class arasında tanımlanmalıdır.
    // "package" ifadesi yoksa "import" ifadeleri, kaynak dosyadaki ilk ifadeler olmalıdır.
    // package ve import ifadeleri, dosyadaki tüm class'lar için geçerlidir.
    // Bir class'ta birden fazla nonpublic class olabilir.
    // class'ların adlandırma kısıtlaması yoktur.
    // 3 tane erişim seviyesi belirteci vardır (public, protected, private).
    // 4 tane erişim seviyesi derecesi vardır (default, public, protected, private).
    // class'lar sadece "default" ve "public" olabilir.
    // "default" erişime sahip bir class yalnızca aynı paket içindeki class'lar tarafından görülebilir.
    // public erişime sahip bir class, aynı paketteki veya başka paketlerdeki bütün class'lar tarafından erişilebilir.
    // class'lar ayrıca final, abstract veya strictfp ile etiketlenebilir.
    // final ile etiketlenen bir class'ın alt class'ı olamaz (extends edilemez.).
    // Bir class'ta "abstract" bir metodun tanımlanması, bu sınıfında abstract olduğu yada olması gerektiği anlamına gelir.
    // abstract bir class abstract veya nonabstract metodlar içerebilir.
    // abstract bir class'ı miras alan bir class, abstract class'taki bütün abstract metodları miras almak zorundadır.
    // Genellikle bir interface  100% bir abstract class gibidir ve interfacelere abstract modifiers'ları yazıp yazmamanız önemli değildir.
    // Genellikle interfaceler, abstract metodlara sahiptirler.
    // interfaceler public, static ve final sabitlere sahip olabilirler.
    // interfacelerde public, static ve final isteğe bağlıdır.
    // Java 8 ile birlikte interfaceler "default" veya "static" metodlara sahip olmuştur.
    // Bir interface başka bir abstract class tarafından "implement" edilebilir.
    // Abstract bir class, interface'in metodlarını implemente etmek zorunda değildir (Ancak ilk somut alt class'ın alması gerekir).
    // interfaceler, bir veya birden fazla interface'i kalıtabilir (extends).
    // interfaceler bir class'ı "extend" edemez veya bir class yada interface'i "implement" edemez.
    // Metodlar ve instance variables, üyeler olarak bilinirler.
    // Members 4 erişim seviyesinin tümünü kullanabilir (default, public, protected, private).
    // Üye Erişimleri iki şekildedir: classtaki kod, başka bir sınıfın üyesine erişebilir veya bir alt class, bir üst class'ın bir üyesini devralabilir.
    // Bir class'a erişilemiyorsa, üyelerine erişilemez.
    // Üye görünürlüğünü belirlemeden önce class görünürlüğünü belirleyin.
    // public üyelere, diğer paketlerden, diğer tüm class'lar tarafından erişilebilir.
    // Bir üst class üyesi public ise, alt class'ı tarafından paketten bağımsız olarak public üyeyi  miras alabilir.
    // Nokta (.) operatörü olmadan erişilen üyelerin, aynı sınıfa ait olmaları gerekir.
    // "this" her zaman, o anda çalışmakta olan nesneyi ifade eder.
    // this.amethod(), sadece bir method() öğesini çağırmakla aynıdır.
    // private üyelere yalnızca aynı class'taki koddan erişilebilir.
    // private üyeler, alt class'lar tarafından görülemez, bu nedenle private üyeler miras alınamaz.
    // default ve protected üyeler, yalnızca alt class'lar söz konusu olduğunda farklılık gösterir.
    // protected üyelere, aynı paketteki diğer class'lar ve pakete bakılmaksızın alt class'lar tarafından erişilebilir.
    // protected = paket + kids (alt class anlamına gelen çocuklar.)
    // Paketin dışındaki alt class'lar için, protected üyeye yalnızca kalıtım yoluyla erişilebilir.
    // Paketin dışındaki bir alt class, bir referansı kullanarak protected bir üyeye erişemez.
    // Alt class'ın, başka bir paketten miras aldığı protected bir üyeye, alt class'ın kendi alt class'ları dışında, alt class'ın bulunduğu paketteki herhangi bir class'tan erişilemez.
    // Local variables erişim seviyelerine sahip olamaz (default, public, protected, private).
    // final anahtar kelimesi, local variables için mevcut tek erişim seviyesidir.
    // local variables default değerler alamaz.
    // final tanımlanan metodlar, alt sınıftan override edilemez.
    // abstract metodlar noktalı virgül (;) ile biter ve küme parantezleri yoktur (Örnek: public abstract void getList();).
    // seynchronize, sadece metodlara ve kod bloklarına uygulanır.
    // seynchronize metodlar herhangi bir erişim seviyesine sahip olabilirler ve ayrıca final olarak işaretlenebilirler.
    // abstract metodlar, bir alt class tarafından implemente edilmek zorundadır. Bu nedenle abstract metodlar private olamaz, final olamaz.
    // native sadece metodlara uygulanır.
    // strictfp sadece class'lar ve metodlar için geçerlidir.
    // constructor'lar herhangi bir erişim seviyesi kullanabilir.
    // Bir enum String veya int değildir. Bir enum constantı türü, enumdur.
    // Bir class'ın içinde veya dışında bir enum tanımlanabilir ancak bir metod içinde tanımlanamaz.
    // Bir enum, sınıf dışında tanımlanırsa; static, final, abstract, protected veya private olarak işaretlenmemelidir.
    // Enumlar; constructorlar, metodlar, değişkenler ve constant'lara özgü class gövdeleri içerebilirler.
    // Enum constructor'ları parametrelere sahip olabilir ve override edilebilirler.
    // Enum constructor'ları hiçbir zaman doğrudan kodda çalıştırılmazlar.
    // class'lar interface'leri "implement" ederler, "extends" edemezler.
    // interface'ler sadece interface'leri extends edebilirler.
    // interface'i "implement" eden bir class, başka bir class tarafından extend edildiğinde, miras alan class'ın interface'deki metodları implement etme zorunluluğu yoktur. 
    // Java 8 ile birlikte interface'ler "default" ve "static" metodlara sahip olabilmektedir.
    // Bytecode ve JVM kullanımı, javanın birincil güvenlik mekanizmalarını sağlarlar.
}