package day09_SwitchStatements_StringManipulations;

import java.util.Locale;

public class C05_StringManipulation_toUpperCase_toLowerCase {
    public static void main(String[] args) {

        String str = "Java Candir";

        // str i buyuk harfile yazdirin

        System.out.println(str.toUpperCase());// JAVA CANDİR

        // str i kucuk harf ile yazdirin

        System.out.println(str.toLowerCase());// java candir

        // String methodlari kullanildiginda orjinal metin degismez
        // Degisikligi kalici olarak yapmak istersek ATAMA yapmaliyiz

        System.out.println(str); // Java Candir

        str = str.toUpperCase();
        System.out.println(str); //JAVA CANDİR

        // str i kucuk harfe cevirin
        // ancak I harfi kucuk harfe cevrildiginde i olur

        System.out.println(str.toLowerCase()); // java candir

        // eger metinde ingilizcede olmayan I yi
        // Turkce kucuk ı ya cevirmek istersek
        // toLowerCase(Locale...) kullanilabilir

        str.toLowerCase(Locale.forLanguageTag("TR"));// java candır ( ingilizce klavye kullanildiginda)


    }
}
