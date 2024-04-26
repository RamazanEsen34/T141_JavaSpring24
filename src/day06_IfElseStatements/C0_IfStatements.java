package day06_IfElseStatements;

import java.util.Scanner;

public class C0_IfStatements {
    public static void main(String[] args) {
        //Kullanicidan bir sayi alin,
        // sayi 3 ile bolunuyorsa ”Uc ile bolunebilen sayi”,
        // 5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz");

        int girilensayi = scanner.nextInt();



        if ( girilensayi % 3 == 0){
            System.out.println("Uc ile bolunebilen sayi");
        }
        if ( girilensayi % 5 == 0){
            System.out.println("Bes ile bolunebilen sayi");
        }
    }
}
