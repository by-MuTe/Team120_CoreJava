package day07_ifStatements;

import java.util.Scanner;

public class C09_IfElseStatements {
    public static void main(String[] args) {

        // Kullanicidan pozitif bir tamsayi alin
        // sayinin tek veya cift sayi oldugunu yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Pozitif bir tam sayi giriniz");
        int sayi = scan.nextInt();

        if (sayi % 2 == 0){
            System.out.println("Girilen sayi cift sayi");
        }else {
            System.out.println("Girilen sayi tek sayi");
        }

        // Kullanicidan pozitif bir tamsayi alin
        // 5 ile bolunup bolunmedigini yazdirin

        if (sayi % 5 == 0){
            System.out.println("Sayi 5 ile tam olarak bolunebilir");
        }else {
            System.out.println("Sayi 5 ile tam olarak bolunemez");
        }

    }
}
