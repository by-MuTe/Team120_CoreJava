package day24_arrayLists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class C06_CollectionsSort {
    public static void main(String[] args) {

        // Bir list’deki elementleri siralama

        List<String> isimler = new ArrayList<>();

        isimler.add("Cemil");
        isimler.add("Omer");
        isimler.add("Mertkan");
        isimler.add("Serkan");

        System.out.println(isimler); // [Cemil, Omer, Mertkan, Serkan]

        Collections.sort(isimler);

        System.out.println(isimler); // [Cemil, Mertkan, Omer, Serkan]

    }
}
