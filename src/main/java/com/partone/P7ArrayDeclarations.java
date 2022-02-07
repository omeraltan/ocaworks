package main.java.com.partone;

public class P7ArrayDeclarations {
    
}

/* -- Array Declaration -- */

// Javada diziler, aynı türden birden fazla değişkeni depolayan veya tümü aynı türde alt sınıf olan değişkenlerdir.
// Diziler primitive veya nesne referansları (object referances)  tutabilir.
// Declaring an Array of Primitives         : "int[] key;" or "int key[];"
// Declaring an Array of Object References  : "Thread[] threads"; or "Thread threads[]";
// two dimensional array    : String[] managerName[];
// three dimensional array  : String[][][] accupantName;

/* -- Transient Variables -- */

// Bir değişkeni "transient" olarak tanımlarsanız, JVM'ye onu içeren nesneyi serileştirmeye çalışırken bu değişkeni atlamasını (yok saymasını) bildirirsiniz. 
// Serileştirme, Java'nın en havalı özelliklerinden biridir; bir objenin durumunu (başka bir deyişle, örnek değişkenlerin değerini) özel bir G/Ç akışına yazarak kaydetmenizi sağlar.

/* -- Volatile Variables -- */

// Volatile değiştirici, JVM'ye, değişkene erişen bir iş parçacığının her zaman değişkenin kendi özel kopyasını bellekteki ana kopya ile bağdaştırması gerektiğini söyler. 

/* -- Static Variables and Methods -- */

// Static variables, class için oluşturulan örneklerden bağımsız olarak varolan değişkenleri ve metodları oluşturmak için kullanılır.
// Tüm static üyeler bir class'ta yeni bir instance vermeden önce var olurlar ve o class'ın örnek sayısına bakılmaksızın static üyenin yalnızca bir kopyası olur.

// Static olarak işaretlenebilecek şeyler: Methods, Veriables, initialize blocks
// Static olarak işaretlenemeyecek şeyler: Constructors, Classes, Interfaces, Method local inner class, Inner Class Methods and Instance Variables, Local Variables

/* -- Declare and Use Enums -- */

// Enum sabitlerinin tümünün büyük harflerle doldurulması zorunlu değildir.
// Bir enum'un temel bileşenleri sabitleridir.
// Enumlar, ayrı bir class olarak veya bir class'ın üyesi olarak ilan edilebilir.
// Ancak bir metod içerisinde bildirilemezler.
// Enum bildiriminin sonuna noktalı virgül konulması isteğe bağlıdır, zorunlu değildir (Örnek: enum CoffeeSize{BIG, HUGE, OVERWHELMING}).

/* -- Declaring Constructors, Methods and Variables in an enum -- */

// Enumlara constructor, instance variables sabit bir class gövdesi olarak ekleyebilirsiniz.
// Her enumun sahip olduğu static bir metod olan "values()" metodu vardır. Sırasıyla enum dizi değerlerini döndürür.
// Asla bir enum constructor'ı direkt olarak çağırılamaz. Enum constructor'ı sabit değerden sonra tanımladığınız argümanlarla birlikte otomatik olarak çağırılır.
// Enum constructor'ları owerride edilebilir.

