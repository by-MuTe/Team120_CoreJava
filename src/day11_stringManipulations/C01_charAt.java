package day11_stringManipulations;

public class C01_charAt {
    public static void main(String[] args) {

        String str = "Java Candir"; // 11 tane karakter barindirir

        // java'da index 0'dan baslar
        // J==> 0.index, r==>10.index

        // ilk harfini yazdirin
        System.out.println(str.charAt(0));

        // 7.harfi yazdirin
        System.out.println(str.charAt(6)); // a

        // Bu metnin uzunlugu 11
        // son harfi yazdirin
        System.out.println(str.charAt(11-1)); // r

        // sondan 3.harfi yazdirin
        System.out.println(str.charAt(11-3)); // d

        // eger sondan basa dogru gelecek sekilde bir char isteniyorsa
        // charAt(uzunluk - sondanKacinciKarakter)

        // metnin uzunlugundan daha buyuk bir siradaki karakter istenirse
        // 20.karakteri yazdirin
        // System.out.println(str.charAt(20)); // StringIndexOutOfBoundsException

        // 4.harfi buyuk harf olarak yazdirin
        System.out.println(str.toUpperCase().charAt(3));

        /*
            charAt()'u bize char data turunde bir sonuc verir (döndürür)
            toUpperCase() gibi method'lar String variable'lar ile calistigindan
            charAt() calistiktan sonra String Manipulation YAPILAMAZ
            eger manipulation ihtiyaci varsa, charAt() kullanilmadan once yapilmalidir
         */

         /*
            Java'da 2 turlu hata ile karsilasabiliriz
            1 - syntax olarak hatali yazilan kodlari Java compile ederken anlar ve altini kirmizi cizer
                str = 23; String bir variable'a int deger atanamayacagini bilir ve altini kirmizi cizer
                CompileTimeError (CTE) diyoruz
            2 - Bazen de syntax'de hata olmaz
                Java sorunu calismaya basladiktan sonra farkeder
                str.charAt(15) : burada verilen str'dan bir karakter isteniyor
                compile time'da str'in uzunlugunu Java anlamaz
                ama calisinca 15.index'in olmadigini farkeder ve exception firlatir
                RunTimeError (RTE) deriz
         */

    }
}
