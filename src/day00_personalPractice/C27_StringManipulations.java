package day00_personalPractice;

public class C27_StringManipulations {
    public static void main(String[] args) {

        /*
        Soru 3 : Kullanicidan alinan metindeki istenmeyen rakam ve ozel karakterleri silip,
                 sadece ilk harfi buyuk diger harfler kucuk harf yapan bir program yazin.
                    input : java1 ogRe2@nMek3 #ne +Gu=zel
                    output : Java ogrenmek ne guzel.
         */

        String input= "java1 ogRe2@nMek3 #ne +Gu=zel";
        String output= input.trim();
        output=output.replaceAll("\\d", "");
        output=output.replaceAll(" ", "5");
        output=output.replaceAll("\\W", "");
        output=output.replaceAll("5", " ");
        output=output.toLowerCase();
        output= output.substring(0,1).toUpperCase() + output.substring(1);
        System.out.println(output);

    }
}
