package day02_dataTurleri_variable;

public class C04_NonPrimitiveDataTurleri {

    public static void main(String[] args) {

        /*
        non-primitive data türleri;
        Arrays, Strings, Classes, Interfaces, Enums, Objects
         */

        int sayi = 20;

        System.out.println(sayi); // 20

        String isim = "Berk Yilmaz";

        System.out.println(isim.toUpperCase()); // BERK YILMAZ

        System.out.println(isim.toLowerCase()); // berk yilmaz

        System.out.println(isim); // Berk Yilmaz

        String ilkHarf="K";
        char ilkHarf2='m';

        // tek bir karakter atayacaksak ikisini de kullanabiliriz

        System.out.println(ilkHarf.toLowerCase()); // k
        System.out.println(ilkHarf2); // m

        // primitive data turundeki variable'lar sadece DEGER tasiyabilir
        // non-primitive data turundeki variable'larin hem deger hem de method'lari olur
        // bir variable'in ismini yazıp .'ya basarsak o variable ile kullanabileceğimiz methodlari görebiliriz

        String str1 = "Java";
        String str2 = "Candir";

        System.out.println(str1 + str2);
        // iki tane String + isareti ile toplanmaya calisilirsa
        // Java o iki String'i BIRLESTIRIR
        // JavaCandir

        String str3 = "30";
        String str4 = "40";

        System.out.println(str3 + str4); // 3040

        // Verilen isim ve soyismi
        // Girilen ali uzunkavak database'e kaydedildi
        // seklinde yazdirin

        String adi = "Ramazan";
        String soyadi = "Tatar";

        System.out.println("Girilen "+ adi + " " + soyadi + " database'e kaydedildi");

        // " " arasindaki bosluklar konsolda yazdirilan metne yansir
        // ancak kodlar arasinda birakilan bosluklar metne yansimaz
        // System.out.println("Girilen "+        adi         + " " + soyadi + " database'e kaydedildi");

    }
}
