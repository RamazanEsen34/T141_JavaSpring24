package day43_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_FarkliTryCatchlerIleCozum {
    public static void main(String[] args) {
        /*
            Ayri ayri try catch kullandigimizda
            birinci try-catch de exception yakalandiginda
            ikinci bundan haberdar olmuyor
            bunun icin extra bir flag kullanilabilir
         */

        String str ="Java gun gectikce guzellesir";

        // kullanicidan pozitif bir tam sayi aliniz
        // ve bu tam sayiyi index olarak kabul edip
        // str'da o indextedi harfi yazdirin

        Scanner scanner= new Scanner(System.in);

        System.out.println("Lutfen pozitif bir tam sayi giriniz...");

        int index = 0;//InputMissmatchException
        try {
            index = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Pozitif tamsayi girmelisiniz...");
        }

        try {
            System.out.println(str.charAt(index));//StringIndexOutOfBoundsException
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Girdiginiz index sinirlarin disinda");
        }

    }
}
