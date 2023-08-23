package day00_personalPractice;

import java.util.Scanner;

public class C20_SwitchCase {
    public static void main(String[] args) {

        // Soru 2- Kullanicidan 2 basamakli bir sayi alip, girilen sayiyi yazi ile yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen iki basamakli pozitif bir tam sayi giriniz.");
        int sayi= scan.nextInt();
        int rkmonlar= sayi/10;
        int rkmbirler= sayi%10;

        if (sayi<=99 && 10<=sayi) {
            switch (rkmonlar){
                case 1 :
                    System.out.print("On");
                    break;
                case 2 :
                    System.out.print("Yirmi");
                    break;
                case 3 :
                    System.out.print("Otuz");
                    break;
                case 4 :
                    System.out.print("Kirk");
                    break;
                case 5 :
                    System.out.print("Elli");
                    break;
                case 6 :
                    System.out.print("Altmis");
                    break;
                case 7 :
                    System.out.print("Yetmis");
                    break;
                case 8 :
                    System.out.print("Seksen");
                    break;
                case 9 :
                    System.out.print("Doksan");
                    break;
            }
            switch (rkmbirler){
                case 0 :
                    System.out.print("");
                    break;
                case 1 :
                    System.out.print("bir");
                    break;
                case 2 :
                    System.out.print("iki");
                    break;
                case 3 :
                    System.out.print("uc");
                    break;
                case 4 :
                    System.out.print("dort");
                    break;
                case 5 :
                    System.out.print("bes");
                    break;
                case 6 :
                    System.out.print("alti");
                    break;
                case 7 :
                    System.out.print("yedi");
                    break;
                case 8 :
                    System.out.print("sekiz");
                    break;
                case 9 :
                    System.out.print("dokuz");
                    break;
            }
        } else System.out.println("Yanlis giris");

    }
}
