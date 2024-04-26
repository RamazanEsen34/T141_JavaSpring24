package day09_SwitchStatements_StringManipulations;

import java.util.Scanner;

public class C08_HaftaiciHaftaSonuAyrimi2 {
    public static void main(String[] args) {
        // kullanicidan gun numarasini isteyin
        // 1- pazartesi .... 7 pazar olacak sekilde
        // girilen numaraya karsilik hafta ici veya hafta sonu
        // seceneklerinden uygun olani yazdirin
        // Kullanici 1-7 arasinda sayi girmezse hata mesaji verin
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen ismini yazdirmak icin 1-7 arasi bir tamsayi giriniz...");

        int gunNo = scanner.nextInt();


        switch (gunNo) {

            case 1:
                System.out.println("haftaici");
                break;
            case 2:
                System.out.println("haftaici");
                break;
            case 3:
                System.out.println("haftaici");
                break;
            case 4:
                System.out.println("haftaici");
                break;
            case 5:
                System.out.println("haftaici");
                break;
            case 6:
                System.out.println("haftasonu");
                break;
            case 7:
                System.out.println("haftasonu");
                break;

           default:
        }        System.out.println("gecerli bir gun numarasi giriniz");


       switch (gunNo) {

            case 1:

            case 2:

            case 3:

            case 4:

            case 5:
                System.out.println("haftaici");
                break;
            case 6:

            case 7:
                System.out.println("haftasonu");
                break;

            default:
        }        System.out.println("gecerli bir gun numarasi giriniz");



    }
}
