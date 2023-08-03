package day00_personalPractice;

import java.util.Scanner;

public class C15_NestedIfElse {
    public static void main(String[] args) {

        /*
        Soru 4- Kullanicidan gun ismini girmesini isteyin,
                Girilen gun haftaici ise "Simdi calisma zamani tatile ... gun var" seklinde yazdirin
                Girilen gun haftasonu ise "Simdi dinlenme zamani" yazdirin
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bulundugunuz gunu giriniz");
        String gun= scan.next();
        char basHarf= gun.toUpperCase().charAt(0);
        char ikinciHarf= gun.toUpperCase().charAt(1);

        if (basHarf=='S'){
            System.out.println("Simdi calisma zamani tatile 4 gun var");
        } else if (basHarf=='P'){
            if (ikinciHarf=='E'){
                System.out.println("Simdi calisma zamani tatile 2 gun var");
            } else if (gun.length()==9){
                System.out.println("Simdi calisma zamani tatile 5 gun var");
            } else System.out.println("Simdi dinlenme zamani");
        } else if (basHarf=='C'){
            if (ikinciHarf=='A'){
                System.out.println("Simdi calisma zamani tatile 3 gun var");
            } else if (gun.length()==9){
                System.out.println("Simdi dinlenme zamani");
            } else System.out.println("Simdi calisma zamani tatile 1 gun var");
        }

    }
}
