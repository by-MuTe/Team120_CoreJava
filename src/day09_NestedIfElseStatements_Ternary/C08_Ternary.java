package day09_NestedIfElseStatements_Ternary;

import java.util.Scanner;

public class C08_Ternary {
    public static void main(String[] args) {

        // Soru 4-  Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi gectin”,
        //          50’den kucukse “Maalesef kaldin” yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");
        byte not= scan.nextByte();

        System.out.println(not>=50 ? "Sinifi gectin" : "Maalesef kaldin");

    }
}
