package day09_SwitchStatements_StringManipulations;

public class C06_equals {
    public static void main(String[] args) {

        String str1 = "Ahmet";
        String str2 = "AHMET";
        String str3 = "ahmet";
        String str4 = "AhMeT";
        String str5 = "Ahmet";
        String str6 = new String("Ahmet");
        String str7 = "Ah";
        String str8 = "met";
        String str9 = str7 + str8 ; // Ahmet

        // String case sensetive dir
        // str1,str2,str3 ve str4 un degerleri birbirinden farklidir
        // str1,str5,str6, ve str9 un degerleri ise aynidir

        // String de karsilastirma icin == kullanirsaniz
        // metni ayni olan String lerde bile FALSE donebilir
        // == hem metin degerine hem de referansa baktigi icin
        // metni ayni olan farkli Stringler icin farkli sonuclar verebilir

        System.out.println(str1 == str5);// true
        System.out.println(str1 == str6); // false
        System.out.println(str1 == "Ahmet"); // true
        System.out.println(str1 == str9); // false

        // Iki Syring in Metin olarak ayni olup olmadigini kontrol etmek icin
        // SIMDILIK == kullanmayacagiz
        // String lerde metin olarak ayni olmayi kontrol icin
        // equals() kullanilir

        // equals () ayni metinler icin true doner

        System.out.println(str1.equals(str5)); // true
        System.out.println(str1.equals(str6)); // true
        System.out.println(str1.equals("Ahmet")); // true
        System.out.println(str1.equals(str9)); // true

        // equals() ayni metin farkli yazilimlari icin

        System.out.println(str1.equals(str2)); // false
        System.out.println(str1.equals(str3)); // false
        System.out.println(str1.equals(str4)); // false

        // eger buyuk kucuk harf farkli yazilimlari da esit kabul edelim derseniz

        System.out.println(str1.equalsIgnoreCase(str2)); // true
        System.out.println(str1.equalsIgnoreCase(str3)); // true
        System.out.println(str1.equalsIgnoreCase(str4)); // true




    }
}
