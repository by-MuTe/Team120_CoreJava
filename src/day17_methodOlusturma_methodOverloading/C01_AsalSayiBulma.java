package day17_methodOlusturma_methodOverloading;

import java.util.Scanner;

public class C01_AsalSayiBulma {
    public static void main(String[] args) {

        // Soru 3- Kullanicidan main method icinde 2'den buyuk pozitif bir tamsayi alin.
        //         Girilen sayinin asal sayi olup olmadigini kontrol edip,
        //         sonuc olarak “true” veya “false” sonuclarini
        //         donduren bir method olusturun.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Asal sayi kontrolu icin pozitif bir tamsayi giriniz");
        int sayi = scanner.nextInt();

        System.out.println(asalSayiMi(sayi));

    }

    public static boolean asalSayiMi(int sayi){

        boolean isPrime = true;
        for (int i = 2; i <sayi ; i++) {

            if (sayi % i == 0){
                isPrime = false;
                break;
            }
        }
        if (sayi<=1){
            isPrime = false;
        }
        return isPrime;

    }

}
