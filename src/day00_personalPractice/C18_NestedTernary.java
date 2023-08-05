package day00_personalPractice;

public class C18_NestedTernary {
    public static void main(String[] args) {

        int a=10;
        int b=20;

        System.out.println(a > 5 ? a > 0 ? 100 : 50 : a < 20 ? a + 5 : a - 5); // 100
        System.out.println(b < a ? b > 0 ? b + a : b - a : a < 10 ? a * 5 : b / a); // 2
        System.out.println(a == b ? a > b ? a : b : a < b ? a + b : a - b); // 30

    }
}
