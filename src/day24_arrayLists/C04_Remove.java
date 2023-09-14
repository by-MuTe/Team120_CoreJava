package day24_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C04_Remove {

    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();

        isimler.add("Kaan");
        isimler.add("Bulent");
        isimler.add("Tugba");
        isimler.add("Burhan");
        isimler.add("Kaan");

        System.out.println(isimler); // [Kaan, Bulent, Tugba, Burhan, Kaan]

        // list.remove (istenenObje)
        // Istenen objeyi siler ve bize boolean sonuç döndürür.
        // Silmek istedigimiz obje list’de yoksa list’de bir degisiklik olmaz,
        // remove( ) bize false döndürür.
        System.out.println(isimler.remove("Hasan")); // false
        System.out.println(isimler.remove("Kaan")); // true

        System.out.println(isimler); // [Bulent, Tugba, Burhan, Kaan]

        // list.remove (istenenIndex)
        // Istenen indexdeki elementi siler ve bize sonuç olarak silinen elementi döndürür.
        System.out.println(isimler.remove(1)); // Tugba
        System.out.println(isimler); // [Bulent, Burhan, Kaan]

        // Silmek istedigimiz index list’de yoksa exception olusur.
        System.out.println(isimler.remove(5)); // IndexOutOfBoundsException

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(7);
        sayilar.add(1);

        System.out.println(sayilar); // [3, 5, 7, 1]

        sayilar.remove(1);
        System.out.println(sayilar.remove(1)); // 5
        System.out.println(sayilar); // [3, 7, 1]

        // Istenen Integer objeyi, obje olarak remove etmek istersek,
        // oncelikle o objeyi bir variable olarak olusturup,
        // list.remove(variableIsmi) seklinde kullanmaliyiz.
        Integer silinecekElement = 1;
        sayilar.remove(silinecekElement);

        System.out.println(sayilar); // [3, 7]

        // List’deki tum elementleri silme
        sayilar.clear();
        System.out.println(sayilar); // []

        // Bir list’de baska bir list’in tum elementleri silme
        // list.removeAll (silinecekList)

        // lki list’in esit oldugunu kontrol etme
        // list.equals (digerList)

    }
}
