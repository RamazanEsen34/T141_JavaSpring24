package day07_IfElseIfStatements_nestedIfElseStatements;

import java.util.Scanner;

public class C03_NotYazdirma {
    public static void main(String[] args) {
        // Kullanicidan 100 uzerinden notunu alin
        // negatif veya 100 den buyuk deger girerse "Gecersiz not",
        // 85 ile 100 arasinda ise ( sinirlar dahil) AA,
        // 65 (dahil) buyuk ve 85 den kucuk ise BB,
        // 50(dahil) buyuk ve 65 den kucuk ise CC,
        // 50 den kucuk ise DD Kaldin yazdirin

        /*
          if
          else if
          else if
          ....
          else  seklinde yazilan bir kod icin
          -sonu else ile bittiginden bir sonuc yazdirmama ihtimali YOKTUR
          -ELSE İF...ile butun if'ler birbirine baglandıgından
          ayni anda iki if bofy'sinin devreye girme ihtimali de YOKTUR

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");

        double girilennot = scanner.nextDouble();

        if (girilennot<0 || girilennot>100){
            System.out.println("Gecersiz not");
        }else  if (girilennot>=85){
            System.out.println("AA");
        } else if (girilennot>=65){
            System.out.println("BB");

        }else if (girilennot>=50){
            System.out.println("CC");

        } else  {
            System.out.println("DD Kaldin");

        }


    }
}
