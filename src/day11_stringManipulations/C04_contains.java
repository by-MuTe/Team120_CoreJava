package day11_stringManipulations;

public class C04_contains {
    public static void main(String[] args) {

        String str = "Java gun gectikce guzellesiyor";

        // str Java iceriyor mu ?
        System.out.println(str.contains("Java")); // true

        // str java icerir mi ?
        System.out.println(str.contains("java")); // false

        // str a icerir mi ?
        System.out.println(str.contains("a")); // true

        System.out.println(str.contains(" ")); // true

        System.out.println(str.contains("")); // true

        // *** contains method'u aranan metnin sayisiyla ilgilenmez
        //     sadece VAR veya YOK sonucu dondurur

        // NOT :    contains( ) parametre olarak char kabul etmez,
        //          aranan charSequence yani String olmalidir

    }
}
