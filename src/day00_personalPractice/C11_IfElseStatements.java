package day00_personalPractice;

import java.util.Scanner;

public class C11_IfElseStatements {
    public static void main(String[] args) {

        // Soru -   Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        //          ucgen ikizkenar ise “Ikizkenar ucgen” yazdirin, degilse “Ikizkenar degil” yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Ucgenin kenar uzunluklarini giriniz");
        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();
        double kenar3= scan.nextDouble();

        if (    (kenar1==kenar2 && kenar1!=kenar3) ||
                (kenar2==kenar3 && kenar1!=kenar2) ||
                (kenar1==kenar3 && kenar2!=kenar3)  )
        {   System.out.println("Ikizkenar ucgen");
        }else {
            System.out.println("Ikizkenar degil");
        }

    }
}
