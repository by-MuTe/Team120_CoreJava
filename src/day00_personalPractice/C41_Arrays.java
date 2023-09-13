package day00_personalPractice;

public class C41_Arrays {
    public static void main(String[] args) {

        // Bir marketin fiyatlarini tutan bir array var
        // Bu marketteki en yuksek ve en dusuk fiyatlari yazdiran bir method olusturun

        double[] fiyatlar={23, 34.5, 42.1, 5.7, 13.4, 23.5};

        enYuksekEnDusukFiyatYazdir(fiyatlar);

    }

    public static void enYuksekEnDusukFiyatYazdir (double[] fiyatlar){

        double enYuksekFiyat = fiyatlar[0];
        double enDusukFiyat = fiyatlar[0];

        for (int i = 0; i < fiyatlar.length ; i++) {

            if (fiyatlar[i]<enDusukFiyat){
                enDusukFiyat=fiyatlar[i];
            }
            if (fiyatlar[i]>enYuksekFiyat){
                enYuksekFiyat=fiyatlar[i];
            }
        }
        System.out.println("Marketteki en yuksek fiyatli urun = "+enYuksekFiyat+
                "\nMarketteki en dusuk fiyatli urun = "+enDusukFiyat);

    }
}
