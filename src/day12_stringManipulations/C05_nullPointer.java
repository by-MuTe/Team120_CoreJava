package day12_stringManipulations;

public class C05_nullPointer {

    public static void main(String[] args) {

        String str1;

        // System.out.println(str1);
        // str1.concat(" candir");

        str1 = "java";

        System.out.println(str1); // java
        System.out.println(str1.concat(" candir")); // java candir

        /*
            null bir deger degil pointer(isaretcidir)
            // yanina yazildigi non-primitive variable'a deger atanmadigini isaret eder

            28.satir icin
            str2'nin degeri null veya str2'ye null degeri atanmis ifadeleri YANLISTIR

            dogru olan ifade
            str2'ye deger atamadik, bunun farkindayiz ve null olarak isaretledik
         */

        String str2 = null; // str= "null" degil
                            // null olarak isaretlenmis, degeri null atanmis degil
        System.out.println(str2); // null
        System.out.println(str2 + " candir"); // null candir

        // System.out.println(str2.concat(" candir")); // Run Time Error---NullPointerException

        str2= "tava";

        System.out.println(str2); // tava
        System.out.println(str2.concat(" candir")); // tava candir

        // int sayi = null; primitive variable'lara null degeri olmaz
        Integer sayi = null;

        String str3 = null;
        String str4 = "";
        String str5;

        System.out.println(str4.isBlank()); // true
        System.out.println(str4.isEmpty()); // true

        // System.out.println(str5); // CTE
        // System.out.println(str5.length()); // CTE

        System.out.println(str3); // null
        // System.out.println(str3.length()); // Run Time Error---NullPointerException
        // System.out.println(str3.isBlank()); // Run Time Error---NullPointerException
        // System.out.println(str3.isEmpty()); // Run Time Error---NullPointerException

        // biz genelde String bir ifade olusturup, sonra deger atayacaksak
        // hiclik degeri atariz

        String str6 ="";    // str6'ya deger atanmistir
                            // atanan deger hiclik'dir

        System.out.println(str6.concat("Java")); // Java

        // null olarak isaretlenen bir String HIC BIR METHOD'LA kullanilamaz
        // sadece yazdirilabilir veya + ile kullanilabilir

        System.out.println(str6.isEmpty()); // true

    }
}
