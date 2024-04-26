package day11_stringManipulations;

import java.util.Scanner;

public class Calisma {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz...");
        String cumle= scanner.nextLine();

        System.out.println("Lütfen cümlede aradığınız metni giriniz...");
        String metin = scanner.nextLine();

        int ilkIndexOf = cumle.indexOf(metin);
        int lastIndexOf = cumle.lastIndexOf(metin);

        if (ilkIndexOf==-1){
            System.out.println("aradığınız metin cümlede yok");
        } else if (ilkIndexOf==lastIndexOf) {
            System.out.println("aradıgınız metin bir defa kullanılmış");
        }else {
            System.out.println("aradığınız metin birden fazla kullanılmış");
        }


    }
}
