package day06_IfElseStatements;

import java.util.Scanner;

public class C01_IfStatements {
    public static void main(String[] args) {
        /*
           Bagimsiz if cumleleri kodun geriye kalani ile ilgilenmez
           SADECE if parantezindeki boolean  sarta odaklanir
           boolean sart ==> true ise if body'si calisir
           boolean sart ==> false  ise if body'si calismaz

           birden fazla bagimsiz if cumlesi kullanildiginda
           girilen degere bagli olarak
           tum if body'leri devreye girebilecegi gibi
           hicbir if body'si devreye girmeyebilir de


         */

        // kullanicidan 2 tam sayi alin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen iki tam sayi giriniz");

        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();


        // 1.sayi, 2. sayidan buyukse aferin yazdirin

        if (sayi1>sayi2){
            System.out.println("Aferin");
        }

        // 1.sayi cift ise cift sayilari severim yazdirin

        if (sayi1 % 2 ==0){
            System.out.println("Cift sayilari severim");
        }


        // 2. 50 den buyukse buyuk sayilarla isim olmaz yazdirin


        if (sayi2 > 50){
            System.out.println("Buyuk sayilarla isim olmaz");
        }

        // toplamlari 100 den kucuk ise ufak sayilarla isim olmaz yazdirin

        if (sayi1 +sayi2 <100){
            System.out.println("ufak sayilarla isim olmaz");
        }
    }
}
