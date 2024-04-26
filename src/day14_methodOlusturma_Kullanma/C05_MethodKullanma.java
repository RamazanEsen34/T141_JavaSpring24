package day14_methodOlusturma_Kullanma;

import java.util.Scanner;

public class C05_MethodKullanma {
    public static void main(String[] args) {

        // kullanicdan bir metin alin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz...");
        String metin = scanner.nextLine();

        // kullanicinin girdigi metni tersten yazdirin

        C03_MethodOlusturma.terstenYazdir(metin);

        // kullanicini girdigi metnin palindrome olup olmadigini true false seklinde yazdirin

        System.out.println(C04_Palindrome.isPalidrome(metin));

        // eger verilen metin palindrome ise "Aferin sana "
        // palindrome degilse "Bu nasil metin " yazdirin

        boolean sonuc = C04_Palindrome.isPalidrome(metin);
        // palindrome olup olmadigini true veya false donen method sayesinde kaydettik

        if (sonuc){
            System.out.println("Aferin sana");
        }else {
            System.out.println("Bu nasil metin");
        }
    }
}
