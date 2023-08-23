package day00_personalPractice;

import java.util.Random;
import java.util.Scanner;

public class C37_BasitOyun {
    public static void main(String[] args) {

        /*
            Random olarak 1 ile 100 arasinda bir sayi olusturun
            kullanicidan bu sayiyi bilmesini isteyin
            kullanici her deger girdiginde tuttugumuz sayi ile karsilastirip tahminini buyut/kucult diyelim
            kullanici tuttugumuz sayiyi bildiginde tahmin sayisini ve
            - 3 veya daha az tahminde bildiyse "Vaowww"
            - 4-8 tahminde bildiyse "Aferin"
            - daha fazla tahminde bildiyse "Basarisiz"
            yazdirin
        */

        Random rnd= new Random();
        int tutulanSayi = rnd.nextInt(100);
        int tahminSayisi = 0;
        int tahmin=0;
        Scanner scan= new Scanner(System.in);

        while (tutulanSayi!=tahmin){

            System.out.println("Tutulan sayiyi tahmin etmek icin bir sayi giriniz");
            tahmin= scan.nextInt();
            tahminSayisi++;

            if (tahmin==tutulanSayi){
                break;
            } else if (tahmin<tutulanSayi){
                System.out.println("Tahminini buyult");
            } else { System.out.println("Tahminini kucult");}

        }

        if (tahminSayisi<=3){
            System.out.println("Vaowww " + tahminSayisi + " tahminde bildin");
        } else if (tahminSayisi<9) {
            System.out.println("Aferin " + tahminSayisi + " tahminde bildin");
        } else System.out.println("Basarisiz "+ tahminSayisi + " tahminde bildin");

    }
}
