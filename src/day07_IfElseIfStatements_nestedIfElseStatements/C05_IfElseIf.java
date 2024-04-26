package day07_IfElseIfStatements_nestedIfElseStatements;

import java.util.Scanner;
import java.util.SortedMap;

public class C05_IfElseIf {
    public static void main(String[] args) {
        //Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut kitle endeksini hesaplayin (kilo*10000 / (boy *boy))
        // vucut kitle endeksi 30’dan buyukse obez,
        // 25-30 arasi ise kilolu, 20-25 arasi ise normal, 20’den kucukse zayif yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen KG olarak kilonuzu giriniz");
        double kilo = scanner.nextDouble();
        System.out.println("Lutfen CM olrak boyunuzu giriniz");
        double boy = scanner.nextDouble();

        double vke = (kilo*10000/(boy*boy));

        System.out.println("Vucut kitlr endeksiniz :" + vke);

        if (vke>30){
            System.out.println("OBEZ");
        }else if (vke > 25){
            System.out.println("KILOLU");
        }else if ( vke >20){
            System.out.println("NORMAL");
        }else {
            System.out.println("ZAYIFSINIZ");
        }
    }

}
