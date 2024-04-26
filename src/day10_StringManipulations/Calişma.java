package day10_StringManipulations;

import java.util.Scanner;

public class Calişma {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin   giriniz...");
        String metin = scanner.nextLine();


        int ilkIndexOf = metin.indexOf("b");
        System.out.println(metin.indexOf("b",ilkIndexOf+1));



    }
}
