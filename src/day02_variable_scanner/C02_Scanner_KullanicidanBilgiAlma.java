package day02_variable_scanner;

import java.util.Scanner;

public class C02_Scanner_KullanicidanBilgiAlma {
    public static void main(String[] args) {

        // Kullanicidan ismini alip,
        // ismi buyuk harf olarak yazdirin

        // Kullanicidan bilgi almak icin uc adima ihtiyac vardir

        // 1- Bir scanner objesi olusturma

        Scanner scanner = new Scanner(System.in);

        //2- Kullaniciya ne istedigimizi soylemeliyiz

        System.out.println("Lutfen isminizi giriniz...");

        // Istediginiz bilgiyi kaydedeceginiz
        // istenen bilgiye uygun bir variable olusturun,
        // olusturdugumuz Scanner objesi ile uygun hazir methodu kullanip
        // kullanicinin girdigi degeri, konsoldan alip,
        // olusturdugumuz variable 'a atayin

        // Bu gorevde isim istedigimiz icin String bir variable olusturduk,
        // ve scanner.nextline()'i kullandik
        // next() ==> bize ilk space 'e kadar olan kismi verir
        //            ornegin kullanici "Ali Can Aslan " girerse , next() sadece Ali'yi alir
        // nextline() ==> tum satiri alir

        String kullaniciIsmi = scanner.nextLine();

        // kullanicidan bilgiyi alip , kod dunyasina kaydettik
        // bundan sonra bizden istenen islemi yapariz

        System.out.println("Girilen ismin buyuk harf ile yazilisi: "+kullaniciIsmi.toUpperCase());


    }
}
