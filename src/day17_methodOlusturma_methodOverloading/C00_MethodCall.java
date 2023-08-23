package day17_methodOlusturma_methodOverloading;

import day16_methodOlusturma_Kullanma.C05_StringiTerseCevirme;
import day16_methodOlusturma_Kullanma.C08_FibonacciSerisi;

import static day17_methodOlusturma_methodOverloading.C01_AsalSayiBulma.*;

public class C00_MethodCall {
    public static void main(String[] args) {

        // ilk 15 fibonacci sayisini yazdirin

        C08_FibonacciSerisi.fibonaccidenSayiYazdir(15);

        // 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377

        // asagida verilen cumlenin tersini yazdirin

        String str= "Bir kere yaparim, yan gelir yatarim";
        System.out.println(C05_StringiTerseCevirme.stringTersineCevir(str));

        // verilen cumleyi tersine cevirin

        String tersStr=C05_StringiTerseCevirme.stringTersineCevir(str);
        System.out.println(tersStr); // miratay rileg nay ,mirapay erek riB

        // asagida verilen cumlenin palindrome olup olmadigini yazdirin

        str= "Java Candir";
        tersStr= C05_StringiTerseCevirme.stringTersineCevir(str); // ridnaC avaJ

        if (str.equals(tersStr)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Palindrome degil");
        }

        // asagida verilen sayinin asal sayi olup olmadigini yazdirin

        int sayi= 23;

        System.out.println(asalSayiMi(sayi)); // true

        // kullanici true / false dan bir sey anlamaz , acik sekilde yazalim dersek

        boolean sonuc= asalSayiMi(sayi); // true

        if (sonuc) {
            System.out.println("Girilen " + sayi + " asal.");
        }else {
            System.out.println("Girilen " + sayi + " asal sayi degil.");
        }

    }
}
