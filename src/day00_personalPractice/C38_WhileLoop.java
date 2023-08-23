package day00_personalPractice;

import java.util.Scanner;

public class C38_WhileLoop {
    public static void main(String[] args) {

        /*
        Soru 4-     Kullanicidan toplanmak uzere pozitif tamsayilar isteyin
                    Kullaniciya bitirmek istediginde 0'a basmasini soyleyin
                    Kullanici bitirmek istediginde toplam kac adet pozitif tam sayi girdigini ve
                    bunlarin toplaminin kac oldugunu yazdirin
                    Kullanici negatif sayi girerse "Negatif sayi kullanamazsiniz" yazdirin
                    bu negatif sayiyi sayi adedine ve toplama eklemeyin
        */

        Scanner scan= new Scanner(System.in);
        int adet=0;
        int toplam=0;
        int girilenSayi=1;

        while (girilenSayi!=0){
            System.out.println("Lutfen toplanmasini istediginiz pozitif tam sayiyi giriniz. \nBitirmek için \"0\"a basiniz.");
            girilenSayi= scan.nextInt();
            if (girilenSayi==0){
                break;
            } else if (girilenSayi<0) {
                System.out.println("Negatif sayi kullanamazsiniz.");
            } else {
                adet++;
                toplam+=girilenSayi;
            }
        }

        System.out.println(adet + " adet sayi girdiniz ve girdiginiz sayilarin toplami : " + toplam);

    }
}
