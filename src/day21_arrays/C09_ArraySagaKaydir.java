package day21_arrays;

import java.util.Arrays;

public class C09_ArraySagaKaydir {
    public static void main(String[] args) {

        /*
            Soru 3- Verilen bir array’deki tum elementleri bir saga kaydirip, sondaki elementi de
                    basa tasiyacak bir method olusturun, array’i yeni haliyle kaydedin.
                    Orn : input : [4,5,6,7] array’in son hali. : [7,4,5,6]
         */

        int[] arr = {4,5,6,7};

        System.out.println(Arrays.toString(sagaKaydir(arr)));

    }

    public static int[] sagaKaydir(int[] arr){

        int[] newArr = new int[arr.length];

        for (int i = 0; i <arr.length-1 ; i++) {
            newArr[i+1]=arr[i];
        }

        newArr[0]=arr[arr.length-1];

        arr=newArr;

        return arr;

    }
}
