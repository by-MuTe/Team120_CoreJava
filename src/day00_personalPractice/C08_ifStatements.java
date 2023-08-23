package day00_personalPractice;

import java.util.Scanner;

public class C08_ifStatements {
    public static void main(String[] args) {

         /*
            Soru 2- Kullanicidan 1 harf alin, harf ile baslayan bir ay varsa yazdirin
                    NOT= Buyuk harf kucuk harf hassasiyeti olmasin
                    Kullanici o veya O yazdiginda output olarak Ocak olsun
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yazdirmak istediginiz ayin ilk harfini giriniz");
        char girilenHarf= scan.next().charAt(0);

        if (girilenHarf=='o' || girilenHarf=='O') System.out.println("Ocak");
        if (girilenHarf=='s' || girilenHarf=='S') System.out.println("Subat");
        if (girilenHarf=='m' || girilenHarf=='M') System.out.println("Mart" + "\nMayıs");
        if (girilenHarf=='n' || girilenHarf=='N') System.out.println("Nisan");
        if (girilenHarf=='h' || girilenHarf=='H') System.out.println("Haziran");
        if (girilenHarf=='t' || girilenHarf=='T') System.out.println("Temmuz");
        if (girilenHarf=='a' || girilenHarf=='A') System.out.println("Agustos" + "\nAralik");
        if (girilenHarf=='e' || girilenHarf=='E') System.out.println("Eylul"+ "\nEkim");
        if (girilenHarf=='k' || girilenHarf=='K') System.out.println("Kasım");

    }
}
