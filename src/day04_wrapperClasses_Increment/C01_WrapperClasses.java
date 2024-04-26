package day04_wrapperClasses_Increment;

public class C01_WrapperClasses {
    public static void main(String[] args) {

        int sayi = 20;

        String str = "Java Candir";
        // primitive data turleri sadece deger barindirir
        // non primitive data turleri ise hem deger hemde hazir method'lar barindirir

        System.out.println(str.toUpperCase()); //JAVA CANDİR

        // Java primitive data türleri icin de
        // istedigimizde method kullanabilmemize imkan vermek amaciyla
        // Wrapper classları olusturmustur.
        // Boolean. Character. Byte. Short. Integer. Long, Float ve Double

        System.out.println(Integer.MAX_VALUE); //2147483647

        System.out.println(Double.MAX_VALUE);  //1.7976931348623157E308

        String sayi1 = "103";

        String sayi2 = "204";

        // sayi1 ile sayi2 toplayalim

        System.out.println(sayi1+sayi2); //103204

        int sayi1inDegeri = Integer.parseInt(sayi1);

        int sayi2ninDegeri = Integer.valueOf(sayi2); // parseInt ve valueOf aynı sekilde String bir ifadeyi int cevirir

        System.out.println("String olarak verilen 2 sayinin toplami :"+(sayi1inDegeri+sayi2ninDegeri)); // 307

        /////////////////

        String sayi3= "23.56";
        String sayi4 ="45.21";

        System.out.println(Double.parseDouble(sayi3) + (sayi4));


        char chr1 ='7';

        char chr2 ='r';

        char chr3 = '#';

        System.out.println(Character.isLetter(chr1));// false

        System.out.println(Character.isLetter(chr2));// true

        System.out.println(Character.toUpperCase(chr2));//R

        System.out.println(Character.isAlphabetic(chr3));//false



    }
}
