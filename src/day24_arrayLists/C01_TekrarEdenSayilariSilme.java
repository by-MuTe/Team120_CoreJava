package day24_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_TekrarEdenSayilariSilme {

    public static void main(String[] args) {

        /*
            Soru 1 -    Verilen bir array’de tekrar eden elementler icin,
                        mukerrer olanlari silip,
                        tum elemanlardan sadece 1 tane yapip bize dondurecek bir method olusturun.
         */

        int[] arr = {2,4,5,3,2,5,1,5,3,7};

        // [2,4,5,3,1,7]

        /*
            Array'in en buyuk problemi uzunlugunun degisememesidir.
            Bunun icin java, array altyapisini kullanan
            ama uzunlugu esnek olan ArrayList class'ini olusturmustur.
         */

        List<Integer> tekrarsizList = new ArrayList<>();
        // listler primitive data turlerinden olusmaz
        // non-primitive data türleri kullanırız

        System.out.println(tekrarsizList); // []

        // benzersiz elementlerden olusan bir list icin
        // for loop ile array'deki tum elementleri ele alip
        // ele aldigimiz element listede yoksa listeye ekleyebiliriz

        for (int i = 0; i < arr.length ; i++) {

            if (!tekrarsizList.contains(arr[i])){
                tekrarsizList.add(arr[i]);
            }
        }

        System.out.println(tekrarsizList); // [2, 4, 5, 3, 1, 7]

        // array'i unique degerlerden olusan haline donusturun

        System.out.println(Arrays.toString(arr)); // [2, 4, 5, 3, 2, 5, 1, 5, 3, 7]

        arr = new int[tekrarsizList.size()];

        System.out.println(Arrays.toString(arr)); // [0, 0, 0, 0, 0, 0]

        // bir loop ile listedeki elementleri, array'e atayabiliriz

        for (int i = 0; i < arr.length ; i++) {

            arr[i] = tekrarsizList.get(i);
        }

        System.out.println(Arrays.toString(arr)); // [2, 4, 5, 3, 1, 7]

    }
}
