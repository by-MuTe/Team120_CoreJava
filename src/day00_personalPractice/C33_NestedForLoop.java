package day00_personalPractice;

import java.util.Scanner;

public class C33_NestedForLoop {
    public static void main(String[] args) {

        /*
            Asagidaki gibi bir sekil cizdirin;

            *  *  *  *  *  *  *  *
            *  *  *  *  *  *
            *  *  *  *
            *  *
         */

        for (int i = 8; i >=2 ; i=i-2) { // satir

            for (int j = 1; j <=i ; j++) { // sutun

                System.out.print("*  ");
            }
            System.out.println("");

        }

    }
}
