package day43_exceptions;

import java.util.Scanner;

public class C05_DahaKapsamliTekException {
    public static void main(String[] args) {


        String str ="Java gun gectikce guzellesir";

        // kullanicidan pozitif bir tam sayi aliniz
        // ve bu tam sayiyi index olarak kabul edip
        // str'da o indextedi harfi yazdirin

        Scanner scanner= new Scanner(System.in);

        System.out.println("Lutfen pozitif bir tam sayi giriniz...");

        try {
            int index = scanner.nextInt();//RuntimeException

            System.out.println(str.charAt(index));//StringIndexOutOfBoundsException
        } catch (Exception e) {// RuntimeException da olur
            // Exception ve RunTimeException daha kapsamli olduklarindan
            // hem RuntimeException'i hem de StringIndexOutOfBoundsException'i yakalr
            // ama sorunun hangisinden kaynaklandigini bilemeyiz

            System.out.println("girilen deger sonuc yazdirmaya uygun degil");

        }


    }
}
