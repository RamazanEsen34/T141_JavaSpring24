package day06_IfElseStatements;

import java.util.Scanner;

public class C0_IfElse2 {
    public static void main(String[] args) {
        //Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        // yoksa girilen karakteri girildigi gibi yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir harf girin");

        char harf = scanner.nextLine().charAt(0);

        //if (harf>='a' && harf<='z'){
        //    System.out.println(Character.toUpperCase(harf));
        //  }else {
        //    System.out.println(harf);

        if ( Character.isLowerCase(harf)){
            System.out.println(Character.toUpperCase(harf));
        }else {
            System.out.println(harf);
        }
    }
}
