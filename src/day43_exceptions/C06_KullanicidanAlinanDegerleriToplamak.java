package day43_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C06_KullanicidanAlinanDegerleriToplamak {
    public static void main(String[] args) {
        // Kullanicidan toplamak uzere sayilar alin
        // kullanici Q veya q girinceye kadar sayi almaya devam edin
        // kullanici Q veya q girdiginde
        // girilen sayi adedini ve sayilarin toplamini yazdirin


        Scanner scanner = new Scanner(System.in);

        double girilenSayi= 0;
        String girilenMetin ="";
        double toplam =0;
        int girilenSayiAdedi =0;

        while (!girilenMetin.equalsIgnoreCase("q")) {


            System.out.println("Lutfen toplanmak uzere sayi giriniz...\nBitirmek icin Q'ya basiniz");

            // kullanici 3 sey yapabilir
            // 1- toplanmak icin sayi girebilir
            // 2- sayi disinda bir giris yapabilir
            //    - eger Q veya q ise islem bitmeli
            //    - eger sayi ,Q veya q degilse uyari verip tekrar deger istemeliyiz


            try {
                girilenSayi = scanner.nextDouble();// eger sayi girildiise exception olusmaz
                                                   // kod calismaya devam eder

                toplam += girilenSayi;
                girilenSayiAdedi ++;

            } catch (InputMismatchException e) {

                // eger InputMismatchException olustuysa , sayi girilmemis demektir
                // bu durumda girisi Metin olarak kaydedip

                girilenMetin = scanner.nextLine();

                //

                if (girilenMetin.equalsIgnoreCase("q")){
                    System.out.println(girilenSayiAdedi+" adet sayi girdiniz, bunlarin toplami :"+toplam);
                }else {
                    System.out.println("Yanlis giriz yaptiniz");
                }

            }


        }
    }
}
