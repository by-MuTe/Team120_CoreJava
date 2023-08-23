package day03_scanner;

import java.util.Scanner;

public class C09_Swap {
    public static void main(String[] args) {

        /*
        Soru 8 (Interview)- Kullanicidan iki sayi alip, ucuncu bir degisken kullanmadan ikisinin
        degerlerini degistirin(swap).
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen degerlerini degistirmek istediginiz iki sayiyi giriniz");
        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();
        System.out.println("Girdiginiz sayilar :\nsayi1 = " +sayi1 +
                "\nsayi2 = " +sayi2);
        sayi1= sayi1+sayi2;
        sayi2= sayi1-sayi2;
        sayi1= sayi1-sayi2;
        System.out.println("Sayilarin yeni degeri :\nsayi1 = " +sayi1 +
                "\nsayi2 = " +sayi2);

    }
}
