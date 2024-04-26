package day08_Terrnary;

import java.util.Scanner;

public class C06_TernarySoru {
    public static void main(String[] args) {
        // kullanicidan bir sayi alin
        // ve mutlak degerini yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bie sayi giriniz");

        double sayi = scanner.nextDouble();

        sayi = 0+sayi;

        System.out.println(sayi);

    }

}
