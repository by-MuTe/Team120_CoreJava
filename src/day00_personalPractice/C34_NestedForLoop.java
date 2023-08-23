package day00_personalPractice;

public class C34_NestedForLoop {
    public static void main(String[] args) {

        // input olarak verilen kenar uzunluklarina gore
        // asagidaki sekli cizdirin

        int kisaKenar=6;
        int uzunKenar=9;

        /*
                * * * * * * * *   // bir satiri nasil yazdiracagimizi inner loop ile belirliyoruz
                * * * * * * * *
                * * * * * * * *
                * * * * * * * *
                * * * * * * * *
             Satirda yaptigimiz islemi kac kere tekrar edecegimizi ise outer loop belirliyor
         */

        for (int i = 1; i <=kisaKenar ; i++) { // satir

            for (int j = 1; j <=uzunKenar ; j++) { // sutun
                System.out.print("* ");
            }
            System.out.println(""); // satir ile islemimiz bittiginde alt satira gecmesi icin
        }

    }
}
