package day43_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C01_Exceptions {
    public static void main(String[] args) {
        // kullanicidan iki sayi alin
        // bu iki sayinin birbirine bolumunu yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen iki tam sayi giriniz");


        /*
            Java kodlari calistirirken bir sorunla karsilastiginda
            öncelikle kod yazarinin bu sorunu on gorup
            cozum yolu gosterip gostermedigini kontrol eder
            eger cozum yolu gosterilmis ise o cozumu gerceklestirir(handle eder)ve normal calışmaya devam eder
            eger cozum yolu gosterilmemis ise
            kodun calismasini o satir itibari ile durdurur
            hatanin bulundugu satiri, hatanin cinsini ve sebebini bize rapor eder

            Iyi bir kod yazarinin exception olusma olasiliklarini iyi tespit edip
            java'ya tum olasi exception durumlarinda
            ne yapmasi gerektigini soyler
         */


        int sayi1 = 0;
        int sayi2 = 0;
        boolean hataVarMi =false;

        try {
            sayi1 = scanner.nextInt();
            sayi2 = scanner.nextInt();
        } catch (Exception e) {
            // eger yukarida calistirmak istedigimiz kodlarda
            // sana yazdigim InputMismatchException olusursa
            // o zaman o exceptioni e objesine kaydet
            // ve simdi sana yazacagim kodlari calistir

            System.out.println("sana tamsayi yaz dedik");
            hataVarMi =true;
        }

        if (hataVarMi){

        } else if (sayi2 == 0) {
            System.out.println("bolecek sayi sifir olamaz");


        } else {


            System.out.println("Sayilarin bolum sonucu :" + sayi1 / sayi2);

        }

    }
}