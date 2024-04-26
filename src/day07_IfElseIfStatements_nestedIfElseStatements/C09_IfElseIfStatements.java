package day07_IfElseIfStatements_nestedIfElseStatements;

import java.util.Scanner;

public class C09_IfElseIfStatements {
    public static void main(String[] args) {
        //Kullanicidan cinsiyetini ve yasini alin, Kadin,
        // 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        // veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz K: Kadin, E: Erkek");

        char cinsiyet = scanner.next().toUpperCase().charAt(0);

        System.out.println("Lutfen yasinizi giriniz");
        double yas = scanner.nextDouble();

        if (cinsiyet=='K' && yas>= 60){
            System.out.println("Kadin emekli olabilir");
        } else if (cinsiyet =='K' && yas < 60) {
            System.out.println("Emekli olmak icin daha" + (60-yas) + " yil calismalisin");

        } else if (cinsiyet == 'E' && yas>= 65) {
            System.out.println("Erkek emekli olabilir");

        } else if (cinsiyet =='E' && yas<65) {
            System.out.println("Emekli olmak icin daha " + (65-yas) +"yil calismalisiniz");

        }else {
            System.out.println("Girdiginiz bilgiler yankis");
        }
    }
}
