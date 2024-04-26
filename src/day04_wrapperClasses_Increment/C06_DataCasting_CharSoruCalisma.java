package day04_wrapperClasses_Increment;

import java.util.Scanner;

public class C06_DataCasting_CharSoruCalisma {
    public static void main(String[] args) {

        // Kullanicidan bir harf alin ve alfabede o harften sonraki 3 harfi yazdirin.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir karakter giriniz...");

        char girilenkarakter = scan.next().charAt(0);

        System.out.println("Girdigimiz karakterden bir sonraki karakter :"+ (char)(girilenkarakter+1));
        System.out.println("Girdigimiz karakterden iki sonraki karakter :"+ (char)(girilenkarakter+2));
        System.out.println("Girdigimiz karakterden uc sonraki karakter :"+ (char)(girilenkarakter+3));
    }
}
