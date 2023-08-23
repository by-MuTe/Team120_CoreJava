package day00_personalPractice;

import java.util.Scanner;

public class C13_NestedIfElse {
    public static void main(String[] args) {

        /*
            Kullanicidan artik yil olup olmadigini kontrol etmek icin yil girmesini isteyin.
            Kural 1:    4 ile bolunemeyen yillar artik yil degildir
            Kural 2:    4 ile bolunup 100 ile bolunemeyen yillar artik yildir
            Kural 3:    4’un kati olmasina ragmen 100 ile bolunebilen yillardan sadece
                        400’un kati olan yillar artik yildir
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen artik yil olup olmadigini kontrol etmek istediginiz yili giriniz.");
        short yil= scan.nextShort();

        if (yil%4==0){
            if (yil%100==0){
                if (yil%400==0) System.out.println(yil + " Artik yildir.");
                else System.out.println(yil + " Artik yil degildir.");
            }
            else System.out.println(yil + " Artik yildir.");
        }else System.out.println(yil + " Artik yil degildir.");

    }
}
