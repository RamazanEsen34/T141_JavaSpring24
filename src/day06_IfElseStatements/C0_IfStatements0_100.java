package day06_IfElseStatements;

import java.util.Scanner;

public class C0_IfStatements0_100 {
    public static void main(String[] args) {

        // kullanicidan notunu isteyin
        // kullanici 0 ile 100 arasi olmayan bir not girerse
        // gecersiz not yazin
        // 0 il100 arasinda ( sinirlardahil) bir not girerse
        // gecerli not yazin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz...");
        double girilennot = scanner.nextDouble();

        if (girilennot >=0 && girilennot<=100){
            System.out.println("gecerli not");
        }
        if (girilennot <0 || girilennot >100){
            System.out.println("gecersiz not");
        }
    }
}
