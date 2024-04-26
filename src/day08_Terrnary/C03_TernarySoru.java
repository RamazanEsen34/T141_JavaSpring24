package day08_Terrnary;

import java.util.Scanner;

public class C03_TernarySoru {
    public static void main(String[] args) {

        // kullanicidan bir sayi alip,
        // sayiyi kontrol edip 5 ile bolunebiliyor ise "sayi 5'in kati"
        // veya "sayi 5'in kati degil " yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir tam sayi giriniz");

        int sayi = scanner.nextInt();

        System.out.println(sayi%5 == 0 ? "sayi 5'in kati" : "sayi 5'in kati degil ");

    }
}
