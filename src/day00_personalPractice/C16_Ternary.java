package day00_personalPractice;

public class C16_Ternary {
    public static void main(String[] args) {

        int a=10;
        System.out.println(a > 0 ? "Sayi Pozitif" : "Sayi Pozitif degil"); // Sayi Pozitif
        System.out.println(a>20 ? a*a : a++); // 10
        System.out.println(a < 100 || a < 0 ? 3 * a + 1 : 2 + a / 5); // 34

        int x=10;
        int y=15;

        int z = a>0 ? y++ : --x;

        System.out.println(x + ", " + y + ", " + z); // 10, 16, 15

    }
}
