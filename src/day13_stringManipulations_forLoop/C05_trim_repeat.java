package day13_stringManipulations_forLoop;

public class C05_trim_repeat {
    public static void main(String[] args) {

        /*
        str.repeat (tekrarSayisi);
        Bir String’i tekrarSayisi kadar tekrar ettirir.
         */

        String str= "Java Candir.";
        System.out.println(str.repeat(4)); // Java Candir.Java Candir.Java Candir.Java Candir.

        /*
        str.trim ( );
        Bir String’in basinda ve sonunda (varsa) bulunan space’leri siler.
         */

        String str2="       Ali kos       ";
        str2= str2.trim();
        System.out.println(str2); // Ali kos

    }
}
