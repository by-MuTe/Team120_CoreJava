package day00_personalPractice;

import java.util.Scanner;

public class C04_DataCasting {
    public static void main(String[] args) {

         /*
        Soru 4 - Kullanicidan iki double sayi alin, ilk sayiyi ikinci sayiya bolun
        bolum isleminin sonucunun tamsayi kismini yazdirin.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bolunmesini istediginiz iki adet ondalikli sayi giriniz." +
                "\nHer girilen sayidan sonra ENTER'a basiniz.");
        double ilkSayi= scan.nextDouble();
        double ikinciSayi= scan.nextDouble();

        System.out.println("Bolme isleminin tam sayi olarak sonucu : " + (int) (ilkSayi / ikinciSayi));

    }
}
