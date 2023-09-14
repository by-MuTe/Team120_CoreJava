package day00_personalPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C46_ArrayLists {
    public static void main(String[] args) {

        // Soru 5 -     Kullanicidan pozitif bir tamsayi alip,
        //              o tamsayidan kucuk Fibonacci sayilarini
        //              bir liste olarak bize donduren bir method olusturun.

        System.out.println(fibonacciSerisiOlustur());

    }

    public static List<Integer> fibonacciSerisiOlustur() {

        List<Integer> fibonacciSerisi = new ArrayList<>();

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int girilenSayi= scan.nextInt();
        int ilk = 0;
        int ikinci = 1;
        int temp;

        if (girilenSayi<=0){
            System.out.println("Yanlis giris");
        } else {
            fibonacciSerisi.add(ilk);
            fibonacciSerisi.add(ikinci);

            while(ikinci<=girilenSayi){
                temp= ilk + ikinci;
                ilk = ikinci;
                ikinci= temp;
                if (temp<girilenSayi) {
                    fibonacciSerisi.add(temp);
                }
            }

        }

        return fibonacciSerisi;

    }
}
