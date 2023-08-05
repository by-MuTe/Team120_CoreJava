package day09_NestedIfElseStatements_Ternary;

import java.util.Scanner;

public class C12_SwitchStatements {
    public static void main(String[] args) {

        // Kullanicidan bir harf isteyin
        // o harfle baslayan gun ismi varsa yazdirin
        // yoksa "gecersiz harf" yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        char harf= scan.next().toUpperCase().charAt(0);

        switch (harf) {

            case 'S' :
                System.out.println("Sali");
                break;

            case 'P' :
                System.out.println("Pazar, Pazartesi veya Persembe");
                break;

            case 'C' :
                System.out.println("Carsamba, Cuma veya Cumartesi");
                break;

            default:
                System.out.println("Gecersiz harf");
        }

        /*
            Switch Statement kullaniminda dikkat edilecek konular:
            1 - Switch Statement'da switch parantezinde ****long, double, float ve boolean**** kullanilamaz.
            2 - Switch Statement'da switch parantezinde yazilan degere uygun case calisir
                ve break gorunceye veya switch case bitinceye kadar calismaya devam eder.
            3 - Switch parantezine yazilan deger hic bir case ile uyusmazsa default; satiri devreye girer.
                (if-else if-if... lerin sonundaki else gibi)
         */

    }
}
