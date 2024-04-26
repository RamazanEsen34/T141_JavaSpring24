package day10_StringManipulations;

import java.util.Scanner;

public class C06_indexOf {
    public static void main(String[] args) {

        String str = "Ali topu at, at Ali at";

        // indexOf () parametre olarak hem String hem de char kabul eder
        System.out.println(str.indexOf("t"));// 4 ==> ilk buldugu t yi alir ve indexini verir
        System.out.println(str.indexOf('t')); // 4 ==> char olarak ayni indexi verir

        System.out.println(str.indexOf("Ali"));// 0 ==>> A'nin basladigi indexi alir

        System.out.println(str.indexOf("pu at"));// 6

       System.out.println(str.indexOf(' '));// 3 ==> arada space var , onun indexini verir

       System.out.println(str.indexOf("t", 7));//10 ==> 7. index ve sonrasindaki ilk t'nin indexini verir
                                               // indexOf(str, fromIndex ) kalibi kullanilarak yaptik
       System.out.println(str.indexOf("at", 7));// 9 ==> string olarak

       // kullanicidan bir metin isteyip
       // girilen metindeki 2. a'nin indexini yazdirin

       Scanner scanner = new Scanner(System.in);

       System.out.println("Lutfen bir metin giriniz...");

       String metin = scanner.nextLine();

        // Java ile ders su gibi akiyor...

        int ilkIndex = metin.indexOf("a"); // 1
        System.out.println(metin.indexOf("a",ilkIndex+1));// 3

    }
}
