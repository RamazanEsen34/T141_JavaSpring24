package day06_IfElseStatements;

import java.util.Scanner;

public class C0_IfStatementsBuyukKucukHarf {
    public static void main(String[] args) {

        // kullanıcıdan kucuk harf alıp "kucuk harf ",
        // buyuk harf alıp "buyuk harf " yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz");
        char harf = scanner.next().charAt(0);
        if (Character.isLowerCase(harf)) {
            System.out.println("Kucuk");
        }
        if (Character.isUpperCase(harf)){
            System.out.println("Buyuk");
        }
    }
}
