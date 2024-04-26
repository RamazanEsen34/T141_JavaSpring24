package day03_scanner_dataCasting;

public class C06_ExplicitNarrowing {
    public static void main(String[] args) {
  // Explicit nsrrowing yaptigimizda ,
  // data kayiplari olabilir,
  // hatta baska bir sayiya donusebilir

     double dbl = 34.99;
     int sayi = (int) dbl;
        System.out.println(sayi);// 34


        int sayi1 = 23;
        byte byt = ( byte) sayi1;
        System.out.println("23 byte degeri :"+byt);// 23


        int sayi2 = 130;
        byt = (byte) sayi2;
        System.out.println("130 byte degeri :"+byt);// -126


        int sayi3 = 260;
        byt = (byte) sayi3;
        System.out.println("260 byte degeri :"+byt);// 4


        int sayi4 = 2600;
        byt = (byte) sayi4;
        System.out.println("2600 byte degeri :"+byt);// 40





    }
}
