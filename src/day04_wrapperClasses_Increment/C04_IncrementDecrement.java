package day04_wrapperClasses_Increment;

public class C04_IncrementDecrement {
    public static void main(String[] args) {



        int a = 10;

        // a'nin degerini olusturacagımız bir b variable'na atayin
        // sonra a'nin degerini bir attirin

        int b = a;

        a++;
        System.out.println("a :"+a+",b"+b);//a :11,b10

        a = 10;

        // a'nin degerini bir attirin
        // sonra a'nin degerini b'ye atayin

        a++;
         b = a;
        System.out.println("a :"+a+",b"+b); // a :11,b11

        a = 10;

        // a'nin degerini yazdirin
        // sonra a'nin degerini bir attirin

        System.out.println("a'nin degeri :"+ a);//a'nin degeri :10

        a++;

        // burada a'nin degeri :11

        a = 10;

        // a'nin degerini 1 attirin
        // sonra a'nin degerini yazdirin

        a++;

        System.out.println("a'nin degeri :"+ a);//a'nin degeri :11


    }
}
