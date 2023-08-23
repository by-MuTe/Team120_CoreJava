package day00_personalPractice;

public class C26_StringManipulations {
    public static void main(String[] args) {

        /*
        Soru 1 : Kullanicidan bir cumle alin
                - cumlede ev geciyorsa, "home sweet home" yazdirin
                - cumlede is geciyorsa, "calismak guzeldir"
                - ikisini de iceriyorsa "Hem ev lazim hem is"
                - hicbirini icermiyorsa "cok calisman lazim" yazdirin
         */

        String str= "Evde calisiyorum, sirkete gitmeye gerek yok";

        String kullanilacakStr= str.toLowerCase();

        if (kullanilacakStr.contains("ev")){
            if (kullanilacakStr.contains("  is")){
                System.out.println("Hem ev lazim hem is");
            } else System.out.println("home sweet home");
        } else if (kullanilacakStr.contains(" is")) {
            System.out.println("calismak guzeldir");
        } else System.out.println("cok calisman lazim");

        // bu daha güzel;

        if (kullanilacakStr.contains("ev")&& kullanilacakStr.contains(" is")){
            System.out.println("Hem ev lazim hem is");
        } else if (kullanilacakStr.contains(" is")) {
            System.out.println("calismak guzeldir");
        } else if (kullanilacakStr.contains("ev") ) {
            System.out.println("home sweet home");
        }else{
            System.out.println("cok calisman lazim");
        }

    }
}
