package day03_scanner_dataCasting;

import java.util.Scanner;

public class C11_SoruTekrarıİkiSayiYerDegistirme {
    public static void main(String[] args) {
        // kullanicidan iki sayi alin,
        // ikisinin degerini degistirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen 1. sayiyi giriniz...");

        int sayi1 = scanner.nextInt();

        System.out.println("Lutfen 2. sayiyi giriniz...");

        int sayi2 = scanner.nextInt();


        int temp = 0;

         temp = sayi2;
         sayi2 = sayi1;
         sayi1 = temp;

        System.out.println("Girdiginiz sayilarin yerini degistirdim"+"\nSayi1 :"+sayi1+"\nSayi2 :"+sayi2);


    }
}
