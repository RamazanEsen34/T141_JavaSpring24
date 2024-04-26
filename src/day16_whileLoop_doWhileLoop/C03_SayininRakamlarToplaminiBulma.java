package day16_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C03_SayininRakamlarToplaminiBulma {
    public static void main(String[] args) {
        //Soru 2- While loop kullanarak kullanicidan alinan
        // sayinin rakamlar toplamini bulun.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen rakamlari toplanacak tam sayi giriniz...");
        int sayi = scanner.nextInt();

        // 1721

        int enSondakirakam = 0;
        int rakamlarToplami = 0;
        int verilenSayi = sayi;

        while (verilenSayi > 0){

            enSondakirakam = verilenSayi% 10;
            rakamlarToplami += enSondakirakam;
            verilenSayi /= 10;
        }
        System.out.println("Verilen  "+ sayi+ " sayisinin rakamlar toplami :"+rakamlarToplami);
    }
}
