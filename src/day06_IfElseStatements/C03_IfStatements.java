package day06_IfElseStatements;

import java.util.Scanner;

public class C03_IfStatements {
    public static void main(String[] args) {
        // kullanicidan bir sayi isteyin
        // sayiyi kontrol edip 5 ile bolunebiliyorsa
        // "sayi 5'in tam kati " yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz :");

        int sayi = scanner.nextInt();

        if (sayi % 5 == 0){
            System.out.println("Sayi 5'in tam kati");
        }

    }
}
