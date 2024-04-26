package day08_Terrnary;

public class C08_TernarySoru {
    public static void main(String[] args) {
        // sayi 10 dan buyukse sayinin degerini 2 artirin
        // sayi 10 dan buyuk degil ise sayinin degerini 5 artirin


        int sayi = 45;

        if (sayi > 10){
            sayi-= 2;
        }else {
            sayi+=5;

        }
        System.out.println("If ile sayinin yeni degeri :" + sayi);// 38

        sayi = sayi>10 ? sayi-2 :sayi+5;
        System.out.println("Ternary ile sayinin yeni degeri :" +sayi);// 41

        //Ternary sadece deger dondurdugu icin ya yazdirmali
        // yada bir variable'a atamaliyiz
    }
}
