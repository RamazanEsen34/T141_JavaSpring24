package day21_arrays_multiDimensions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C06_ArrayList {
    public static void main(String[] args) {

        // kullanicidan girmek istedigi kadar isim alip
        // girilen isimlerikaydedi
        // kullanici bitirmek icin q'ya basmalidir

        List<String> isimler = new ArrayList<>();

        ArrayList<String>deneme = new ArrayList<>();

        ArrayList<String> deneme1 = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        String isim ="";

        while (!isim.equalsIgnoreCase("q")){
            System.out.println("Listeye eklemek icin isim giriniz...\nbitirmek icin q'ya basiniz");

            isim = scanner.nextLine();

            if (!isim.equalsIgnoreCase("q")){
                isimler.add(isim);
            }
        }
        System.out.println("Girilen isimler :"+isimler);
    }
}
