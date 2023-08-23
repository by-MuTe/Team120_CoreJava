package day00_personalPractice;

public class C23_ilkTest {
    public static void main(String[] args) {

        // Gittigimiz web sayfasindan aldigimiz
        // String arama sonuclarinda
        // arama sayisinin 50'den fazla oldugunu test edin

        String input = "1-48 of 87 results for \"nutella\"";

        int ofIndexi= input.indexOf("of");
        int boslukIndexi= input.indexOf(" ",ofIndexi);
        int ikinciboslukIndexi= input.indexOf(" ", boslukIndexi+1);
        String sonucStr= input.substring(boslukIndexi+1 , ikinciboslukIndexi);
        int sonucInt= Integer.parseInt(sonucStr); //parseInt stringi inte cevirir
        if (sonucInt>50){
            System.out.println("Nutella arama testi PASSED");
        } else{
            System.out.println("İstenen kadar sonuc yok, Nutella arama testi FAILED");
        }

        /*
        int indexOf= input.indexOf("of");
        int indexResults= input.indexOf("results");

        String sonucSayisiString= input.substring(indexOf+3,indexResults-1);

        // arama sonuc sayisinin 50'den fazla oldugunu test edin

        int sonucSayisiInt= Integer.parseInt(sonucSayisiString); //parseInt stringi inte cevirir

        if (sonucSayisiInt>50){
            System.out.println("Nutella arama testi PASSED");
        }else{
            System.out.println("İstenen kadar sonuc yok, Nutella arama testi FAILED");
        }
         */

    }
}
