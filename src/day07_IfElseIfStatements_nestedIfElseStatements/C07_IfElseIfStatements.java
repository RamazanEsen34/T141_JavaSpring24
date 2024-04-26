package day07_IfElseIfStatements_nestedIfElseStatements;

import java.util.Scanner;

public class C07_IfElseIfStatements {
    public static void main(String[] args) {

        /*
          Bize verilen gorevde ki siralama farkli olsa da
          if, else-if ... cumlelerinin bir elek gibi calistigini unutmamaliyiz
          en cok data arayan if cumlesi en basa yazmaliyiz
         */
        // kullanicidan bir tam sayiisteyin
        // sayi 7 ile tam bolunuyor ise " 7!nin kati",
        // sayi 5 ile bolunuyor ise " 5!in kati",
        // her ikisine de bolunuyor ise " super sayi",
        // ikisine de bolunemiyor ise " kotu sayi" yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir pozityif bir tam sayi giriniz");

        int sayi = scanner.nextInt();

        if ( sayi % 7== 0 && sayi % 5 == 0) {
            System.out.println(" Super sayi");
        }else if ( sayi % 5== 0){
            System.out.println(" 5'in kati");
        } else if ( sayi% 7 == 0 ) {
            System.out.println("7'nin kati");

        } else  {
            System.out.println("kotu sayi");

        }
    }
}
