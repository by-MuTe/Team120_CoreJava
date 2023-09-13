package day22_arrays_multiDimensionalArrays;

import java.util.Arrays;

public class C08_MultiDimensioanalArrays {

    public static void main(String[] args) {

        /*
            Array'ler sayesinde
            birden fazla element barindirabilen yapilara giris yaptik

            bir okul dusunsek
            tum ogrencileri tek bir array'e koymak mantikli olmaz

            ogrencileri sinif ve subelere gore ayirmaliyiz

            Okul = { {5.siniflar}, {6.siniflar}, {7.siniflar}, {8.siniflar} }

            Okul = { { {5-A sinifi},{5-B Sinifi} } , {6.siniflar}, {7.siniflar}, {8.siniflar} }

            boylece 5-A sinifindaki bir ogrenciyi
            tum okulda aratmak yerine
            once 5.siniflar array'ine gider
            onun icinde de 5-A array'ine bakarim
         */

        int[][] arr = {{3,4,5},{2,3},{1}};

        // int[][] iki katli array belirtir
        // ilk [] ana array'i (outerArray) kontrol eder
        // ikinci[] ise icerdeki array'leri (innerArray) kontrol eder

        System.out.println(arr[1][1]); // 3
        System.out.println(arr[0][2]); // 5

        System.out.println(arr[2].length); // 1

        System.out.println(arr[1]); // [I@3b6eb2ec
        System.out.println(Arrays.toString(arr[1])); //  [2, 3]

        // MDA'in tumunu yazdirmak isterseniz
        // tek katli arrayleri yazdirmak icin kullandigimiz yontem yeterli olmaz

        System.out.println(Arrays.toString(arr)); // [[I@1e643faf, [I@3b6eb2ec, [I@6e8dacdf]
        System.out.println(Arrays.deepToString(arr)); // [[3, 4, 5], [2, 3], [1]]

        System.out.println(arr.length); // 3

    }
}
