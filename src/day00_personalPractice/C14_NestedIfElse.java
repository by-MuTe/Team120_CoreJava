package day00_personalPractice;

import java.util.Scanner;

public class C14_NestedIfElse {
    public static void main(String[] args) {

         /*
            Soru 3- Kullanicidan bir sayi alin
                    Sayi tek ise negatif veya pozitif tek sayi oldugunu yazdirin
                    Sayi cift sayi ise 10'un tam kati olup olmadigini yazdirin
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int girilenSayi= scan.nextInt();

        if (girilenSayi%2==0){
            if (girilenSayi%10==0){
                System.out.println("Girilen sayi 10'un tam kati");
            } else System.out.println("Girilen sayi 10'un tam kati degil");
        }else {
            if (girilenSayi>0){
                System.out.println("Girilen sayi pozitif");
            } else System.out.println("Girilen sayi negatif");
        }

    }
}
