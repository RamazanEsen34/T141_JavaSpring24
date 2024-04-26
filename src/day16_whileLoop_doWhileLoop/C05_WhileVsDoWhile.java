package day16_whileLoop_doWhileLoop;

public class C05_WhileVsDoWhile {
    public static void main(String[] args) {

        int sayi = 20;

        while (sayi<10){
            System.out.println("While loop body'si calisti");

            sayi --;
        }

        // atanan ilk deger icin while kontrolu false oldugundan
        // lopp body'si hic calismadan biter

        do {
            System.out.println("Do-While loop body'si calisti");
            sayi --;
        }while (sayi <10);

        // ilk deger kontrol edilmeden once
        // lopp body'si bir kere calisir
        // Bu durumda ilk deger uygun olmasa bile
        // loop body'si 1 kere calismis olur

        // Do-While loop'un 4 ve - si de aynidir
        // kontrol yapilmadan once body bir kere calisir
        // bu durum avantaj ve dejavantaj olabilir
    }
}
