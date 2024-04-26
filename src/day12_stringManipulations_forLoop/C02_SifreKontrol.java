package day12_stringManipulations_forLoop;

import java.util.Scanner;

public class C02_SifreKontrol {
    public static void main(String[] args) {
       //  : Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin ve kullaniciya
       //  duzeltmesi gereken tum eksikleri soyleyin, eger tum sartlari saglarsa, "sifre
       //  basariyla kaydedildi" yazdirin
       // - ilk harf kucuk harf olmali
       // - son karakter rakam olmali
       // - sifre bosluk icermemeli
       // - uzunlugu en az 10 karakter olmali

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz...");
        String sifre = scanner.nextLine();

        /*
          eger if-else kullanirsaniz
          - tum hatalari sirasiyla kontrol eder,
          en sonda hata if'lerine takilmazsa basarili sifre yazdirabiliriz
          -if-else cumlelerinde suzgec mantigi oldugundan
          sadece bir hatayi yazdirabiliriz


            bagimsiz if cumleleri kullanirsak
            - sifredeki tum hatalari yazdirabiliriz
            -bagimsiz if cumleleri kodun kendileri disindaki kismi ile ilgilenmez
            -yani sifrenin basarili oldugunu yazdirabilmek icin
            ektsra bir kontrol mekanizma kullanilmalisiniz
         */

        int sayac = 0; // yada flag yontemi kullaniriz ( true /false olarak) ,int sayi degeri de verebiliriz
         // flag =20;              // bu durumda belirli bir baslangıc degeri verip hata durumunda baska
                        // bir rakami flag degeri olarak veririz

        //    - ilk harf kucuk olmali
        char ilkharf = sifre.charAt(0);
        if (!Character.isLowerCase(ilkharf)){
            System.out.println("Ilk karakter kucuk harf olmali");
            sayac++;
            //flag=15;
        }

        //    - son karakter rakam olmali

        char sonharf= sifre.charAt(sifre.length()-1);
        if (!(sonharf>='0'&& sonharf<='9')){
            System.out.println("Son karakter rakam olmali");
            sayac++;
            //flag=15;
        }

        //     - sifre bosluk icermemeli

        if (sifre.contains(" ")){
            System.out.println("Sifre bosluk icermemeli");
            sayac++;
            //flag=15;
        }

        //    - uzunlugu en az 10 karakter olmali

        if (sifre.length()<10){
            System.out.println("Sifrenin uzunlugu en az 10 karakter olmali");
            sayac++;
            //flag=15;
        }

        if (sayac==0){
            System.out.println("Sifre basarili olarak kaydedildi.");
        }else {
            System.out.println(sayac+" adet hata yaptiniz,Lutfen hatalari duzelterek yeniden sifre giriniz");
        }
        //if (flag==20){
        //    System.out.println("Sifre basarili olarak kaydedildi.");
        // }else {
        //     System.out.println("Lutfen hatalari duzelterek yeniden sifre giriniz");
        }


    }

