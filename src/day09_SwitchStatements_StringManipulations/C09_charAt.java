package day09_SwitchStatements_StringManipulations;

public class C09_charAt {
    public static void main(String[] args) {

        String str = "Java Candir";
        System.out.println(str.charAt(0)); // J

        // metindekş 2 . harfi buyuk harf olarak yazdirin

        System.out.println(str.toUpperCase().charAt(1));// A

        // sonuncu harfi yazdirin
        // bu yazim dinamik bir kod degildir
        // str degistirilse de bu kod hep 10. index teki harfi yazdiri
        System.out.println(str.charAt(10)); // r

        // sondan 3. harfi yazdirin
        // bu kod dinamik olmaz , sadece 8. index teki harfi verir
        System.out.println(str.charAt(8));// d

        // bir Strindeki karakter sayisina o stringin LENGTH'İ denir
        // length birden baslar, index o'dan baslar
        // ste icin dusunuesek length ==> 11, son karakterin index'i ==> 10 ( length-1)

        // Dinamik kod
        // kullanicidan alinan inputa bagli olmaksizin
        // her zaman kendini dinamik olarak duzenleyip
        // istenen sonucu verebilen koddur

        System.out.println(str.charAt(str.length() - 1));// r

        String str1 = "Java Candir.";
        System.out.println(str1.charAt(str1.length() - 1)); //.
        System.out.println(str1.charAt(str1.length()-3)); // i

        System.out.println("length :" +str1.length()); // length :12

        //>>>System.out.println(str1.charAt(13));//StringIndexOutOfBoundsException<<<

        // Java Compile Time (kodu calistirmadan once) da
        // kullanilan variable'larin degerlerini goremez
        // sadece data turlerini gorur

        // data turleri acisindan kod da bir sorun varsa
        // compile time da bunu fark eder ve altini cizer
        // Compile Time Error (CTE) diyoruz

        // ama degeri goremedigi icin
        // yanlis degerlerin sebep olacagi hatalari
        // Compile Time da faek edemez
        // deger hatalarini calistirmaya basladiktan sonra fark eder
        // bu tur hatalara calismaya basladiktan sonra faek edildigi
        // icin Run Time Error (RTE) denir
    }
}
