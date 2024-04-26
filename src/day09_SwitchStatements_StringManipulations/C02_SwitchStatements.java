package day09_SwitchStatements_StringManipulations;

import java.util.Scanner;

public class C02_SwitchStatements {
    public static void main(String[] args) {

        //kulanicidan ISTQB kisaltmasindaki harflerden
        // anlamini ogrenmek istedigini ali
        // ve girilen harfin karsiligini yazdirin,
        // I : International  S : Software
        // T : Testing  Q : Qualifications  B : Board


        Scanner scanner = new Scanner(System.in);

        System.out.println("Anlamini ogrenmek istediginiz harfi girtiniz");

        char harf = scanner.next().toUpperCase().charAt(0);

        switch ( harf ) {

            case 'I' :
                System.out.println("International");
                break;

            case 'S' :
                System.out.println("Software");
                break;

            case 'T' :
                System.out.println("Testing");
                break;

            case 'Q' :
                System.out.println("Qualifications");
                break;

            case 'B' :
                System.out.println("Board");
                break;

            default:
                System.out.println("Kisaltmada olan bir harf giriniz...");
        }

    }
}
