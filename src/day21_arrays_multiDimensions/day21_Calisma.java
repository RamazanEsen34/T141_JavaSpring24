package day21_arrays_multiDimensions;

import java.util.Arrays;

public class day21_Calisma {
    public static void main(String[] args) {
        int[][] sayilar ={{3,4,5},{1,4},{5,2,7},{1,9,0,3}};
        sonElementleriTopla(sayilar);



    }
    public static void sonElementleriTopla( int[][] sayilar){
        int toplam =0;

        for (int i = 0; i < sayilar.length; i++) {
            toplam += sayilar[i][sayilar[i].length-1];

        }
        System.out.println("inner arraydeki son elementlerin toplami :"+ toplam);
    }


}









