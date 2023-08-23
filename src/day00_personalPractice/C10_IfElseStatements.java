package day00_personalPractice;

import java.util.Scanner;

public class C10_IfElseStatements {
    public static void main(String[] args) {

        // Soru 5 - Kullanicidan bir karakter isteyin,
        //          girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        //          yoksa girilen karakteri yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char krk = scan.next().charAt(0);

        if ('a'<= krk && krk<='z'){
            System.out.println(Character.toUpperCase(krk));
            System.out.println((char)(krk-32));
        }else {
            System.out.println(krk);
        }

    }
}
