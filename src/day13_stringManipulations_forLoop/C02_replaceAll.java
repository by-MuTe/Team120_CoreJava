package day13_stringManipulations_forLoop;

public class C02_replaceAll {
    public static void main(String[] args) {

        String str = "1Ja4va 8C9a2n5d1i1r.";

        str= str.replace("1","");

        System.out.println(str); // Ja4va 8C9a2n5dir.

        // Sayilarin tamamindan kurtulmak istersek
        // replace() yeterli olmaz

        // java da sayilar, ozel karakterler, alfabetik karakterlerin
        // tumuyle islem yapmak isterseniz
        // replaceAll(istenenGrup, yeniDeger)

        // replaceAll'da ***char*** olmaz

        // ornegin butun rakamlarin yerine "" atamak icin
        str= str.replaceAll("\\d" ,"");
        System.out.println(str); // Java Candir.

        /*
        Regex (Regular Expressions)
            \\s  : space	 	                    \\S : space olmayan hersey
            \\s+ : yanyana birden fazla space
            \\d  : digits (rakamlar)                \\D : digit olmayan hersey
            \\w  : harf veya rakam ve alt çizgi(_)  \\W : harf veya rakam olmayan hersey (ozel karakterler)
         */

        // buradaki harf sayisini bulun
        String input3="Ali Can, Merve Star, Mark Tom";
        input3=input3.replaceAll("\\W","");
        System.out.println(input3); // AliCanMerveStarMarkTom
        System.out.println(input3.length()); // 22

    }
}
