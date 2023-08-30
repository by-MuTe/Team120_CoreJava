package day19_scope;

import java.util.Scanner;

public class C05_Static_Instance {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        scan.nextInt();
        // static olmayan nextInt() methodunu static olan main methodda ancak obje ile kullanabiliriz

    }
}
