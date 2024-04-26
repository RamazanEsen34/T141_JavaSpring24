package day18_Arrays;

import java.util.Arrays;

public class C18_Calıisma {


    public static void main(String[] args) {
        String[] isimler ={"mahmut","Hasan","Ilgar","Sumeyra"};

        String[] hafrler ={"a","l","d"};

        int[] sayilar = new int[3];

        System.out.println(isimler[1]);
        System.out.println(hafrler[2]);
        hafrler[1] = "i";
        System.out.println(hafrler);// @7c30a502

        System.out.println(Arrays.toString(hafrler));// [a, i, d] yazdirmak icin kullanmaliyiz bu komutu



    }




}
