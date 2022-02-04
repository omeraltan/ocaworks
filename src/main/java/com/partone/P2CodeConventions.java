package main.java.com.partone;

public class P2CodeConventions {

    /** -- Code Conventions -- */
    
    // Classes and Interfaces adlandırmaları CamelCase formatta olmalıdır.
    // Adı oluşturmak için birkaç kelime birbirine bağlanmış ise, iç kelimelerin ilk harfleri büyük olmalıdır (Örnek: Araba, Hesap, KaraKedi). 
    // Interfaceler için adlandırma, sıfat şeklinde olmalıdır (Örnek: Serializable, Workable, Testable).
    // Methodlar için adlandırma ilk harf küçük harf ve sonra CamelCase olmalıdır.
    // Methodlar için isimler, ayrıca fiil-isim çifit şeklinde olmalıdır (Örnek: getList, doCalculation, setUserName).
    // Değişkenler de CamelCase formatında olmalıdır (Örnek: myString, buttonSize, customerBalance).
    // Sabitler (Constants) static ve final işaretlenerek oluşturulur.
    // Sabitler büyük harfle yazılmalı ve ayırıcı olarak alt çizgi kullanılmalıdır (Örnek: MIN_WEIGHT, MAX_SIZE).

    /** -- Source File Declaration Rules -- */

    // Her kaynak kod dosyası için sadece bir tane "public" sınıf olabilir.
    // Bir dosyada public bir sınıf varsa, dosyanın adı public sınıfın adı ile eşleşmelidir.
    // Örneğin public class Wolf{} olarak ilan edilen bir sınıf, Wolf.java adlı kaynak bir dosyada olmalıdır.
    // Sınıf bir paketin parçası ise, mevcut olabilecek herhangi bir "import" ifadesinden önce "package" ifadesi ve class bildirimi arasında olmalıdır.
    // Eğer bir "package" ifadesi yoksa kaynak kod dosyasındaki (class'taki) ilk satır "import" ifadesi olmalıdır.
    // "package" veya "import" ifadeleri yoksa, "class" bildirimi, kaynak kod dosyasındaki ilk satır olmalıdır.
    // "package" ve "import" ifadeleri bir kaynak dosyasındaki tüm "class" 'lar için geçerlidir (Default erişime sahip classlar içinde geçerlidirler.).
    // Bir dosyada sadece bir tane "public class" olabilir. Diğerleri default olabilir ve sınır yoktur.
    // "default class" 'lar dosyadaki classların hiçbiriyle eşleşmeyen bir ada sahip olabilir. 

    /** -- Using public static void main (String[] args) -- */ 

    // main(), JVM'in bir java programını yürütmeye başlamak için kullandığı metoddur.
    // main() metodunun bildirgesinde bir miktar esneklik vardır. Parametrelerin sırası değiştirilebilir.
    // String array'inin args olarak adlandırılması gerekmez ve "var-args" sözdizimi kullanılarak bildirilebilirler.
    // Aşağıdakiler main() metodu için legal bildirimlerdir:
    // static public void main (String[] args)
    // public static void main (String... x)
    // static public void main (String tang_tang[])
    // OCA sınavı için bilmemiz gereken en önemli şey main() metodunun override edilebildiğidir.

    /** -- Import Statements and the Java API -- */

    // Aşağıdaki iki ifade arasında herhangi bir fark yoktur. Sadece üstteki ifade "import" almıştır:
    // ArrayList<String> a = new ArrayList<String>();
    // java.util.ArrayList<String> a2 = new java.util.ArrayList<String>();

    /** -- Static Import Statements -- */

    // "import static" sayesinde daha az kod yazılır.
    // Kodda "import static" özelliği kullanılırsa ne olur:
    // 1-) "import static" deilerek bu kütüphanedeki bütün metodları, özellikleri import edebilirim.
    // 2-) "static import" kesinlikle denilemez "import static" denilmek zorundadır.
    // 3-) Hem "Integer" sınıfı hem de "Long" sınıfı için aynı "class" içerisinde "import static" diyemezsiniz.
    // Nesne referansları, sabitler ve metodlar üzerinde "import static" yapabilirsiniz.
    // import java.*; --> bu ifade kullanılamaz. 




}
