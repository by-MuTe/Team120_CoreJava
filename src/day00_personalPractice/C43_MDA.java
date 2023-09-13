package day00_personalPractice;

public class C43_MDA {
    public static void main(String[] args) {

        // Soru 1 -     Verilen 2 katli bir array’de bulunan cift sayilari toplayip,
        //              sonucu yazdiran bir method olusturun.

        int[][] sayilar = {{1,2,5},{7,4},{9},{3,0,1,6,8}};

        ciftSayilariTopla(sayilar);

    }

    public static void ciftSayilariTopla (int[][] arr){

        int ciftSayilarToplami= 0;

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                if (arr[i][j]%2==0){
                    ciftSayilarToplami += arr[i][j];
                }
            }

        }

        System.out.println("Cift sayilarin toplami = " + ciftSayilarToplami);

    }
}
