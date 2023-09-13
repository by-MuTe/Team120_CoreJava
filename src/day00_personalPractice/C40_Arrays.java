package day00_personalPractice;

import java.util.Arrays;

public class C40_Arrays {
    public static void main(String[] args) {

        // Verilen bir String array'de
        // istenen bir harfi iceren kelimeleri silip,
        // yerine null yazdirin

        String[] isimler= {"Huseyin","Yusuf","Mehmet","Akile","Said"};
        String silinecekHarf= "u";

        for (int i = 0; i < isimler.length ; i++) {
            if (isimler[i].contains(silinecekHarf)){
                isimler[i]= null;
            }
        }
        System.out.println(Arrays.toString(isimler)); // [null, null, Mehmet, Akile, Said]

    }
}
