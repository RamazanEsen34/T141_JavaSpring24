package day08_Terrnary;

import java.util.Scanner;

public class C05_TernarySoru  {
    public static void main(String[] args) {
        // Kullanicidan iki sayi alin
        // ve buyuk olmayani yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen iki tam sayi giriniz");

        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();

        System.out.println(sayi1>sayi2 ? "sayi2" :"sayi1");
        System.out.println(sayi1>sayi2 ?"" + sayi2 :sayi1);
    }
}
