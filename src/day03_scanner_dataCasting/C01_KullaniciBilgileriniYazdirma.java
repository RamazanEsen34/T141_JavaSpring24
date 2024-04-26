package day03_scanner_dataCasting;

import java.util.Scanner;

public class C01_KullaniciBilgileriniYazdirma {
    public static void main(String[] args) {
        // Kullanicidan ismini, soyismini ve yasini alip
        // asagidaki formatta yazdirin
        // girilen bilgiler : J Doe,44

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen isminizi girin");

        char isimIlkHarf = scanner.nextLine().charAt(0);

        System.out.println("Lutfen soyisminizi giriniz");

        String soyisim = scanner.nextLine();

        System.out.println("Yasinizi giriniz");

        int yas = scanner.nextInt();

        System.out.println("Girilen Bilgiler : "+isimIlkHarf+" "+soyisim+","+ yas);
    }
}


