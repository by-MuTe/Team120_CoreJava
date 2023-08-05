package day00_personalPractice;

import java.util.Scanner;

public class C21_StringManipulation {
    public static void main(String[] args) {

        /*
            Kullanicidan gun ismini girmesini isteyin,
            girilen gun hafta ici bir gun ise “Simdi calisma zamani tatile .. gun var” seklinde
            hafta sonu tatiline kac gun kaldigini yazdirin,
            girilen gun hafta sonu ise “Simdi dinlenme zamani” yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gun ismini giriniz");
        String girilenGun= scan.next();
        String kullanilacakGun=girilenGun.toUpperCase();

        /*
            string ifadeler case sensitive'dir
            kullanicinin Pazar, PAzar, PazaR, PAZAR ... gibi 32 farkli sekilde yazma ihtimali vardir
            Kullanicinin girdigi degeri direk kalici olarak degistirmek tercih edilmez
            bunun yerine kullanicinin girdigi degeri degistirip yeni bir variable'a atama yapar
            ve kodlarimizda yeni variable'i kullaniriz
            Konsola yazdiracagimiz zaman, istersek kullanicin girdigi orjinal metni yazdiririz
            istersek de bizim cevirdigimiz hali yazabiliriz
         */

        switch (kullanilacakGun){
            case "PAZARTESI":
            case "PAZARTESİ":
                System.out.println(girilenGun + " calisma zamani, tatile 5 gun var");
                break;
            case "SALI":
            case "SALİ":
                System.out.println(girilenGun + " calisma zamani, tatile 4 gun var");
                break;
            case "CARSAMBA":
            case "ÇARŞAMBA":
                System.out.println(girilenGun + " calisma zamani, tatile 3 gun var");
                break;
            case "PERSEMBE":
            case "PERŞEMBE":
                System.out.println(girilenGun + " calisma zamani, tatile 2 gun var");
                break;
            case "CUMA":
                System.out.println(girilenGun + " calisma zamani, tatile 1 gun var");
                break;
            case "CUMARTESI":
            case "CUMARTESİ":
            case "PAZAR":
                System.out.println(girilenGun + " Simdi dinlenme zamani");
                break;
            default:
                System.out.println("Yanlis giris");
        }

    }
}
