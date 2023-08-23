package day00_personalPractice;

import java.util.Scanner;

public class C03_DataCasting {
    public static void main(String[] args) {

        /*
        Soru 3 - Kullanicidan bir sayi alin, kullanici kac degerini girerse girsin,
        o sayiyi -128 ile 127 arasindaki bir sayiya donusturup yazdirin.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Degerlemesini yapmak istediginiz bir sayi giriniz.");
        double girilenSayi= scan.nextDouble();
        System.out.println("Degerleme sonucu yeni sayi : " + (byte)girilenSayi);
        
    }
}
