package day43_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C04_TekTry2CatchBlogu {
    public static void main(String[] args) {


        String str = "Java gun gectikce guzellesir";

        // kullanicidan pozitif bir tam sayi aliniz
        // ve bu tam sayiyi index olarak kabul edip
        // str'da o indextedi harfi yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen pozitif bir tam sayi giriniz...");


        try {
            int index = scanner.nextInt();

            System.out.println(str.charAt(index));
        } catch (InputMismatchException e) {

            System.out.println("Pozitif tamsayi girmelisiniz...");
        } catch (StringIndexOutOfBoundsException e) {

            System.out.println("Girdiginiz sayi metnin sinirlari disinda");
        }


    }

}