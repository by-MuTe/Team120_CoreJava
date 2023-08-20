package day00_personalPractice;

import java.util.Scanner;

public class C32_ForLoop {
    public static void main(String[] args) {

        // Soru 2-  Kullanicidan pozitif bir tamsayi alin,
        //          1’den girilen sayiya kadar(girilen sayi dahil)
        //          7 ila bolunebilen sayilari yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir tamsayi giriniz.");
        int girilenSayi = scan.nextInt();

        for (int i = 1; i <= girilenSayi ; i++) {
            if (i%7==0){
                System.out.print(i + " ");
            }
        }

    }
}
