package day04_wrapperClasses_Increment;

import java.util.Scanner;

public class C03_RakamlarToplaminiBulma {
    public static void main(String[] args) {

        // kullaicidan 3 rakamli bir sayi alip
        // rakamlar toplamini bulun

        Scanner  scanner = new Scanner(System.in);

        System.out.println("Lutfen 3 basamakli pozitif bir tam sayi giriniz");
        int girilensayi = scanner.nextInt();

        int sayi = girilensayi;
        int birlerbasamagi = 0;
        int rakamToplami = 0;

        birlerbasamagi = sayi%10;
        rakamToplami = rakamToplami+birlerbasamagi;
        sayi = sayi/10;

        birlerbasamagi = sayi%10;
        rakamToplami = rakamToplami+birlerbasamagi;
        sayi = sayi/10;


        rakamToplami = rakamToplami+sayi;

        System.out.println("Girilen "+ girilensayi + " sayisinin rakamlar toplami : "+ rakamToplami);



    }
}
