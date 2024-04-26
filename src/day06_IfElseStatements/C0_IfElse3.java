package day06_IfElseStatements;

import java.util.Scanner;

public class C0_IfElse3 {
    public static void main(String[] args) {
        // kullannicidan bir sayi isteyin
        // sayi 110 den kucuk ise " teprikler kazandiniz" yazdirin
        // sayi 100 den kucuk degilse
        // "Malesef bu defa olmadi" yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz..");

        double sayi = scanner.nextDouble();

        if (sayi<100){
            System.out.println("tebrikler kazandiniz");

        }else {
            System.out.println("Malesef bu defa olmadi");
        }




            }
}
