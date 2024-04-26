package day06_IfElseStatements;

import java.util.Scanner;

public class Calisma2 {
    public static void main(String[] args) {


        // Kullanıcıdan sayıyı al
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen iki basamaklı bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        // Birler ve onlar basamağını ayır
        int birler = sayi % 10;
        int onlar = sayi / 10;

        // Birler ve onlar basamağını yazıya dönüştür
        String birlerYazi = "";
        String onlarYazi = "";

        switch (onlar) {
            case 1:
                onlarYazi = "on";
                break;
            case 2:
                onlarYazi = "yirmi";
                break;
            case 3:
                onlarYazi = "otuz";
                break;
            case 4:
                onlarYazi = "kırk";
                break;
            case 5:
                onlarYazi = "elli";
                break;
            case 6:
                onlarYazi = "altmış";
                break;
            case 7:
                onlarYazi = "yetmiş";
                break;
            case 8:
                onlarYazi = "seksen";
                break;
            case 9:
                onlarYazi = "doksan";
                break;
        }

        switch (birler) {
            case 1:
                birlerYazi = "bir";
                break;
            case 2:
                birlerYazi = "iki";
                break;
            case 3:
                birlerYazi = "üç";
                break;
            case 4:
                birlerYazi = "dört";
                break;
            case 5:
                birlerYazi = "beş";
                break;
            case 6:
                birlerYazi = "altı";
                break;
            case 7:
                birlerYazi = "yedi";
                break;
            case 8:
                birlerYazi = "sekiz";
                break;
            case 9:
                birlerYazi = "dokuz";
                break;
        }

        // Sayıyı yazıya dönüştür ve ekrana yazdır
        System.out.println(onlarYazi + " " + birlerYazi);
    }
}