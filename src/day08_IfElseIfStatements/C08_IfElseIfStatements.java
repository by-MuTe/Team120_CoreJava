package day08_IfElseIfStatements;

import java.util.Scanner;

public class C08_IfElseIfStatements {
    public static void main(String[] args) {

         /*
            Soru 4-     Kullanicidan mesafeyi kilometre olarak alin ve cevirmek istedigi birimi sorun,
                        istedigi birim metre veya santimetre ise cevirip yazdirin,
                        yoksa “İstediginiz birim sisteme kayitli degildir.” yazdirin.
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen cevirmek istediginiz mesafeyi \"km\" olarak giriniz.");
        double uzunluk= scan.nextDouble();
        System.out.println("Cevirmek istediginiz birimi giriniz. \nmetre : m / santimetre : cm");
        char birim= scan.next().toUpperCase().charAt(0);

        if (uzunluk<=0) {
            System.out.println("Uzunlugu yanlis girdiniz.");
        } else if (birim=='M') {
            System.out.println("Girilen mesafe :" + uzunluk*1000 +" metre");
        } else if (birim=='C') {
            System.out.println("Girilen mesafe :" + uzunluk*100000 +" santimetre");
        } else System.out.println("İstediginiz birim sisteme kayitli degildir.");

    }
}
