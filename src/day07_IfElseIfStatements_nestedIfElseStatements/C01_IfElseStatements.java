package day07_IfElseIfStatements_nestedIfElseStatements;

import java.util.Scanner;

public class C01_IfElseStatements {
    public static void main(String[] args) {
        // kullanicidan bir karakter girmesini iğsyeyin
        // girilrn karekterin buyuk harf olup olmadigini yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz :");

        char karakter = scanner.next().charAt(0);

        if (karakter >='A' && karakter<='Z'){
            System.out.println("Girilen karakter buyuk");
        }else {
            System.out.println("Girilen karakter buyuk degil");
        }
    }
}
