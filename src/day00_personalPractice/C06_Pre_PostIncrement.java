package day00_personalPractice;

public class C06_Pre_PostIncrement {
    public static void main(String[] args) {

        int a=10;
        System.out.println("a'nin degeri : " + ++a); // 11

        int b= a++; // b=11 a=12
        System.out.println("b'nin degeri : " + b); // 11

        int c= b++ + a; // c=23 b=12 a=12
        System.out.println("c'nin degeri : " + c); // 23

        System.out.println("Son toplam : " + (a+b+c)); // 47

    }
}
