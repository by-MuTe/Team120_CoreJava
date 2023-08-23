package day17_methodOlusturma_methodOverloading;

public class C06_WhileLoop {

    public static void main(String[] args) {

        /*
            Bir loop’un kac kere calisacagi belli degilse,
            veya bitis sarti loop degiskenine degil, baska bir degiskene bagli ise
            while loop daha kullanisli olacaktir.

            Ornegin kullanicidan sifre istiyorsak ve
            yanlis giris oldugu muddetce tekrar istememiz gerekiyorsa
            adim sayisini bilmemiz mumkun olmadigindan
            while loop tercih edilebilir.

            Veya kullanici istedigi muddetce kodumuzun ayni islemi yapmasini istiyorsak,
            kodun durmasini kullanicinin girecegi “cikis icin 0’a basiniz” gibi bir degere baglayip,
            kodu tekrar tekrar calistirabiliriz.
         */

        // 1'den 100'e kadar olan sayilari (sinirlar dahil)
        // for loop ile hesaplayin

        int toplam=0;

        for (int i = 1; i <= 100 ; i++) {
            toplam+=i;
        }

        System.out.println("for loop ile toplam : " + toplam); // for loop ile toplam : 5050

        toplam =0;
        int i = 1;

        while (i<=100){
            toplam += i ;
            i++;
        }

        System.out.println("while loop ile toplam : " + toplam); // while loop ile toplam : 5050

    }
}
