package day18_whileLoop_DoWhileLoop;

import java.util.Scanner;

public class C06_DoWhileLoop {

    public static void main(String[] args) {

        /*
            Java do-while döngüsüne çıkış kontrol döngüsü denir.
            While döngüsü ve for döngüsünden farklı olarak
            do-while, döngü gövdesinin sonundaki koşulu kontrol eder.
            Java do-while döngüsü, döngü gövdesinden sonra koşul kontrol edildiğinden
            en az bir kez calisir.
            Tekrar sayısı belirli değilse ve döngüyü en az bir kez çalıştırmanız gerekiyorsa,
            bir do while döngüsü kullanmanız önerilir.
         */

        // kullanicidan toplanmak uzere pozitif sayilar isteyin
        // kullanici islemi bitirmek icin 0'a basmalidir
        // kullanici 0'a bastiginda kac pozitif sayi girdigini
        // ve toplamlarinin kac oldugunu yazdirin

        /* once while loop ile yapalim

        Scanner scanner;
        int sayac = 0 ;
        int toplam = 0 ;
        int girilensayi = 9;

        while(girilensayi != 0){

            scanner = new Scanner(System.in);
            System.out.println("Lutfen toplanmak uzere pozitif sayi giriniz");
            girilensayi = scanner.nextInt();

            if (girilensayi != 0){
                toplam += girilensayi;
                sayac++;
            }
        }
        System.out.println("Girilen " + sayac + " adet sayinin toplami : " + toplam);

         */

        // do while ile yapalim

        Scanner scanner;
        int sayac = 0 ;
        int toplam = 0 ;
        int girilensayi;

        do {
            scanner = new Scanner(System.in);
            System.out.println("Lutfen toplanmak uzere pozitif sayi giriniz");
            girilensayi = scanner.nextInt();

            if (girilensayi > 0){
                toplam += girilensayi;
                sayac++;
            }

        }while (girilensayi != 0);

        System.out.println("Girilen " + sayac + " adet sayinin toplami : " + toplam);

    }
}
