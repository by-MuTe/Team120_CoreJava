package day12_stringManipulations;

public class C03_lastIndexOf {
    public static void main(String[] args) {

        // Verilen bir cumlede, istenen bir String icin
        // asagidaki cumlelerden uygun olani yazdirin
        // 1- aradiginiz kelime cumlede 1 kere kullanilmis
        // 2- aradiginiz kelime cumlede 1'den fazla kullanilmis
        // 3- aradiginiz kelime cumlede hic kullanilmamis

        String cumle= "Yasasin java, iyi ki java ogreniyorum";
        String kelime= "java";

        int ilkIndex= cumle.indexOf(kelime);
        int lastIndex= cumle.lastIndexOf(kelime);

        if (ilkIndex == (-1)){
            System.out.println("Aradiginiz kelime cumlede hic kullanilmamis");
        } else if (ilkIndex == lastIndex) {
            System.out.println("Aradiginiz kelime cumlede 1 kere kullanilmis");
        }else{
            System.out.println("Aradiginiz kelime cumlede 1'den fazla kullanilmis");
        }

    }
}
