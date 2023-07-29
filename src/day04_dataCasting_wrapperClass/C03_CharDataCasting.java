package day04_dataCasting_wrapperClass;

public class C03_CharDataCasting {

    public static void main(String[] args) {

        /*
        24 ==> 11000
         a ==> 97 ==> 1100001
         b ==> 98 ==> 1100010
         */

        /*
            char data turu ozel bir data turudur
            her ne kadar char data turu
            '' icerisinde sayi,harf,ozel karakter alsa da
            ascii tablosundaki sayisal degerleri de kullanabilir

            ayni sekilde
            char data turundeki bir variable'i
            matematiksel islemde kullanirsaniz
            ascii tablosundaki degeri ile matematiksel isleme girer
         */

        char ilkHarf= 101;
        System.out.println(ilkHarf); // e

        char ch1= 'C';
        int sayi1 = ch1;
        System.out.println("ch1 : " + ch1); // C
        System.out.println("sayi1 : " + sayi1); // 67

        String str1 = "Java";
        String str2 = " ";
        String str3 = "Candir";

        System.out.println(str1+str2+str3); // Java Candir

        char ch2 = 'a';
        char ch3 = 'b';

        System.out.println(ch2 + ch3); // 97 + 98 = 195

        // verilen int bir sayinin ascii tablosundaki char karsiligini yazdirin

        int karakter = 125;
        char asciDegeri = (char)karakter;
        System.out.println("Verilen sayinin ascii tablosundaki karsiligi : "+ asciDegeri);

        // kullanicinin verdigi harften bir sonraki harfi yazdirin

        char girilenChar= 'f';
        System.out.println(girilenChar+1); // 102 + 1 = 103
        // biz 103'u degil, 103'un karsiligi olan char ifadeyi yazdirmak istersek explicit casting yapariz
        System.out.println("Girilen harfin bir sonrasi : "+(char) (girilenChar+1));

    }
}
