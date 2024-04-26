package day07_IfElseIfStatements_nestedIfElseStatements;

import java.util.Scanner;

public class C11_NestedIfElseStatements {
    public static void main(String[] args) {
        /*
           if else ile yazdigimiz kodlarda karar vermek icin
           degerlendirdigimiz degiskenler birden fazla ise
           daha kısa degil ama daha anlasilir bir kod yazmak istersek
           -once degiskenlerden birini ana degisken kabul edip
           o degiskene gore if else if yapisi olusturun

         */

        //Kullanicidan cinsiyetini ve yasini alin, Kadin,
        // 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        // veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz K: Kadin, E: Erkek");

        char cinsiyet = scanner.next().toUpperCase().charAt(0);

        System.out.println("Lutfen yasinizi giriniz");
        double yas = scanner.nextDouble();

        // ana degisken cinsiyet olsun

        if (cinsiyet== 'E'){  // sqadece erkekler

            if (yas<20 || yas>80) System.out.println("Gecersiz yas");
            else if (yas>= 65) System.out.println("Erkek emekli olabilir");
            else System.out.println("Emekli olmak icin daha " + (65-yas)+ "yil calismalidir.");


        } else if (cinsiyet=='K') { // sadece kadinlar

            if (yas<20 || yas>80) System.out.println("Gecersiz yas");
            else if (yas>= 60) System.out.println("Kadin emekli olabilir");
            else System.out.println("Emekli olmak icin daha " + (60-yas)+ "yil calismalidir.");

        }else {
            System.out.println("Cinsiyet icin K veya E girmelisiniz");
        }
    }
}
