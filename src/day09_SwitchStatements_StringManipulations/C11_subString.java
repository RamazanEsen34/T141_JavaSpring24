package day09_SwitchStatements_StringManipulations;

public class C11_subString {
    public static void main(String[] args) {

        String str = "Java guzeldir";

        System.out.println(str.substring(2)); // va guzeldir

        System.out.println(str.substring(0)); // Java guzeldir

        System.out.println(str.substring(str.length()-1)); // r

        System.out.println(str.length()); // 13, son index 12

        System.out.println(str.substring(13)); // bos satir yazdirir "" (hiclik) verir

       // System.out.println(str.substring(str.length()+1));// StringIndexOutOfBoundsException

        // length-1 son index deki harfi verir
        // length() son harften sonraki hicligi yazdiri
        // length() +1 ve daha fazla sayilar StringIndexOutOfBoundsException

        // son 3 harfi yazdirin
        System.out.println(str.substring(str.length()- 3)); // dir

    }
}
