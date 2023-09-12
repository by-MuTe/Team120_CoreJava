package day00_personalPractice;

import java.util.Scanner;

public class C39_Arrays {
    public static void main(String[] args) {

        //  Verilen şehirler listesinde aranan harfin kaç kez olduğunu bulunuz.

        String[] iller = { "Adana", "Adıyaman", "Afyonkarahisar", "Ağrı", "Aksaray", "Amasya", "Ankara", "Antalya", "Ardahan",
                           "Artvin", "Aydın", "Balıkesir", "Bartın", "Batman", "Bayburt", "Bilecik", "Bingöl", "Bitlis",
                           "Bolu", "Burdur", "Bursa", "Çanakkale", "Çankırı", "Çorum", "Denizli", "Diyarbakır", "Düzce",
                           "Edirne", "Elazığ", "Erzincan", "Erzurum", "Eskişehir", "Gaziantep", "Giresun", "Gümüşhane",
                           "Hakkâri", "Hatay", "Iğdır", "Isparta", "İstanbul", "İzmir", "Kahramanmaraş", "Karabük", "Karaman",
                           "Kars", "Kastamonu", "Kayseri", "Kilis", "Kırıkkale", "Kırklareli", "Kırşehir", "Kocaeli", "Konya",
                           "Kütahya", "Malatya", "Manisa", "Mardin", "Mersin", "Muğla", "Muş", "Nevşehir", "Niğde", "Ordu",
                           "Osmaniye", "Rize", "Sakarya", "Samsun", "Şanlıurfa", "Siirt", "Sinop", "Sivas", "Şırnak",
                           "Tekirdağ", "Tokat", "Trabzon", "Tunceli", "Uşak", "Van", "Yalova", "Yozgat", "Zonguldak"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen iller listesinde aramak istediginiz harfi giriniz");
        String arananHarf = scanner.next().substring(0,1).toLowerCase();
        int sayac = 0;

        for (int i = 0; i < iller.length ; i++) {
            if (iller[i].toLowerCase().contains(arananHarf)){
                sayac++;
            }
        }
        System.out.println("Aradığınız "+arananHarf+" harfi listede toplam "+sayac+" kere var.");

    }
}
