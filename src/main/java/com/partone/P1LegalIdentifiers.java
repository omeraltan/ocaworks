package main.java.com.partone;

public class P1LegalIdentifiers {
    
    // Teknik olarak legal identifiers yalnızca Unicode karakterler, sayılar, para birimi simgeleri ($ gibi) ve bağlantı karakterlerinden oluşmalıdır (alt çizgi gibi "_").
    // Legal identifiers bir rakamla başlayamaz.
    // İlk karakterden sonra herhangi bir harf, para birimi karakteri, bağlantı karakteri veya sayı kombinasyonu içerebilirler.
    // Legal idetifiers'ın içerebileceği karakter sayısında bir sınırlama yoktur.
    // Javada legal identifierslar, büyük/küçük harflere duyarlıdır; "apple" ile "Apple" farklı legal identifiers'tır. 

    //Legal
    int _x;
    int $y;
    int ________2_z;
    int _$;
    int bu_cok_detaylidir;

    //Illegal
    //int :q;
    //int -w;
    //int e#;
    //int .r;
    //int 9t;
    
    public static void main(String[] args) {
        System.out.println("Test123");
    }


}
