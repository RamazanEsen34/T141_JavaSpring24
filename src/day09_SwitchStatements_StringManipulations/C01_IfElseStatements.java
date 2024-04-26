package day09_SwitchStatements_StringManipulations;

import java.util.Scanner;

public class C01_IfElseStatements {
    public static void main(String[] args) {
        //kulanicidan ISTQB kisaltmasindaki harflerden
        // anlamini ogrenmek istedigini ali
        // ve girilen harfin karsiligini yazdirin,
        // I : International  S : Software
        // T : Testing  Q : Qualifications  B : Board


        Scanner scanner = new Scanner(System.in);

        System.out.println("Anlamini ogrenmek istediginiz harfi girtiniz");

        char harf = scanner.next().toUpperCase().charAt(0);

        if (harf == 'I'){
            System.out.println("International");
        } else if (harf == 'S') {
            System.out.println("Software");

        } else if (harf == 'T') {
            System.out.println("Testing");
        } else if (harf == 'Q') {
            System.out.println("Qualifications");
        } else if (harf =='B') {
            System.out.println("Board");
        }else {
            System.out.println("Lisaltmada olan barflerden birini tercih edin");
        }

        switch (harf) {
            case 'I':
                System.out.println("I:International");
                break;
            case 'S':
                System.out.println("S : Software");
                break;
            case 'T':
                System.out.println("T : Testing");
                break;
            case 'Q':
                System.out.println("Q : Qualifications");
                break;
            case 'B':
                System.out.println("B: Board");
                break;
            default:
        }        System.out.println("Geçerli bir harf giriniz");
    }
}

