package day02_variable_scanner;

import java.util.Scanner;

public class C04_IlkHarfiYazdirmak {
    public static void main(String[] args) {

        //  kullanicidan bir metin isteyip
        //  metnin ilk harfini buyuk harf olarak yazdirin

               Scanner scanner = new Scanner(System.in);

               System.out.println("Lutfen bir metin giriniz...");

       // 2 yontemle yapacagiz
       // 1- once tum metni alip, sonra ilk harfi yazdiralim

       String metin = scanner.nextLine();// kullanicidan metni alip kaydettik
        System.out.println(metin.toUpperCase().charAt(0));
        // kaydettigimiz metni, buyuk harfe ceviripilk karakteri aldik

        //2- 2. yontem olarak scannerden sadece metnin ilk harfini alip kaydedelim

        System.out.println("Lutfen bir metin daha giriniz...");
        char ilkHarf = scanner.nextLine().toUpperCase().charAt(0);
        System.out.println("Ikinci metin ilk harf:"+ ilkHarf);
    }
}
