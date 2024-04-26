package day08_Terrnary;

import java.util.Scanner;

public class C04_TernarySoru {
    public static void main(String[] args) {

        // kullanicidan bir ucgenin kenar uzunluklarini alin
        // ucgen eskenar ise "Eskenar ucgen" yazdirin
        // degilse "Eskenar ucgen degil " yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen ucgenin kenar uzunluklarini giriniz..");

        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();

        System.out.println(kenar1==kenar2 && kenar1==kenar3 && kenar1>0 ? "Eskenar ucgen" :"Eskenar ucgen degil" );

    }
}
