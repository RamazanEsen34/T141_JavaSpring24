package day16_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C06_DoWhlieLoop {
    public static void main(String[] args) {

        // Soru 1- Kullanicidan baslangic ve bitis harflerini alip,
        // o harfleri ve aralarindaki harfleri yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen baslangic harfini giriniz...");
        char baslangic = scanner.next().charAt(0);




        System.out.println("Lutfen bitis harfini giriniz...");
        char bitis = scanner.next().charAt(0);






        do {
            System.out.print(baslangic + " ");
            baslangic ++;
        }while (baslangic<=bitis);
    }
}
