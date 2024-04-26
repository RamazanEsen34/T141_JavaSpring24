package day06_IfElseStatements;

import java.util.Scanner;

public class C07_IfElseStatements {
    public static void main(String[] args) {
        // Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        // ucgen eskenar ise " Eskenar Ucgen " yazdirin,
        // degilse "Eskenar Ucgen Degil" yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen ucgenin kenar uzunluklarini giriniz :");

        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();

        if (kenar1==kenar2 && kenar1==kenar3 && kenar1>0){
            System.out.println("Eskenar Ucgen");


        }else {
            System.out.println("Eskenar Ucgen Degil");
        }

    }
}
