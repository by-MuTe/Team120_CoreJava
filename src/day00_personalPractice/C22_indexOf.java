package day00_personalPractice;

import java.util.Scanner;

public class C22_indexOf {
    public static void main(String[] args) {

        // kullanicidan aldigimiz cumledeki "cok" ile baslayan ilk kelimeyi yazdirin
        // cumlede cok kelimesi gecmiyorsa "cumlede cok ile baslayan kelime yok" yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz.");
        String girilenCumle= scan.nextLine();

        // Sinavlarimizda cokdan secmeli sorular kullaniyoruz
        // javayi cok seviyoruz
        // bu kadar coklu secenek olur mu ?

        if (!girilenCumle.contains("cok")){
            System.out.println("Cumlede cok ile baslayan kelime yok");
        }else {
            int cokIndexi = girilenCumle.indexOf("cok");
            int boslukIndexi = girilenCumle.indexOf(" ", cokIndexi);
            System.out.println(girilenCumle.substring(cokIndexi, boslukIndexi));
        }

    }
}
