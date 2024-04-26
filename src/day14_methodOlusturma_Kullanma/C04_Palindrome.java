package day14_methodOlusturma_Kullanma;

public class C04_Palindrome {
    public static void main(String[] args) {

        // verilen metin palidrome ise true,
        // palindrome degilse false donduren bir method olusturun

        System.out.println(isPalidrome("Ey edip adanada pide ye"));// true

        System.out.println(isPalidrome("Sanane"));// false


    }

    public static boolean isPalidrome(String metin){

        String tersmetin ="";

        for (int i = metin.length()-1; i >=0; i--) {

            tersmetin += metin.charAt(i);

        }

        if (metin.equalsIgnoreCase(tersmetin)){
            return  true;
        }else {
            return false;
        }

    }
}
