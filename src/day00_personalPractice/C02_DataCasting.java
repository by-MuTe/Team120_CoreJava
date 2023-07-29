package day00_personalPractice;

import java.util.Scanner;

public class C02_DataCasting {
    public static void main(String[] args) {

        // Soru 2- Kullanicidan bir harf alin ve alfabede o harften sonraki 3 harfi yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen sonraki 3 harfi ogrenmek istediginiz bir harf giriniz.");
        char girilenHarf= scan.next().charAt(0);
        if ((girilenHarf>='a' && girilenHarf<='z') || (girilenHarf>='A' && girilenHarf<='Z')) {
            if (((girilenHarf+1)>='a' && (girilenHarf+1)<='z') || (girilenHarf+1)<='Z'){
                System.out.print((char)(girilenHarf+1) + ", ");
            }else System.out.print("harf yok, ");
            if (((girilenHarf+2)>='a' && (girilenHarf+2)<='z') || (girilenHarf+2)<='Z'){
                System.out.print((char)(girilenHarf+2) + ", ");
            }else System.out.print("harf yok, ");
            if (((girilenHarf+3)>='a' && (girilenHarf+3)<='z') || (girilenHarf+3)<='Z'){
                System.out.print((char)(girilenHarf+3));
            }else System.out.print("harf yok");
        }
        else System.out.println("Yanlis giris");

    }
}
