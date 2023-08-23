package day06_concatenation_matematikselOperatorler;

public class C04_And_Operatoru {


    public static void main(String[] args) {

        System.out.println( 5 > 3 && 6 > 4 ); // true and true ==> true

        System.out.println( 5 < 3 && 6 > 4 ); // false and true ==> false

        System.out.println( 5 > 3 && 6 <= 4 ); // true and false ==> false

        System.out.println( 5 <= 3 && 6 <= 4 ); // false and false ==> false

        /*
            && , & (AND)
            And operatoru mukemmelliyetcidir
            2 boolean ifadenin ikisi de true ise sonucu true yapar
            Bunun disindaki tum durumlarda sonucu false yapar
            Bu yonuyle matematikteki carpmaya benzer

            && ile &’ in farki;
            && operatoru birbirine bagli mantiksal ifadeleri incelerken, ilk false degeri ile
            karsilastiginda, sonucun false olacagini algilar ve geriye kalan mantiksal ifadeleri
            incelemeden hemen sonucu false olarak atar.
            & operatoru ise birbirine bagli mantiksal ifadeleri incelerken, herbir mantiksal
            ifadenin sonucuna gore karar vermez, islemin sonucuna kadar gider. Tum islem
            bittikten sonra sonuca atama yapar.
            && Operatoru tum mantiksal ifadeleri kontrol etmeden sonuca gidebildigi icin daha hizlidir.

            1 * 1 * 1 * 1 * 1 * 1 = 1
            1 * 0 * 1 * 1 * 1 * 1 = 0
            1 * 0 * 0 * 0 * 0 * 0 = 0
         */

        // bir sayinin hem 2, hem 3, hem de 5 ile bolunebilmesi lazim

        int sayi =24;

        System.out.println( sayi % 2 == 0 && sayi % 3 == 0 && sayi % 5 == 0);
        //                       true     &&      true     &&      false ==> false

        // sayi 0 veya daha buyuk ve 100 veya daha kucuk olmalidir
        // sayi 0 ile 100 arasinda olmalidir(0 ve 100 dahil)

        System.out.println( sayi >= 0 && sayi <= 100);
        //                      true  &&     true ==> true

    }
}
