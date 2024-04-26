package day09_SwitchStatements_StringManipulations;

public class C12_substring {
    public static void main(String[] args) {

        /*
           Sadece bu metgod icin degil , Java'nin genelinde
           baslangic indexleri inclusive(dahil)
           bitis indexleri exclusive(harici) dir.
         */
        String str ="Java guzeldir";

        System.out.println(str.substring(5, 8)); //guz==> 5. indeksi alir , 8. indeksi almaz

        // 5. index dahil basla , 8. index haric olarak aradaki karakterler
        // yada
        // 5.index den basla (8-5) adet karakter yaz==> guz


        // bastan baslayip, sondan 4 karakter haric yazdirin

        System.out.println(str.substring(0, str.length() - 4)); // Java guze

        // bitis indexi baslangic indexinden kucuk olursa
       // System.out.println(str.substring(6,4));// StringIndexOutOfBoundsException


         // baslangic ve bitis indexi ayni olursa
        System.out.println(str.substring(5,5));// hiclik


        // eger baslangic ve bitis indexleri arasinda bir fark olursa
        // baslangic indexindeki karakteri verir
        // yani charAt() ile ayni islevi yapar
        System.out.println(str.substring(0,1));// J
        System.out.println(str.substring(3,4));// a

        // aralarinda ki fark , charAt() bize char dondurdugunden
        //sonrasinda String methodlari kullanamayiz
        //...
        // str.charAt(3).toUpperCase();
        //


    }
}
