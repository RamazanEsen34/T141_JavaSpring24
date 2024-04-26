package day11_stringManipulations;

import java.util.Scanner;

public class C05_Replace {
    public static void main(String[] args) {

        String str = "Java candir";

        System.out.println(str.replace('a', 'A'));// JAvA cAndir

        System.out.println(str.replace("candir", "guzeldir"));// Java guzeldir

        // a'lari yok edin
        System.out.println(str.replace("a",""));// Jv cndir

        // b'leri B yapin
        System.out.println(str.replace('b','B'));// Java candir ==> b olmadigi icin ddegisiklik olmaz

        // Can yerine Han yapin
        System.out.println(str.replace("CAn","Han"));// Java candir ==> Java case sensetive oldugu icin
                                                     // buyuk kucuk harf duyarliligi vardir bu yuzden degisiklik olmaz

        // sadece ilk a'yi A yapin
        System.out.println(str.replaceFirst("a", "A"));// JAva candir

        // kullanicidan bir metin isteyin ve metinde gecen ilk space'i  * yapin

        Scanner scanner = new Scanner(System.in);
       // System.out.println("Lutfen bir cumle giriniz...");
       // String cumle = scanner.nextLine();

       // System.out.println(cumle.replaceFirst("\\s", "*"));

        // kullanicidan bir metin isteyin ve metinde varsa  ilk rakami  * yapin


        System.out.println("Lutfen bir cumle giriniz...");
        String cumle1 = scanner.nextLine();

        System.out.println(cumle1.replaceFirst("\\d", "*"));//Java da hersey 10 numara
                                                            // Java da hersey *0 numara


    }
}
