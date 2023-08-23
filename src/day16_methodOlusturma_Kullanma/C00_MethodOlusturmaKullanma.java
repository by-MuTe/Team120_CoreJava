package day16_methodOlusturma_Kullanma;

public class C00_MethodOlusturmaKullanma {
    public static void main(String[] args) {

        /*
        Method’lar bize bir sonuc döndürüp döndürmedigine gore 2’ye ayrilir.
            1- Bazi method’lar gorevlerini yapar ama bize herhangi bir data turunde sonuc dondurmezler.
            Bu tur method’larin return type’i void olur.
            Ornegin ogrenci kaydi yapan bir method dusunelim,
            amac , kayit yapan kisiye bir sonuc dondurmekten ziyade
            ogrenciyi kayit yapmaktir.
            Belki kayit islemi tamamlandi diye bir sonuc yazdirilabilir
            ama bu yazdirma islemi asil amaç degildir.
            “Kayit basariyla yapildi” yazan ama kayit yapmayan bir method calisti Kabul edilemez.
            Bu tur method’lari fatura yatirmaya yolladigimiz cocugumuz gibi dusunebiliriz.
            Amac faturayi yatirmaktir, bize bir makbuz getirmesi degildir.

            2- Bize sonuc döndüren method’lar.
            Cogu zaman method’lar bize bir sonuc döndürmesi icin olusturulur.
            Markete alisverise giden kapici gibidir,
            bizim istedigimiz urunu getirir.
            Onun getirmesi yetmez
            biz de kapicinin getirdigi urunu ondan almaliyiz.
            Bize sonuc döndüren method’lar ya direk yazdirilmali veya
            data turune uygun bir variable’a atanmalidir.

            return type’i olan method’lar daha avantajlidir.
            Void bir method’a sonuc dondurtemeyiz ama
            sonuc donen bir method’u System.out.println( ) icinde kullanip sonucu yazdirabiliriz.
         */

        carpYazdir(5,8); // 40.0
        carpYazdir(7.4,8.6); // 63.64

        /*
         1- access modifier : method’a proje icerisinden nerelerden ulasilabilecegini belirler.
            public : Proje icerisinde tum class’lardan kullanilabilir.
            protected : Sadece icinde bulundugu package ve child class’lardan kullanilir
            default(no modifier) : Sadece icinde bulundugu paket(package)’den kullanilir
            private: Sadece bulundugu class’da kullanilabilir.
         2- static : Access modifier olmadigi halde method ve variable’lar icin erisimi duzenler.
            static olarak isaretlenmis method’lar, method disinda bulunan variable ve
            method’lardan sadece static olarak isaretlenmis olanlara direk ulasabilir.
            main method static olarak isaretlendiginden (simdilik) main method’dan
            cagiracagimiz method’lari da static yapacagiz.
         3- return type : Method’un hangi data turunden bir sonuc urettigini belirtir.
            Gorevi sadece birsey yazdirmak olan method’larin return type’i void olarak belirlenir.
            Method’un gorevi bize bir sonuc dondurmek ise, dondurecegi dataya uygun bir return type secilmeli,
            method’un sonunda ise return keyword’u ile beklenen data turunden bir deger dondurulmelidir.
            Return type’i void olan method’lar cagrildiginda, sadece yazdirma islemi yapabilir,
            Void olmayan method’lar ise bize bir deger dondurur ve biz de o degeri kaydederiz,
            Sonucu bir variable’a atadiktan sonra istedigimiz zaman yazdirmak mumkun olacaktir.
         4- method ismi : Method ismi olarak istedigimiz ismi secebiliriz, ancak method’un islevi
            ile isminin uyumlu olmasi tercih edilir.
            Method isimleri kucuk harfle baslar ve camelCase kuralina uygun olur.
         5- parametre : ( ) icerisine yazilan variable’lardir. Bir method cagrildigi zaman (method call)
            parametrelerine uygun argument’ler ile cagrilmalidir.
            Java, herhangi bir method call ile karsilastiginda once method call’daki argument’ler ile method’daki
            parametre’leri karsilastirir uyumlu degilse CTE verir.
         6- method body : Suslu parantezler arasinda kalan ve kodlarimizi yazdigimiz bolumdur.
         */

        /*
            Soru : Method nerede olusturulabilir ?
            Cevap : Class icerisinde, main method veya diger var olan method’larin disinda olmalidir.
                    Method’larin main method’dan once veya sonra olmasinin farki yoktur.
                    Method’lar cagrilmadan calismaz, cagrilinca da nerede olursa olsun Java bulup calistirir.
         */

    }
    public static void carpYazdir(double sayi1, double sayi2){

        System.out.println(sayi1 * sayi2);
    }
}
