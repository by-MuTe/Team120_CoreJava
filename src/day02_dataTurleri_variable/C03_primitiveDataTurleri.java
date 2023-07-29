package day02_dataTurleri_variable;

public class C03_primitiveDataTurleri {

    public static void main(String[] args) {

        // boolean : mantiksal degerler olan true ve false kabul eder
        boolean bl1= true;
        boolean bl2= false;
        // true icin 1, false icin 0
        // 1 bit yer kaplar (8 bit= 1 byte)

        // char ''(Tek tırnak) icinde yazilir ve sadece 1 karakter kabul eder
        char ch1 = 'a';
        char ch2 = '2';
        char ch3 = '/';
        char ch4 = ' ';
        // char krk4=' .'; // char data turu sadece 1 karakter kabul eder, burada hem boşluk hem nokta 2 karakter var.
        // 16 bit yer kaplar


        // tam sayi kabul eden variable turleri
        // 3- byte < 4- short < 5- int < 6- long

        byte ogrYasi1=15;   // 8 bit yer kaplar -- 2üzeri7 (-128)-(127)
        // en dogru kullanim bu olur, hafiza kullanimini optimize etmek icin bu yeterlidir
        short ogryasi2=16;  // 16 bit yer kaplar -- 2üzeri15 (-32768)-(32767)
        int ogrYasi3=14;    // 32 bit yer kaplar -- 2üzeri31
        long ogrYasi4=15;   // 64 bit yer kaplar -- 2üzeri63
        long intSinirinda=2146789343;
        long sayi=75232323223L;
        // int sinirlarindan buyuk bir degeri long variable'a atamak istersek
        // yanina l veya L yazmaliyiz

        // turkiye'de sehir nufuslarini tutmak istiyoruz
        // data turu ayni olan variable'larin degerleri ne olursa olsun
        // hafizada kapladiklari alan aynidir
        int nufus = 2834250;
        int nufusBilecik = 30000;

        // bir sehirdeki noter sayisini tutacagiz
        short noterSayisiIstanbul = 456;


        double sayi1=3.1234567890123453789;
        System.out.println(sayi1); // 3.1234567890123452
        // 64 bit yer kaplar
        // Double virgulden sonra 15-16 hane yazdirir,
        // ama cok kucuk sayilara indigi icin ondalikli kismin sonunda hatalar olabilir
        // 15 / 3 = 4.999999999999999  5.0  5.00000000000001
        // double bolme islemlerinde 0,00000000000001 gibi bir hata yapabilir
        // 20 / 5 = 3,9999999999999999

        float sayi2 = 45.543334578465354648f;
        // 32 bit yer kaplar
        // float virgulden sonra 6-7 basamak yazdirir
        // java ondalikli sayilari otomatik olarak double kabul eder
        // ozellikle float kullanmak istiyorsaniz deger atamasi yaparken yanina
        // f veya F yazmalisiniz
        System.out.println(sayi2); // 45.543335


        // Biz dersler boyunca hafiza onemli olmadigi icin
        // tamsayilar icin int, ondalikli sayilar icin de double kullanacagiz

    }
}
