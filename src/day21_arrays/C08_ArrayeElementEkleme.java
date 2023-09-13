package day21_arrays;

import java.util.Arrays;

public class C08_ArrayeElementEkleme {
    public static void main(String[] args) {

        /*
            Soru 7- Verilen bir array’e istenen bir elemani ekleyip
            bize donduren bir method yazin,
            eski array’e yeni degeri atayin.
         */

        int[] arr = {1,3,5,7,9};
        int eklenecekElement = 11;

        System.out.println(Arrays.toString(elementEkleme(arr, eklenecekElement)));

    }

    public static int[] elementEkleme (int[] arr , int eklenecekElement) {

        int length = arr.length;
        int[] newArr = new int[length+1];

        for (int i = 0; i < length ; i++) {
            newArr[i]=arr[i];
        }

        newArr[length]= eklenecekElement;

        arr=newArr;

        return arr;

    }

    public static String[] elementEkleme (String[] arr , String eklenecekElement) {

        int length = arr.length;
        String[] newArr = new String[length+1];

        for (int i = 0; i < length ; i++) {
            newArr[i]=arr[i];
        }

        newArr[length]= eklenecekElement;

        arr=newArr;

        return arr;

    }
}
