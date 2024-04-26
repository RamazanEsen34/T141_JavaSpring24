package day07_IfElseIfStatements_nestedIfElseStatements;

import java.util.Scanner;

public class C02_IfElseStatements {
    public static void main(String[] args) {
        // kullanicidan bir harf isteyin,
        // girilen karakterin kucuk harf ise onu buyuk harf olarak yazdirin,
        // yoksa girilen girilen karakteri girildigi gibi yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");

        char girilenharf = scanner.next().charAt(0);

        if (Character.isLowerCase(girilenharf)){
            System.out.println(Character.toUpperCase(girilenharf));
        }else {
            System.out.println(girilenharf);
        }
        //2.Yontem

        if (girilenharf>= 'a' && girilenharf <='z'){
            System.out.println((char) (girilenharf-32));// Ascii tablosunda buyuk harf ile kucuk harf arasinda
                                                        // 32 sayi farki bulunmaktadir
        }else {
            System.out.println(girilenharf);
        }
    }
}
