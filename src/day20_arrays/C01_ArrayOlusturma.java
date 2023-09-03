package day20_arrays;

import java.util.Arrays;

public class C01_ArrayOlusturma {
    public static void main(String[] args) {

        /*
            Array(dizi)’ler Java’da ayni data turunden
            birden fazla eleman barindirabilen objelerdir.
            Array’ler her bir eleman icin ayri bir alan
            ayirirlar ve bu elemanlara index bilgisi ile ulasabiliriz.

            Array   1   3   8   23  99
            İndex   0   1   2   3   4
         */

        int[] sayilar = {2,4,6,7,8};

        String harfler[] = {"a","f","e"};
        // [] dataturunden sonra yazılırsa daha uygun olur

        System.out.println(sayilar[1]); // 4
        System.out.println(harfler[2]); // e

        String[] ogrenciList = {"Burhan","Ramazan","Samet","Senol"};

        System.out.println(ogrenciList[1]); // Ramazan

        // 5 kisilik bir sinif olusturun

        String[] sinifListesi1 = {null , null, null, null, null};

        String[] sinifListesi2 = new String[5];

        /*
            Bir array olusturulurken 2 sey mutlaka belirtilmelidir
            1- icine konulacak datalarin turu
                    (Bir array icinde farkli data turunden element olamaz.)
                    (Array’ler primitive data turundeki datalarin
                    degerlerini, non-primitive data turundeki
                    datalarin ise referanslarini barindirirlar.)
            2- Array'in uzunlugu
                    (Olusturulan bir array’in uzunlugu sabittir, degistirilemez.)
         */

        // bir array'in tumunu nasil yazdirabiliriz ?

        System.out.println(sayilar); // [I@2752f6e2
        // referans'ini yazdirir

        // dongu ile yazdiralim

        for (int i = 0; i < sayilar.length ; i++) {
            System.out.print(sayilar[i] + " ");
        } // 2 4 6 7 8
        System.out.println("");

        // Array'in tamamini yazdirmak isterseniz
        // Arrays class'indan hazir method kullaniriz

        System.out.println(Arrays.toString(sayilar)); // [2, 4, 6, 7, 8]

        // for loop ile elementleri yazdiririz.
        // Arrays.toString() ise bize array'in kendisini yazdirir

        System.out.println(Arrays.toString(harfler)); // [a, f, e]

        System.out.println(Arrays.toString(sinifListesi1)); // [null, null, null, null, null]

        System.out.println(Arrays.toString(sinifListesi2)); // [null, null, null, null, null]

        int[] notlar = new int[4];
        System.out.println(Arrays.toString(notlar)); // [0, 0, 0, 0]

        boolean[] blList = new boolean[8];
        System.out.println(Arrays.toString(blList)); // [false, false, false, false, false, false, false, false]

        // Uzunlugu belirtilerek olusturulur ama elemanlara deger atamasi yapilmazsa;
        // Bu durumda Java belirtilen uzunlukta ve default degerlere sahip bir array olusturur.

        // Bir array’in length’i nasil bulunur ?

        int[] arr = {1,3,8,23,99};
        System.out.println(arr.length); // 5

        // NOT: Array’deki length bir method degil uzunlugu tutan bir variable’dir.
        //      Dolayisiyla yaninda () parantez yoktur.

    }
}
