package day02_variable_scanner;

import java.util.Scanner;

public class C06_Scanner_CemberinCevresiVeAlani {
    public static void main(String[] args) {
        //Kullanicidan bir cemberin yaricapini alip, cevresini ve alanini yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Cemberin yarıcapini giriniz...");

        double yaricap = scanner.nextDouble();

        System.out.println("Cemberin cevresi :"+2*3.14*yaricap );

        System.out.println("Cemberin alani :"+3.14*yaricap*yaricap);


    }
}
