package day04_wrapperClasses_Increment;

public class C02_Modulus {
    public static void main(String[] args) {

        System.out.println(25%4);// 1 kalan

        System.out.println(234567 %7);// kalan 4 , 7 ile tam bolunmez

        System.out.println(25 /8);// 3

        // 54987698 sayisi 3'e tam bolunur mu

        System.out.println(54987698 % 3);// 2 kalan ,bolunmez

        // kullanıcıdan bir sayi alın ve cift olup olmadıgına bakın

        int verilensayi = 456;
        System.out.println(456%2);// 0 ==> verilen sayi çift sayi

        //verilen sayinin birler basamagını yazdirin

        System.out.println(verilensayi%10);// 6

        System.out.println(verilensayi/10);// 45



    }
}
