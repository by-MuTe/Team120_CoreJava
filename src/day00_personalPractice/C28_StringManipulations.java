package day00_personalPractice;

import java.util.Scanner;

public class C28_StringManipulations {
    public static void main(String[] args) {

        /*
        Soru 5 : Kullanicidan isim ve soyismini ayri ayri alin.
                - ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde yazdirin
                - soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk harflerle yazdirin.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Adınızı giriniz: ");
        String isim = scanner.nextLine();

        System.out.print("Soyadınızı giriniz: ");
        String soyIsim = scanner.nextLine();

        if (isim.length() > soyIsim.length()) {
            System.out.println(isim.substring(0, 1).toUpperCase() + isim.substring(1).toLowerCase() +
                    " " + soyIsim.substring(0, 1).toUpperCase() + soyIsim.substring(1).toLowerCase());
        } else if (soyIsim.length() > isim.length()) {
            System.out.println(isim.substring(0, 1).toUpperCase() + isim.substring(1).toLowerCase() +
                    " " + soyIsim.toUpperCase());
        }

    }
}
