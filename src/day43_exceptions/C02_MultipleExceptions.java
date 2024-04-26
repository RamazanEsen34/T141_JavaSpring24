package day43_exceptions;

import java.util.Scanner;

public class C02_MultipleExceptions {
    public static void main(String[] args) {

        /*
        Bu kod'da 2 tane risk var
        -InputMissmatchException olusabilir
        -StringIndexOutOfBoundsException olusabilir

        4 farkli yol ile bunu cozebiliriz
        1-eger risk olusturan kodlar ayri ayri ise
          ayri ayri try catch yapabiliriz

        2-ic ice try catch olusturabiliriz
        3-bir try , 2 catch olusturabiliriz
        4-iki exceptioni kapsayan
        daha kapsamli bir exception ile
        ikisinin yerine tek bir exceptıion ile cozebiliriz

         */

      String str ="Java gun gectikce guzellesir";

      // kullanicidan pozitif bir tam sayi aliniz
        // ve bu tam sayiyi index olarak kabul edip
        // str'da o indextedi harfi yazdirin

        Scanner scanner= new Scanner(System.in);

        System.out.println("Lutfen pozitif bir tam sayi giriniz...");

        int index = scanner.nextInt();//InputMissmatchException

        System.out.println(str.charAt(index));//StringIndexOutOfBoundsException






    }
}
