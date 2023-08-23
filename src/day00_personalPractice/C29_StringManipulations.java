package day00_personalPractice;

import java.util.Scanner;

public class C29_StringManipulations {
    public static void main(String[] args) {

        /*
        Soru 6 : Kullanicidan alinan bir String alin,
                    String’in uzunlugu cift sayi ise tam ortasina :) ekleyin,
                    String’in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :( yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String str= scan.nextLine();
        int length = str.length();

        if (length%2==0){
            System.out.println(str.substring(0, length/2) + ":)" + str.substring(length/2));
        } else {
            System.out.println(str.substring(0, length/2) + ":(" + str.substring((length/2)+1));
        }

    }
}
