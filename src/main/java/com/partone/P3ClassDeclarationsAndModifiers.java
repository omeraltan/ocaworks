package main.java.com.partone;

/**
 * P3ClassDeclarationsAndModifiers
 */
public class P3ClassDeclarationsAndModifiers {

    /** -- Class Declarations And Modifiers -- */

    // Aşağıdaki kod çok iyi şekilde derlenir, ancak "class" bildirisinden önce modifiers ıda ekleyebiliriz:
    // class MyClass{}
    // Genel olarak modifiers iki kategoriye ayrılır:
    // 1-) Access modifiers (public, protected, private)
    // 2-) Nonaccess modifiers (including strictfp, final, abstract)
    // Javada erişim seviyeleri biraz zordur, çünkü dört erişim seviyesi vardır. 
    // Yalnızca üç erişim seviyesi varmış gibi gözükür. Dördüncü erişim seviyesi "default" 'tur (default, package access olarak da adlandırılır.).
    // Üç erişim seviyesinden herhangi birini kullanmadığımızda aslında olan "default" 'tur (Gözükmez ama aslında defaulttur. Zaten classlarda açık olara "default" yazamazsınız).
    // default clast Test{} --> böyle bir şey yoktur.  Classlarda "default" erişim seviyesi gizli olmak zorundadır (class Test{} şeklinde yazılımı doğrudur).
    // Başka bir deyişle, bildirdiğimiz her "class", "metod" veya "instance variable" yazsanızda yazmasanızda bir erişim seviyesine sahiptir.
    // Java paket merkezli bir dildir; Geliştiriciler iyi bir organizasyon için ve isimlerin belirlenmesiyle tüm sınıflarımızı paketlere koyarlar.
    // Sınıf paketlerinin adlandırılmaları şu şekilde olmalıdır: com.organization.steps.client

    /** -- Default Access -- */

    // "class" bildirimde bir erişim seviyesi yazmadığınızda aldığınız erişim seviyesidir (Örnek: class MyClass{})
    // "default" erişime sahip bir "class", yalnızca aynı paket içindeki classlar tarafında görülebilir.
    
    /** -- Public Access -- */

    // Bir "A" class'ı "public" anahtar kelimesiyle tanımlanmış ise bütün paketlerden ve bütün classlardan erişilebilir.
    // Bununla birlikte, kullanmaya çalıştığınız bir "public" class yazdığınızda erişmek istediğiniz classtan farklı bir pakette ise "import" etmeniz gerekmektedir. 

    /** -- (Nonaccess) Other Class Modifier -- */

    // Bir class tanımı "final", "abstract" veya "strictfp" kullanılarak değiştirilebilir.
    // Bir class'ı hem "public" hemde "final" olarak işaretleyemezsiniz.
    // Fakat her zaman nonaccess modifiers mix edebilirsiniz.
    // "strictfp" 'yi "final" ile kombine edebilirsiniz.Bunda özgürsünüz.
    // Sınav için "strictfp" 'nin bir class için veya metod için kullanılabildiğini, fakat bir değişken için kullanılamadığını bilmeniz yeterlidir.
    // Eğer bir class'ı strictfp olarak işaretlemezseniz, bir metodu strictfp olarak ilan ederek metod bazında strictfp davranışı alabilirsiniz.

    /** -- Final Classes -- */

    // "final" anahtar kelimesiyle işaretlenmiş bir class'ı hiçbir class kalıtamaz.
    // "final" class içerisinde bulunan herhangi bir metodu "override" edemezsiniz. Bu maksatla kullanılır.

    /** -- Abstract Classes -- */

    // Abstract bir class asla somutlaştırılamaz.
    // Tek amacı kalıtılmaktır (alt sınıflarda).
    // Car x = new Car(); --> Hata verir (abstract classlar için)
    // Abstract bir class içerisinde bir metod tanımlıysa (sadece tanımlanmış, gövdesi boş olmalı), hem metod hemde class "abstract" olmak zorundadır.
    // Tek bir metod bile "abstract" olsa, class "abstract" olmak zorundadır.
    // Bir class'ta "abstract" ve "final" işareti bir arada olamaz. Bunların neredeyse zıt anlamı vardır.
    // abstract bir class alt sınıflar tarafından kulanılmalıdır.
    // final bir class'ın alt class'ı olamaz. Bir class veya metod bildirimi için kullanılan, "abstract" veya "final" 'ı bir arada görürseniz kod derlenmeyecektir.

    /** -- Creating an Abstract Superclass and Concrete Subclass -- */

    // 1-) super class oluşturulur:
    // package food;
    // public abstract Fruit {  }
    //
    // 2-) subclass oluşturulur:
    // import food.Fruit;
    // class Apple extends Fruit {  }


}