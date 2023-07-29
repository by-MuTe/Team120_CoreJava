package day03_scanner;

import java.util.Scanner;

public class C08_Swap {

    public static void main(String[] args) {

        // Soru 7 (Interview)- Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).

        // kullanici sayi1= 10 , sayi2= 20 degeri girdiginde
        // sayi1'in yeni degeri= 20 , sayi2'nin yeni degeri= 10 olmali

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen ilk sayiyi giriniz");

        int ilkSayi= scanner.nextInt();

        System.out.println("Lutfen ikinci sayiyi giriniz");

        int ikinciSayi = scanner.nextInt();

        int temp = ilkSayi;

        ilkSayi = ikinciSayi;

        ikinciSayi = temp;

        System.out.println("ilk sayinin yeni degeri : " + ilkSayi);
        System.out.println("ikinci sayinin yeni degeri : " + ikinciSayi);

        /*
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen sayi1'i giriniz ");
        int sayi1= scan.nextInt();
        System.out.println("Lutfen sayi2'i giriniz ");
        int sayi2= scan.nextInt();

        int temp;

        // 1. adim sayi2 degerini temp'e atayalim

        temp=sayi2;

        // 2. adim sayi1 degerini sayi2'ye atayalim

        sayi2=sayi1;

        // temp'deki degeri sayi1'e atayalim

        sayi1=temp;

        System.out.println("Sayilarin degerini yer degistirdim."
                + "\nsayi1'in yeni degeri : " + sayi1
                + "\nsayi2'nin yeni degeri : " +sayi2);
         */

    }
}
