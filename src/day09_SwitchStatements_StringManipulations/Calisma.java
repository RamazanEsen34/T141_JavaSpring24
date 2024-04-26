package day09_SwitchStatements_StringManipulations;

import java.util.Scanner;

public class Calisma {
    public static void main(String[] args) {

        //kulanicidan ISTQB kisaltmasindaki harflerden
        // anlamini ogrenmek istedigini ali
        // ve girilen harfin karsiligini yazdirin,
        // I : International  S : Software
        // T : Testing  Q : Qualifications  B : Board

        Scanner scanner =new Scanner(System.in);
        System.out.println("Lütfen anlamını öğrenmek istediğiniz harfi giriniz...");

        char harf = scanner.next().toUpperCase().charAt(0);


        switch (harf){

            case 'I':
                System.out.println("International");
                break;
            case 'S' :
                System.out.println("Software");
            case 'T':
                System.out.println("Testing");
                break;
            case 'Q':
                System.out.println("Qualfications");
                break;
            case 'B':
                System.out.println("Board");
                break;
            default:
                System.out.println("Lütfen kısaltmada olan bir harf giriniz");

        }


















    }
}