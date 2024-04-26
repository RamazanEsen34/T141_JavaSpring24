package day08_Terrnary;

public class C09_TernarySoru {
    public static void main(String[] args) {

        /*
          Ternary de iki olasilik olur
          eger bu iki olasilikdan birinde atama yapmamiz
          digerinde yazdirmamiz isteniyorsa
          ternary yerine if tercih edilebilir
         */
        //verilen sayi 10 dan buyuk ise degerini 3 azaltin
        // 10 dan buyuk degilse "Bu sayi cok kucuk" yazdirin

        int sayi = 20;

        if (sayi > 10){
            sayi-= 3;
        }else {
            System.out.println("Bu sayi cok kucuk");
        }

        System.out.println("If -eise den sonra :" + sayi);

        System.out.println(sayi > 10 ? sayi=sayi-3 :"sayi cok kucuk");

        System.out.println("Ternary den sonra sayi :" + sayi);
    }
}
