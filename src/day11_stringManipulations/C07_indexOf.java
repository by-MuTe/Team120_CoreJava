package day11_stringManipulations;

public class C07_indexOf {

    public static void main(String[] args) {

        String str = "Ali topu at, at ali at";

        // Ali'nin index'i nedir?  0
        System.out.println(str.indexOf("Ali"));

        // at'in index'i nedir ? 9
        System.out.println(str.indexOf("at")); // 1 birden fazla ise ilk buldugunu verir

        // op'un index'i nedir? 5
        System.out.println(str.indexOf("op"));

        System.out.println(str.indexOf('a')); // 9

        System.out.println(str.indexOf("a", 10)); // 13
        System.out.println(str.indexOf("a", 9)); // 9

        System.out.println(str.indexOf("yusuf")); // -1
        // aranan String yoksa -1 doner

    }
}
