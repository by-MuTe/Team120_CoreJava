package day13_stringManipulations_forLoop;

public class C07_ForLoop {

    public static void main(String[] args) {

        // kullanicinin verdigi input degerinden baslayip
        // ardisik 10 tam sayi yazdirin

        int input = 8;

        for (int i = input; i < input+10 ; i++) {
            System.out.print(i + " ");
        }
        System.out.println("======");

        // kullanicinin verdigi sayidan baslayin
        // 100'e kadar(100 dahil) 5'er 5'er artirarak yazdirin

        for (int i = input; i <= 100 ; i+=5) {
            System.out.print(i + " ");
        }
        System.out.println("======");

        // 100'den baslayip 1'e kadar geri geri gidin
        // 7'nin kati olan sayilari yazdirin

        for (int i = 100; i >= 1 ; i--) {
            if (i % 7 == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println("======");

        // 50'den baslayip, 100'e kadar(100 dahil)
        // sayilari yan yana, aralarinda bir bosluk olacak sekilde yazdirin

        for (int i = 50; i <=100 ; i++) {
            System.out.print(i + " ");
        }
        System.out.println("======");

        // 3 basamakli sayilardan 23 ile bolunebilenleri
        // yan yana, aralarinda bir bosluk olacak sekilde yazdirin

        for (int i = 100; i <1000 ; i++) {
            if (i%23==0){
                System.out.print(i + " ");
            }
        }
        System.out.println("======");

        // 20'den baslayip, 7'ser artarak 100'e kadar yazdirin
        // (100 yazdirmamiz gerekiyorsa yazdirin ama 100'u gecmeyin)

        for (int i = 20; i <=100 ; i+=7) {
            System.out.print(i + " ");
        }
        System.out.println("======");

        // 100'den baslayarak 1'e kadar (sinirlar dahil)
        // 7 ile bolunebilen sayilari yazdirin

        for (int i = 100; i >=1 ; i--) {
            if (i%7==0){
                System.out.print(i + " ");
            }
        }

    }
}
