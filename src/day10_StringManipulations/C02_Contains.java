package day10_StringManipulations;

public class C02_Contains {
    public static void main(String[] args) {

        String str ="Ali topu at, at Ali at";

        System.out.println(str.contains("Ali"));// true

        System.out.println(str.contains("at"));// true ( sadece var mi yok mu bakar sayi vermez)

        System.out.println(str.contains("ali"));// false ( kucuk a ile ali yok)

        System.out.println(str.contains("topu Ali"));// false ( oldugu gibi sirali varsa true doner)

        System.out.println(str.contains("topu") && str.contains("Ali")); // true doner ==> veve baglaci ile her iki kelime
                                                                         // ayri ayri arandigi icin sonuc true

        System.out.println(str.contains("topu at"));// true

        System.out.println(str.contains("u a"));// ture

        String aciklama ="The iPhone 13 in Starlight color is a high_performance device witth 128  GB of storage";

        // acilklama da buyuk kucuk harf onemsiz olarak
        // phone iceriyor mu

        System.out.println(aciklama.toLowerCase().contains("phone"));// true==> aciklama tamamen kucuk haefe cevrildigi icin
                                                                     // sonuc true doner




    }
}
