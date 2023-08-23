package day18_whileLoop_DoWhileLoop;

import java.util.Scanner;

public class C10_DoWhileLoop {
    public static void main(String[] args) {

        /*
            Soru 3- Kullanicidan bir pozitif sayi isteyin,
                    sayının tam kare olup olmadığını bulunuz,
                    tamkare ise true değilse false yazdırınız.
                    Ornek :  input : 16, output: 4 true
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Karekokunu bulmak istediginiz sayiyi giriniz.");
        int sayi= scan.nextInt();
        boolean sonuc= false;
        int karekok = 1;

        do {
            if (karekok*karekok==sayi) {
                sonuc = true;
                break;
            } else karekok++;

        } while (karekok<=sayi);

        if (sonuc==true){
            System.out.println(sayi + "\'nin karekoku : " + karekok);
        } else System.out.println("Sayi tam kare degil.");

    }
}
