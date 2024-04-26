package day11_stringManipulations;

public class C01_LastIndexOf {
    public static void main(String[] args) {

        String str = "Java cok zevkli";

        // metnin kac karakter oldugunu yazdirin
        System.out.println(str.length()); // 15

        // son karakterini yazdirin
        System.out.println(str.charAt(str.length() - 1));// i

        // str da z harfi kullanilmis mi
        System.out.println(str.contains("z"));// ture

        // str da il k'nin indexini yazdirin
        System.out.println(str.indexOf('k'));// 7

        // str da cok kelimesini yazdirin
        System.out.println(str.indexOf("cok"));//5

        // str da k'nin son kullaniminin indexini yazdirin
        System.out.println(str.lastIndexOf("k"));// 12

        // str da k'nin son kullanimindan bir onceki kullanimini yazdirin
        System.out.println(str.lastIndexOf('k', 11));// 7

        // metinde kullanilan son ' cok' kelimesinin indexini yazdirin
        System.out.println(str.lastIndexOf("cok"));// 5

        // metinde kullanilan ilk x harfini yazdirin
        System.out.println(str.indexOf("x"));// -1

        // str da kullanilan son ww harfinin indexini bulun
        System.out.println(str.lastIndexOf("w"));// -1
    }
}
