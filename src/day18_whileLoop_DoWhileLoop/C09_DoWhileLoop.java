package day18_whileLoop_DoWhileLoop;

public class C09_DoWhileLoop {
    public static void main(String[] args) {

        // Soru 1-  ’k’ harfinden ‘t’ harfine kadar harfleri yazdirin.
        //          verilen baslangic ve bitis karakterleri dahil
        //          aradaki tum karakterleri yazdirin

        char karakter = 'k';

        do {
            System.out.print((char)karakter + " ");
            karakter++;
        } while (karakter<='t');

    }
}
