package day04_wrapperClasses_Increment;

public class C05_preIncrement_postIncrement {
    public static void main(String[] args) {

        int a = 10;

        a++;

        System.out.println("a'nibn degeri :" + a);// 11

        a= 10;

        ++a;
        System.out.println("a'nin 15 satirdaki degeri :"+ a);//a'nin 15 satirdaki degeri :11

        /*
          Javada 3 farklı sekilde deger attirmak mumkun

          -sayi = sayi + 1;

          -sayi+= 1;

          -sayi++;

          sadece yontem icin Java ihtiyaca gore kullanilabilmesi amacıyla
          iki farkli kullanım olusturmustur

          sayi++ yazabildigimiz gibi ++sayi da yazdirabiliriz

          aralarindaki fark 
         */

        int b = 10;

        System.out.println("++b yazdigimda konsolda yazdirilan :"+  ++b);//++b yazdigimda konsolda yazdirilan :11

        System.out.println("++b den 1 satir sonra konsolda b degeri :"+ b);//++b den 1 satir sonra konsolda b degeri :11


        int c = 10;

        System.out.println("c++ yazdigimda konsolda yazdirilan :"+  c++);//c++ yazdigimda konsolda yazdirilan :10

        System.out.println("c++ den 1 satir sonra konsolda c degeri :"+ c);//c++ den 1 satir sonra konsolda c degeri :11


        int x = 10;

        int y = x++;

        System.out.println("x :"+ x + ", y :"+y);//x :11, y :10

        x = 10;

        y = ++x;

        System.out.println("x :"+ x + ", y :"+y);//x :11, y :11



    }
}
