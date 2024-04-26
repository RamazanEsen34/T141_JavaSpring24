package day06_IfElseStatements;

import java.util.Scanner;

public class C0_IfElse {
    public static void main(String[] args) {
        //Kullanicidan yasini isteyin, 65 yas ve uzeri ise ”Emekli olabilirsin” yazdirin,
        // yoksa emekli olmasi icin calismasi gereken yil sayisini yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");

        int yas = scanner.nextInt();

        if ( yas>= 65 ){
            System.out.println("Emekli olabilirsiniz");
        }else {
            System.out.println("emekli olmaniza : " + (65-yas) + " yil var");
        }
    }
}
