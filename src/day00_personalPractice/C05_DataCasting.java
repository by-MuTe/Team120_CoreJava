package day00_personalPractice;

import java.util.Scanner;

public class C05_DataCasting {
    public static void main(String[] args) {

        /*
        Soru 5 -    Kullanicidan bir double, bir tamsayi alin, double sayiyi ikinci sayiya bolun
                    bolum isleminin sonucununun tamsayi kismini yazdirin.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bolmek istediginiz bir ondalikli sayi giriniz.");
        double bolunenSayi= scan.nextDouble();
        System.out.println("Lutfen bolum icin bir tam sayi giriniz.");
        int bolenSayi= scan.nextInt();
        System.out.println("Bolum sonucu tam sayi olarak : " + (int)(bolunenSayi / bolenSayi));

    }
}
