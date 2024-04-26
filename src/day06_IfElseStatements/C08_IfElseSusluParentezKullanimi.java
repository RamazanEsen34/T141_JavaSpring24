package day06_IfElseStatements;

import java.util.Scanner;

public class C08_IfElseSusluParentezKullanimi {
    public static void main(String[] args) {
        // kullanicidan 2 tam sayi alip,
        // eger sayi1, sayi2 den buyukse sayi1'i 1 azaltip,
        // sayi2'yi 1 arttirin
        // sayi1, sayi2 den buyuk degilse sayi1' 3 ile carpin, sayi2'yi 2 ile carpin
        // sayi1 ve sayi2'nin son degerlerini yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen sayi1 ve sayi2 degerlerini giriniz :");

         int sayi1 = scanner.nextInt();
         int sayi2 = scanner.nextInt();

         /*
           eger if ve else den sonra {} parentez kullanmazsak
           Java if body ve else body olarak ilk ;'e kadar olan kismi alir
           sonrasinda olan kodlar başka programin kodlari olarak çalisir

           if ( sayi1 > sayi2 ) sayi1--; ==> buraya kadar if body
           else sayi1*=3;==> buraya kadar else body
           say2*=2;==> if else body si disinda bir kod olarak calisir

           Eger if ve else body'leri TEK BIR SATIRDAN olusuyor ise {} kullanmasask da olur
           AMMA if body'sinde yada else body'isnde bir satirdan fazla kod varsa MUTLAKA {}
           KULLANMALIYIZ.

          */

         if (sayi1>sayi2){
             sayi1--;
             sayi2++;


         }else{
             sayi1*= 3;
             sayi2*= 2;

         }
        System.out.println("Sayi1 :"+sayi1+ ", Sayi2 :"+sayi2);



    }
}
