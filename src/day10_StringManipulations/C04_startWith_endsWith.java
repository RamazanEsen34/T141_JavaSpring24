package day10_StringManipulations;

public class C04_startWith_endsWith {
    public static void main(String[] args) {

        String str = "Ali topu at, at Ali at";

        System.out.println(str.contains("Ali"));// true
        System.out.println(str.contains("top"));// true
        System.out.println(str.contains("at"));// true

        // str Ali ile bitiyor mu

        System.out.println(str.endsWith("Ali"));// false

        // str Ali ile basliyor mu

        System.out.println(str.startsWith("A"));// true

        System.out.println(str.startsWith("A"));// true

        System.out.println(str.startsWith("Ali topu at"));// true

        System.out.println(str.toLowerCase().startsWith("Ali"));// false

        System.out.println(str.startsWith(""));// true

        System.out.println(str.startsWith("top"));// false

        System.out.println(str.endsWith(""));// true

        System.out.println(str.startsWith("top",4));//   true ==> 4. ,index ve sonrasi "top" ile mi basliyor
                                                    //   startsWith(String prefix, int toffset) kalibi bu islevi gorur
                                                    //   yani iki parametre girdigimizde




    }
}


