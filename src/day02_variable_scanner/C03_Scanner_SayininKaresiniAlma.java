package day02_variable_scanner;

import java.util.Scanner;

public class C03_Scanner_SayininKaresiniAlma {
    public static void main(String[] args) {

        // kullanicidan bir tam sayi isteyip sayinin karesini yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz...");

        int girilenSayi = scanner.nextInt();

        System.out.println("Girilen sayinin karesi:"+ girilenSayi*girilenSayi);

    }
}
