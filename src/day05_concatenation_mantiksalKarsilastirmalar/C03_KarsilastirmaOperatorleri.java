package day05_concatenation_mantiksalKarsilastirmalar;

public class C03_KarsilastirmaOperatorleri {
    public static void main(String[] args) {

        int a = 5;

        System.out.println(2*a+4==14);// true

        System.out.println(a+4==2*a-1); // true

        int b= 8;

        System.out.println(b=3*a-7);// 8 atama islemidir ( tek = isareti var )

        System.out.println("b :"+ b);// b :8

        System.out.println(b == 2*a+b);// false

        // java'da esit degildir karsilaştirmasi icin != kullanilir

        // a :5  B :8

        System.out.println(a+3!= 2*b-1);//  8 != 15 ==> true  java esit degil isaretinin
        // her iki yanindaki islemi yapar sonra karsilastirir

        System.out.println(2*a!=b+2);// 10 != 10 ==> false

        // matematikteki < ve > Java'da da vardir

        System.out.println(2*a < b-3);// 10 < 5==> false

        System.out.println( !(a+ 7 > b+8));// !( 12 > 16 ) ==> true

        // ONEMLİ NOT : javada basa yazilan ! mantiksal degeri tersine cevirir


        int c = 15;

        System.out.println(15>=c++);// true ==> artirma islemi sonra oldugu icin once 15>=c ==> true yazdiracak
        // sonra c bir arttirilacak

        System.out.println(c);// 16 

            }
}
