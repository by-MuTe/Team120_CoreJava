package day00_personalPractice;

public class C36_WhileLoop {
    public static void main(String[] args) {

        // Soru 1-  While loop kullanarak 2 basamakli 7 ile bolunebilen pozitif tamsayilari yazdirin.

        int sayi = 10;

        while (sayi <= 99){
            if (sayi%7==0){
                System.out.print(sayi + " ");
            }
            sayi++;
        }

        // for loop ile yapilabilecek bir soruyu illa da
        // while loop ile yapmak biraz daha zahmetli

        System.out.println("");

        for (int sayi2=10; sayi2 <100 ; sayi2++) {
            if (sayi2%7==0){
                System.out.print(sayi2 + " ");
            }

        }

    }
}
