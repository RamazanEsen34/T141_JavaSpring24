package day02_variable_scanner;

public class C01_PrimitiveDataTurleri {

    public static void main(String[] args) {

        char chr1 = '0' ;
        char chr2 = '1' ;
        char chr3 = '3' ;
        char chr4 = ' ' ;

        byte byt = 10 ; // bu hafıza da 8  bit yer kapliyor
        short sh = 10 ; // bu hafıza da 16 bit yer kapliyor
        int sayi = 10 ; // bu hafıza da 32 bit yer kapliyor
        long lng = 10 ; // bu hafıza da 64 bit yer kapliyor


        float flt1= 234123123454332f ;
        float flt2 = 234F ; // Float sayi göstermek için sonuna büyük yada küçük f harfi göstermek zorundayiz.
        float flt3 = 23.678F ;

        double dbl1 = 3.1423456123423345 ;

        /*
           1- boolen ==> true- false
           2- char ==> tek bir karakter 'a' tek tırnak içerisinde kullanilir
           3-byte,short,int,long ==> tam sayi barindirir
           4-float,double ==> ondalikli sayi barindirir.

           primitive data turleri sadece deger barindirir.
           non-primitive data turleri ise deger ve hazir methodlari barindirirlar
         */

        String str = " Java Candir" ;

        System.out.println(str.toUpperCase());// JAVA CANDİR

        System.out.println(str.toLowerCase());//java candir

        int not = 10;
        int Not = 20;
        // int not =30; // Variable 'not' is already defined in the scope
        int NOt = 40;

        System.out.println(Not);// 20

        String isim1$_ = "Eghbal";
        // String 1isim = "Ali" ; variable isimlerisayi ile baslayamaz
        String $isim = "Seher "; // isimlerin $ veya _ ile baslamasi onerilmez
        // int int = 20; Javada tanimli keywordler isim olarak kullanilmaz

        char isminIlkHarfi = 'a';// camel case seklinde her kelimenin ilk harfi buyuk yazilir





    }
}
