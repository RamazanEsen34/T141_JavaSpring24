package day08_Terrnary;

public class C10_NestedTernary {
    public static void main(String[] args) {

        /*
          ikiden fazla sonuc olasiligi olan gorevlerde
          Ternary pek tercih edilmez
         */

        // verilen sayi icin asagidaki 3 durumdan uygun olani yazdirin
        // - sayi pozitif
        // - sayi negatif
        // - 0 pozitif veya negatif degildir


        int sayi = -10;

        if (sayi >0){
            System.out.println("sayi pozitif");
        } else if (sayi <0) {
            System.out.println("sayi negatif");
        }else {
            System.out.println("0 pozitif veya negatif degildir");
        }

        System.out.println(sayi>0 ? "sayi pozitif" : "sayi 0 veya negatif olabilir");

        System.out.println(sayi>0 ? "sayi pozitif" : sayi== 0? " sayi 0 veya negatif olabilir" : "sayi negatif");
    }
}

