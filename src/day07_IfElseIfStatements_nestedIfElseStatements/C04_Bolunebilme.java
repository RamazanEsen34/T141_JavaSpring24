package day07_IfElseIfStatements_nestedIfElseStatements;

import java.util.Scanner;

public class C04_Bolunebilme {
    public static void main(String[] args) {
        // kullanicidan pozitif bir sayi alin
        // 3 ile bolunebiliyor ise " 3'un kati "
        // 5 ile bolunebiliyor ise " 5'in kati "
        // hem 3 ile hem de 5 ile bolunebiliyor ise " super sayi "yazdirin

        /*
          Eger sartlar birbiri ile ilgili ise
          en once en secici olani yazmaliyiz

          eger ifade else ile bitmez ise
          if else statement tum degerleri KAPSAMİYOR demektir
          kod calisir ama hic bir sonuc uretmez
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz :");

        int sayi = scanner.nextInt();

        if (sayi%3==0 && sayi%5==0){
            System.out.println("super sayi");
        } else if (sayi%5==0){
            System.out.println("5'in kati");

        }else  if (sayi%3==0 ){
            System.out.println("3'un kati");
        }else {
            System.out.println("3 ve 5 sayisinin kati degil");
        }
    }
}
