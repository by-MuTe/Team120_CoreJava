package day00_personalPractice;

import day21_arrays.C08_ArrayeElementEkleme;

import java.util.Arrays;
import java.util.Scanner;

public class C42_Arrays {
    public static void main(String[] args) {

        // Kullanicidan yeni isimler alip var olan bir array'e ekleyen bir method olusturun
        // Kullanici yeni deger verdigi muddetce C06'daki hazir method'u kullanarak eklemeye devam edin
        // Kullanici Q'ya bastiginda, array'in son halini döndürün

        System.out.println(Arrays.toString(verilenDegerEkleme()));

    }

    public static String[] verilenDegerEkleme(){

        Scanner scan= new Scanner(System.in);
        String girilenIsim = "";
        String[] isimListesi = new String[0];

        while (!girilenIsim.equals("Q")){
            System.out.println("Lutfen eklemek istediginiz isimleri giriniz." +
                    "\nListeyi bitirmek için \"Q\"ya basiniz.");
            girilenIsim= scan.next();

            if (!girilenIsim.equals("Q")){
                isimListesi = C08_ArrayeElementEkleme.elementEkleme(isimListesi, girilenIsim);
            } else break;
        }
        return isimListesi;

    }
}
