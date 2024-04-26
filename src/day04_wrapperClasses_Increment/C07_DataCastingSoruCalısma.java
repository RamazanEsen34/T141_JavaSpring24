package day04_wrapperClasses_Increment;

import java.util.Scanner;

public class C07_DataCastingSoruCalısma {
    public static void main(String[] args) {

        //Int olarak verilen 3 degerin ortalamasini double olarak yazdiran bir kod yazin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen 3 tam sayi giriniz");

        int sayi1 = scanner.nextInt();

        int sayi2 = scanner.nextInt();

        int sayi3 = scanner.nextInt();


         // islem yapilan variable larin hepsi int ise java sonucun int kismini verir
        System.out.println("Girilen sayilarin ortalamasi :"+ (sayi1+sayi2+sayi3)/3);// sonuc int olur


         // // islem yapilan variable larin toplami double yapilirsa   java sonucun double verir
        System.out.println("Girilen sayilarin ortalamasi :"+ (double) (sayi1+sayi2+sayi3)/3); // sonuc double olur
    }
}
