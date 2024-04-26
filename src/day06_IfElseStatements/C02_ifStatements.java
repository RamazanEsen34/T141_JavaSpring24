package day06_IfElseStatements;

import java.util.Scanner;

public class C02_ifStatements {
    public static void main(String[] args) {

        // kullanicidan 2 sayi alin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz :");

        double sayi1 = scanner.nextDouble();
        double sayi2 = scanner.nextDouble();


        // 1.sayi 2. sayidan buyukse "buyuksun sayi1" yazdirin
        boolean sonuc = sayi1>sayi2;

        if (sonuc){
            System.out.println("Buyuksun sayi1");
        }
        // 2. sayi sifirdan buyukse "buyuksun sayi2" yazdirin
        sonuc = sayi2>0;

        if (sonuc){
            System.out.println("Buyuksun sayi2");
        }
        // iki sayinin toplami 100 den buyukse "ikinizde buyuksunuz" yazdirin
        sonuc = sayi1+ sayi2 > 100;

        if (sonuc){
            System.out.println("Ikinizde buyuksunuz");
        }

    }
}
