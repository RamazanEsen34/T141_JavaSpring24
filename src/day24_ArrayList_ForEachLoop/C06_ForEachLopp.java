package day24_ArrayList_ForEachLoop;

import java.util.Arrays;
import java.util.Scanner;

public class C06_ForEachLopp {
    public static void main(String[] args) {

        //Soru 4- Kullanicidan bir cumle ve bir harf alin,
        // harf cumlede kullanilmissa kac kere kullanildigini yazdirin,
        // kullanilmadiysa “harf cumlede kullanilmamis” yazdirin.

        Scanner scanner =new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz...");

        String cumle = scanner.nextLine();

        String harf ="";

        while (harf.length()!=1){

            System.out.println("lutfen bir harf giriniz...");
            harf=scanner.nextLine();


        }
        String[] harfArrayi = cumle.split("");


        int sayac =0;

        for (String eachHarf :harfArrayi) {

            if (eachHarf.equalsIgnoreCase(harf)){

                sayac ++;
            }

        }
        if (sayac==0){
            System.out.println("Harf cumlede kullanilmamis...");
        }else {
            System.out.println("Verilen "+harf+" harfi cumlede "+sayac+" defa kullanilmis");
        }



    }
}
