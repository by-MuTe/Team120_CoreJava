package day24_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C07_subList {
    public static void main(String[] args) {

        // Bir list’in belirli bir bolumunu alma
        // list.subList(baslangicIndex,bitisIndexi)
        // baslangic dahil bitis haric

        List<String> isimler = new ArrayList<>();

        isimler.add("Cemil");
        isimler.add("Omer");
        isimler.add("Mertkan");
        isimler.add("Serkan");

        System.out.println(isimler.subList(1, 3)); // [Omer, Mertkan]

    }
}
