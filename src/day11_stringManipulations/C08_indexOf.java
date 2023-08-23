package day11_stringManipulations;

public class C08_indexOf {
    public static void main(String[] args) {

        /*
        Verilen bir cumlede, istenen bir String icin
        asagidaki cumlelerden uygun olani yazdirin
            1- aradiginiz kelime cumlede 1 kere kullanilmis
            2- aradiginiz kelime cumlede 2 kere kullanilmis
            3- aradiginiz kelime cumlede 2'den fazla kullanilmis
            4- aradiginiz kelime cumlede hic kullanilmamis
         */

        String cumle= "Yasasin java, iyi ki java ogreniyorum";
        String kelime= "java";

        if (cumle.indexOf(kelime) == (-1)){
            System.out.println("Aradiginiz kelime cumlede hic kullanilmamis");
        } else {
            int kelimeIlkIndex= cumle.indexOf(kelime); // 8
            if (cumle.indexOf(kelime,(kelimeIlkIndex+1))==(-1)){
                System.out.println("Aradiginiz kelime cumlede 1 kere kullanilmis");
            }else {
                int ikinciKelimeIndex=cumle.indexOf(kelime,(kelimeIlkIndex+1));
                if (cumle.indexOf(kelime,(ikinciKelimeIndex+1))==(-1)){
                    System.out.println("Aradiginiz kelime cumlede 2 kere kullanilmis");
                }else{
                    System.out.println("Aradiginiz kelime cumlede 2'den fazla kullanilmis");
                }
            }
        }

    }
}
