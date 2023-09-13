package day00_personalPractice;

import java.util.Arrays;

public class C45_MDA {
    public static void main(String[] args) {

        // Soru 4 -     Verilen 2 katli bir array’de bulunan tum sayilarin carpimini
        //              bize donduren bir method olusturun.

        int[][] sayilar = {{1,2,5},{7,4},{9},{3,1,6,8}};

        System.out.println(carpimBul(sayilar));

    }

    public static int carpimBul (int[][] arr){

        int carpim=1;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                carpim*=arr[i][j];
            }
        }
        return carpim;

    }
}
