package day09_nestedIfElseStatements_Ternary;

import java.util.Scanner;

public class C09_Ternary {
    public static void main(String[] args) {

        // Soru 1-  Kullanicidan bir sayi isteyin, sayiyi kontrol edip
        //          5 ile bolunebiliyorsa “Sayi 5’in tam kati” yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int girilenSayi= scan.nextInt();

        System.out.println(girilenSayi % 5 == 0 ? "Sayi 5’in tam kati" : "");

    }
}
