package day06_concatenation_matematikselOperatorler;

public class C05_Or_Operatoru {

    public static void main(String[] args) {

        /*
            || (OR) operatoru iyimserdir
            Yani tek bir true bile yeterli olur
            or operatorunde tum mantiksal ifadeler false ise sonuc false
            Bunun disindaki tum durumlarda sonucu true yapar

            Or operatoru matematikteki toplama islemine benzer
            toplanan sayilarda bir tane bile 0 olmayan varsa, sonuc sifir olmaz

            0 + 0 + 0 + 0 + 0 ==> 0
            2 + 0 + 0 + 0 +1  != 0
            1 + 1 + 1 + 3 + 5 != 0
         */

        System.out.println( 3 > 5 || 6 > 4); // false || true  ==> true
        System.out.println( 3 < 5 || 6 > 4); // true  || true  ==> true
        System.out.println( 3 < 5 || 6 < 4); // true  || false ==> true
        System.out.println( 3 > 5 || 6 < 4); // false || false ==> false

        int sayi = 24;
        // sayi 3 veya 5'e bolunmelidir

        System.out.println(sayi % 3 == 0 || sayi % 5 == 0); // true || false ==> true

        // sayi 0'dan buyuk veya 100'den kucuk olmalidir

        System.out.println(sayi>0 || sayi<100); // true || true ==> true

        /*
            0'dan buyuk ve 100'den kucuk sayilar
                0 < a < 100
            matematikte 3'lu karsilastirma mumkundur ancak Java 3'lu karsilastirma yapmaz
            2'li karsilastirmalar yapip, mantiksal operatorlerle birbirine baglamalisiniz
                0<a  && a<100  java'da boyle yazilir
            0'dan kucuk veya 100'den buyuk sayilar
                a<0 || a>100

            bir ucgenin 3 kenari a,b,c uzunluklarindadir.
            bu ucgenin eskenar oldugunu kontrol etmek isterseniz
                a==b && b==c
         */

    }
}
