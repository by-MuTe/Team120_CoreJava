package day02_dataTurleri_variable;

public class C01_VariableOlusturma {

    public static void main(String[] args) {

        /*
        Java'da kodlarimizi class'larda olustururuz
        Class'lar ihtiyac duyuldugunda obje olusturmak icin de kullanilir
        Java'nin baslangic noktasi(entry point) main method'dur
        variable'lari datalarimizi saklamak (store) icin olustururuz
        */

        System.out.println("Java Candir");

        String             ogrenciIsmi               =                "Matrix      ."     ;
        // Data turu       variable ismi       assignment(atama)      Variable degeri     işlem sonu
        // declaration (tanimlama) : eşitliğin sol tarafi
        // deger atama (assignment) : eşitlik ve eşitliğin sağ tarafi

        System.out.println(ogrenciIsmi); // Matrix      .

        int sayi;

        // Deklarasyon SADECE bir kez yapilabilir
        // ama deger atamasi(assignment) istendigi kadar yapılabilir

        // boolean sayi = 20;

        // bir variable deger atanmadan da deklare edilebilir
        // ancak deger atanmayan bir variable kullanilamaz
        // System.out.println(sayi);

        sayi = 20 ;

        System.out.println(sayi); // 20

        System.out.println("sayi");  // sayi

        System.out.println(sayi); // 34. satirda sayi variable'nin degeri 20

        sayi = sayi + 10 ;

        System.out.println(sayi); // 42. satirda sayi variable'nin degeri 30

        sayi = 2* sayi +20;

        System.out.println(sayi); // 46. satirda sayi variable'nin degeri 80

    }
}
