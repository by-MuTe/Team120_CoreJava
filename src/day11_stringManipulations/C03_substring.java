package day11_stringManipulations;

public class C03_substring {
    public static void main(String[] args) {

        String str = "Java Candir";

        /*
            substring() bize verilen bir String'in istenen parcasini alma imkani tanir

            2 turlu kullanimi vardir
            1- baslangic index'ini verirseniz, o indexten sona kadar olan kismi verir
            2- baslangic ve bitis indexlerini verirseniz
               baslangic index'inden (dahil) baslar
               bitis index'ine kadar(haric) aradaki karakterleri yazdirir
         */

        System.out.println(str.substring(3)); // a Candir
        System.out.println(str.substring(7)); // ndir
        System.out.println(str.substring(0)); // Java Candir

        System.out.println(str.substring(11)); // hiclik
        System.out.println(str.substring(str.length())); // hiclik
        // System.out.println(str.substring(15)); // StringIndexOutOfBoundsException

        //    "Java Candir";

        System.out.println(str.substring(3,6)); // a C
        System.out.println(str.substring(5,10)); // Candi
        System.out.println(str.substring(1,2)); // a
        System.out.println(str.substring(6,7)); // a

        // bu yazim bize istenen index'deki tek bir elementi verir
        // charAt()'e benzer ama arti bir ozelligi var
        // substring bize String verdigi icin manipulation yapmaya devam edebiliriz

        // 6.indexdeki harfi buyuk harf olarak yazdirin
        System.out.println(str.substring(6,7).toUpperCase());

        // Eger parametre olarak ayni index’i baslangic ve bitis olarak secersek bize hiclik döndürür.
        System.out.println(str.substring(3,3)); // hiclik yazdirir

        // Eger parametre olarak girilen bitis index’i, baslangictan kucuk olursa hata olusur.
        // System.out.println(str.substring(8,5)); // StringIndexOutOfBoundsException

        // Eger sondan istenen kadar karakteri elde etmek istersek
        // length( )- istenenkarakterSayisi kullanilir.
        System.out.println(str.substring(str.length()-3)); // dir

        String cumle= "Java ne kadar guzel";

        // cumle'den "guzel" yazdiralim
        System.out.println(cumle.substring(14,19)); // guzel
        System.out.println(cumle.substring(14)); // guzel
        System.out.println(cumle.substring(cumle.length()-5)); // guzel

        // substring kullanarak 9.indexdeki harfi buyuk olarak yazdirin
        System.out.println(cumle.substring(9, 10).toUpperCase()); // A
        System.out.println(cumle.toUpperCase().charAt(9)); // A

        String str1 = "Java";
        String str2 = " ";
        String str3 = "Candir";

        // yukaridaki variable'lari kullanarak "Java Candir" yazdirin

        System.out.println(str1+ str2 + str3); // Java Candir
        System.out.println(str1.concat(str2).concat(str3)); // Java Candir
        System.out.println(str1+ " " + str3); // Java Candir
        System.out.println(str1.concat(str3)); // JavaCandir
        System.out.println(str1.concat(" ").concat(str3)); // Java Candir

    }
}
