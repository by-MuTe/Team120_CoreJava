package day04_dataCasting_wrapperClass;

public class C02_ExplicitNarrowing {

    public static void main(String[] args) {

        /*
           Eger genis kapasiteli bir data turunden dar kapasiteli bir data turune
           casting yapmak isterseniz
           Java bunu otomatik olarak gerceklestirmez, sizden sorumluluk almanizi bekler
           islemin gerceklesmesi icin cast yapmak istediginiz degerin onunde
           (donusturmek istedimiz data turu) yazilmalidir
           Explicit narrowing yapildiginda data kayiplari
           veya datanin beklenmedik bir sonuca donusmesi mumkundur
        */

        double dbl1 = 123.6;

        int sayi1 = (int)dbl1 ;
        System.out.println("sayi1 : "+ sayi1); // 123 ondalikli kismi atti

        double db2= 3987876765d;

        int in1=(int)db2; // int <=== double
        System.out.println(in1); // 2147483647

        byte by1 = (byte)sayi1 ;
        System.out.println("by1 : "+by1); // 123

        int sayi2= 130;
        byte by2 = (byte)sayi2 ;
        System.out.println("by2 : "+by2);// -126

        int sayi3 = 150 ;
        byte by3 = (byte)sayi3;
        System.out.println("by3 : "+by3);// -106

        int sayi4 = 260;
        byte by4 = (byte)sayi4;
        System.out.println("by4 : "+by4);// 4

        int sayi5= 2568;
        byte by5= (byte)sayi5;
        System.out.println("by5 : "+by5);// 8

        // 256'nın katlarından fazlası yeni değer olarak atılır
        // 256'dan küçük kalan varsa 127 çıkarılır
        // ve kalan sayı -128'den itibaren sayılarak elde edilir [-128+(x-1)]

    }
}
