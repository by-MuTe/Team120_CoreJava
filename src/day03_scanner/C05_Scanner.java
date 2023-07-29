package day03_scanner;

import java.util.Scanner;

public class C05_Scanner {

    public static void main(String[] args) {

        /*
        Soru 4- Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip,
        dikdortgenin alanini yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen alanini olcmek istediginiz dikdortgenin kenar uzunluklarini giriniz" +
                "\nHer kenar degerinden sonra ENTER'a basiniz.");
        double kenar3= scan.nextDouble();
        double kenar4= scan.nextDouble();

        System.out.println("Girdiginiz kenar uzunluklarina gore dikdortgenin alani : " + kenar3*kenar4);

    }
}
