package day03_scanner_dataCasting;

import java.util.Scanner;

public class C09_DataCastingSoru {
    public static void main(String[] args) {

        int sayi1 =20;
        int sayi2 =3;
        System.out.println(sayi1/sayi2);// sonuc 6

        double sayi3 = 3;
        System.out.println(sayi1/sayi3);// sonuc 6.6666666667

        // kullanicidan iki tam sayi alip,
        // sonucu ondalikli olarak yazdirin

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lutfen 2 tam sayi giriniz :");

        sayi1 = scanner.nextInt();
        sayi2 = scanner.nextInt();

        double sonuc = (double) sayi1/sayi2;
        System.out.println("Verilen sayilarin bolumu :"+sonuc);

    }
}
