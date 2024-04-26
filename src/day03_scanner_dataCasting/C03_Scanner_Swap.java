package day03_scanner_dataCasting;

import java.util.Scanner;

public class C03_Scanner_Swap {
    public static void main(String[] args) {

        // kullanicidan iki sayi alin,
        // ikisinin degerini degistirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen ilk tam sayiyi giriniz...");

        int Ilksayi= scanner.nextInt();

        System.out.println("Lutfen Ikinci tam sayiyi giriniz...");

        int Ikincisayi= scanner.nextInt();

        // diyelim ki ilk sayi 10, ikinci sayi 20 olsun
        // ilk sayi 20, ikinci sayi 10 olacak

        int temp = 0;
        temp = Ikincisayi;
        Ikincisayi = Ilksayi;
        Ilksayi = temp;
        System.out.println("Girdiginiz sayilarin değerini degistirdim");
        System.out.println("Ilk sayinin yeni degeri :"+Ilksayi);
        System.out.println("Ikinci sayinin yeni degeri :"+Ikincisayi);

        }


    }


