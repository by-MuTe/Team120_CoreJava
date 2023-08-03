package day07_ifStatements;

import java.util.Scanner;

public class C06_BagimsizIfCumleleri {

    public static void main(String[] args) {

        // Soru 5- Kullanicidan notunu alin
        //         50 veya daha buyukse ”Sinifi Gectin”,
        //         50’den kucukse “Maalesef kaldin” yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");

        double not = scan.nextDouble();

        if (not >= 50 && not<=100) System.out.println("Sinifi gectin");

        if (not<50) System.out.println("Maalesef kaldin");

        // Kullanicidan pozitif bir tam sayi isteyin
        // sayi 3 veya 5 ile bolunebiliyorsa
        // "Guzel sayi" yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");

        int girilenSayi = scanner.nextInt();

        if (girilenSayi % 3 == 0 || girilenSayi % 5 == 0) System.out.println("Guzel sayi");

    }
}
