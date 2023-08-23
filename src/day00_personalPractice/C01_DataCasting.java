package day00_personalPractice;

import java.util.Scanner;

public class C01_DataCasting {
    public static void main(String[] args) {

        // Soru 1- Int olarak verilen 3 degerin ortalamasini double olarak yazdiran bir kod yazin

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen ortalamasini almak istediginiz 3 tamsayi giriniz.");

        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();
        int sayi3= scan.nextInt();

        System.out.println("Girilen sayilarin ortalamasi : " + ((double)sayi1+sayi2+sayi3)/3);

    }
}
