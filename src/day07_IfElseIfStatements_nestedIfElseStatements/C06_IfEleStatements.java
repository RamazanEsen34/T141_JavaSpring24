package day07_IfElseIfStatements_nestedIfElseStatements;

import java.util.Scanner;

public class C06_IfEleStatements {
    public static void main(String[] args) {
        /*
          Verilen gorev sonucunda yazdigimiz kod
          else ( geriye kalanlar)ile bitmeyebilir

          EGER
          if, else-if ,.... cumleleri else ile bitmiyorsa
          bazi degerler icin hic bir if body'sinin calismayacagini
          goz onunde bulundurmaliyiz
         */
        // kullanicdan bir sayi alin
        // sayi 0'dan kucukse "negatif sayi" yazdirin
        // negatif olmayan sayilardan
        // tek basamakli olanlar icin "Rakam",
        // iki basamakli sayilar icin "Sayi",
        // uc basamakli sayilar icin "Buyuk sayi" yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz...");
        int girilensayi = scanner.nextInt();

        if ( girilensayi < 0) System.out.println("Nrgatif sayi");
        else if ( girilensayi <10) System.out.println("Rakam");
        else if ( girilensayi<100) System.out.println("Sayi");
        else if ( girilensayi<1000) System.out.println("Buyuk sayi");
    }
}
