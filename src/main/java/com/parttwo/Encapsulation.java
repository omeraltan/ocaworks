package main.java.com.parttwo;

/**
 * Encapsulation
 */
public class Encapsulation {

    /* -- Encapsulation -- */

    // Sürdürülebilir, esnek ve genişletilebilir kodlama istiyorsanız, tasarımınız "encapsulation" içermelidir.
    // instance variables'ınızı gizleyin (bir erişim seviyesi ilee genelliklede "private" ile)
    // public erişim seviyesi olan metodlar yapın ve instance vairables'ınıza 
    // direkt erişim yerine bu metodlar vasıtasıyla değişkeninize değer atamayı veya onun değerinin alınmasını sağlar.
    // Bu erişim metodları en çok set<SomeProperty> ve get<SomeProperty> adları kıllanır.

    /* -- Inheritance and Polimorfizm -- */

    // Kalıtım javada heryerdedir. Kalıtım kullanmadan en küçük java programını bile yazmak neredeyse imkansızdır.
    // Test edilen instance variables karşılaştırılan türden ise, "instanceof" öğesinin true dödürdüğünü unutmayın.

    /* -- The Evolution of Inheritance -- */
    
    //      Elements of Types            Classes             Interfaces
    //      -----------------            -------             ----------
    //      instance variables             Yes               Not applicable
    //      static variables               Yes               Only constants
    //      abstract methods               Yes               Yes
    //      instance methods               Yes               Java 8, default methods
    //      static methods                 Yes               Java 8, inherited no, accessible yes
    //      constructors                   No                Not applicable
    //      initialization blocks          No                Not applicable

    // Sınav için şu iki şeyi bilmeniz gerekli, bir class kalıtıldığında "extend" kelimesi ile, bir interface kalıtıldığında "implement" kelimesiyle kullanılır.
    // Miras almanın en yaygın iki nedeni: 1-)Kodun yeniden kullanılmasını teşviketmek. 2-)Polimorfizm kullanmak
    // Miras almanın ikinci kullanımı classlarımıza polimorfik olarak erişilmesine izin vermek.

    /* -- IS-A and HAS-A Relationships --*/

    // IS-A ve HAS-A ilişkilerini anlamak OCA 8 adaylarına sınavla ilgili pek çok soruda yardımcı olur.

    /* -- IS-A -- */

    // Object Oriented'da IS-A kavramı kalıtıma dayanmaktadır. IS-A, "Bu şey, bu türden birşeydir." demenin bir yoludur.
    // Javadaki IS-A ilişkisini "extend" ve "implement" anahtar kelimeleri ile ifade ederiz.

    /* -- HAS-A -- */

    // HAS-A ilişkileri, mirastan ziyade kullanıma dayanır.

    /* -- Polimorfizm -- */

    // Birden fazla IS-A testinden geçebilen herhangi bir java nesnesinin polimorfik olarak kabul edilebileceiğini unutmayın.
    // Object türü nesneler dışında, tüm java nesneleri kendi türlerinde ve Object sınıfı için IS-A testini geçmeleri bakımından polimorfiktir.
    // Bir nesneye erişmenin tek yolunun bir referans değişkeni olduğunu unutmayın. Referanslar hakkında bilmemiz gereken birkaç önemli şey var:
    // * Bir referans değişkeni yalnızca bir türde olabilir ve bir kez bildirildiğinde, bu tür hiçbir zaman değiştirilemez. 
    // * Referans, bir değişkendir. Bu nedenle diğer nesnelere atanabilir (referans "final" olarak belirtilmediği sürece). 
    // * Bir referans değişkeninin türü, değişkenin referans aldığı nesne üzerinde çağrılabilecek metodları belirler.
    // * Bir referans değişkeni, aynı türden herhangi bir nesneye başvurabilir.
    // * Bir referans değişkeni, bir class'ta yada interfacede tanımlanabilir.
    // Eğer değişken interface tipinde tanımlandıysa, interface'i uygulayan herhangi bir class'ın herhangi bir nesnesine başvurabilir.
    // Bir class birden fazla class'ı extend edemez. Bu class başına bir parent anlamına gelir.

    /* -- Overriding / Overloading -- */

    // override metod, override ettiği metoddan daha kısıtlayıcı bir erişim seviyesine sahip olamaz.
    // Örnek olarak public olarak işaretlenmiş bir metodu protected olarak override edemezsiniz.
    // Bir metodu override etme kuralları şunlardır:
    // * parametre listesi, override edilen metodla birebir eşleşmelidir. Eşleşmemesi, istemediğiniz, overload bir metod meydana gelmesi anlamına gelebilir.
    // * Dönüş tipi, aynı veya alt tipi olmalıdır. Üst sınıfta orijinal override edilen metodda bildirilir (kovaryant).
    // * Erişim seviyesi, override edilen metodun seviyesinden daha kısıtlayıcı olamaz (public (override edilen metod) --> protected).
    // * Erişim seviyesi, override edilen metodun seviyesinden daha az kısıtlayıcı olabilir (protected (override edilen metod) --> public).
    // instance metodlar yalnızca miras alan alt sınıf tarafından override edilebilir. Süper tipiyle aynı paketteki bir alt tür, private veya final olarak işaretlenmemiş
    // herhangi bir üst tür metodunu override edebilir. Alt tür farklı bir paketteyse yalnızca public ve protected olarak işaretlenmiş nonfinal metodları override edebilir.
    // Override metodlar, metodda tanımlı exception tanımlı olup olmadığına bakılmaksızın herhangi bir unchecked exception fırlatabilir.
    // Override metod, override metodla bildirilen den daha geniş bir exception atmamalıdır (FileNotFoundException (override edilen metod) --> SQL Exception).
    // Override metod, daha dar bir exception fırlatabilir.
    // Final anahtar kelimesiyle işaretlenmiş bir metod override edilemez.
    // Static anahtar kelimesiyle işaretlenmiş bir metod override edilemez.
    // Bir metod kalıtılamıyorsa override edilemez. 
}