package day08_ifElseIfStatements;

import java.util.Scanner;

public class C07_IfElseIfStatements {
    public static void main(String[] args) {

         /*
            Soru 3- Kullanicidan aldigi urun adedi ve liste fiyatini alin,
                    kullaniciya musteri karti olup olmadigini sorun.
                    Musteri karti varsa 10 urunden fazla alirsa %20, yoksa %15 indirim yapin,
                    Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin.
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen aldiginiz urun adedini giriniz.");
        byte urunAdedi= scan.nextByte();
        System.out.println("Urunun liste fiyatini \"TL\" olarak giriniz.");
        double listeFiyati= scan.nextDouble();
        System.out.println("Müşteri kartinizin olup olmadigini giriniz.\nVar / Yok");
        char musteriKarti= scan.next().toUpperCase().charAt(0);

        if (musteriKarti=='V' && urunAdedi>10){
            System.out.println("%20 İndirimli sepet tutariniz : "+ (listeFiyati*urunAdedi*0.8) + " TL'dir.");
        } else if (musteriKarti=='V' && urunAdedi>0) {
            System.out.println("%15 İndirimli sepet tutariniz : "+ (listeFiyati*urunAdedi*0.85) + " TL'dir.");
        } else if (musteriKarti=='Y' && urunAdedi>10) {
            System.out.println("%15 İndirimli sepet tutariniz : "+ (listeFiyati*urunAdedi*0.85) + " TL'dir.");
        } else if (musteriKarti=='Y' && urunAdedi>0) {
            System.out.println("%10 İndirimli sepet tutariniz : "+ (listeFiyati*urunAdedi*0.9) + " TL'dir.");
        } else System.out.println("Hatali bilgi");

    }
}
