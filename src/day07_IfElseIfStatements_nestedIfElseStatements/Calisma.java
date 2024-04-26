package day07_IfElseIfStatements_nestedIfElseStatements;

import java.util.Scanner;

public class Calisma {
    public static void main(String[] args) {
    /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen notunuzu giriniz...");
        double not= scanner.nextDouble();
        if (not<0 || not>100){
            System.out.println("Yanlis not girdiniz");
        } else if (not>= 85 && not<=100) {

            System.out.println("Notunuz AA");
        } else if (not>= 65) {
            System.out.println("notunuz BB");
        } else if (not>= 50) {
            System.out.println("Notunuz CC");
        }else {
            System.out.println("Notunuz DD Kaldiniz ");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen Kg olarak kilonuzu giriniz...");

        double kilo = scanner.nextDouble();

        System.out.println("Lutfen Cm olarak boyunuzu giriniz...");
        double boy = scanner.nextDouble();

       double vke = (kilo*10000/(boy*boy));

        System.out.println("vucut kitle endeksiniz :"+ vke);

        if (vke > 30){
            System.out.println("obez");
        } else if (vke> 25) {
            System.out.println("kilolu");
        } else if (vke> 20) {
            System.out.println("normal");
        }else {
            System.out.println("zayif");
        }



        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz...");
        int tamsayi = scanner.nextInt();

         if (tamsayi<0)           System.out.println("negatif sayi");
         else if (tamsayi<10)     System.out.println("rakam");
         else if (tamsayi<100)    System.out.println("sayi");
         else if (tamsayi<1000)   System.out.println("buyuk sayi");



        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen tam sayi giriniz...");
        int sayi = scanner.nextInt();



        if (sayi%7==0 && sayi%5==0) System.out.println("super sayi");
        else if (sayi% 7== 0) System.out.println("7 nin kati");
        else if (sayi%5==0) System.out.println("5 in kati");
        else    System.out.println("kotu sayi");


        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen KM olarak mesafeyi giriniz...");
        double mesafe = scanner.nextDouble();

        System.out.println("mesafeyi cevirmek istediginiz birimi giriniz...");
        String cevrilecekbirim= scanner.next();

        if (cevrilecekbirim.equalsIgnoreCase("metre")){
            System.out.println("Girilen mesafe metre olarak "+mesafe*1000+"metredir");
        } else if (cevrilecekbirim.equalsIgnoreCase("santimetre")) {
            System.out.println("girilen mesafe santimetre olarak "+ mesafe*100000+"santimetredir");
        }else {
            System.out.println("istediginiz birim sisteme kayitli degil");
        }


    }
}
