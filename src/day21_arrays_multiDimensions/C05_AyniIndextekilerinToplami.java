package day21_arrays_multiDimensions;

import java.util.Arrays;

public class C05_AyniIndextekilerinToplami {
    public static void main(String[] args) {
        //Soru 2- Verilen 2 katli ,2 elemanli bir multidimensional array'de
        //        ayni index'e sahip elementleri toplayip,
        //        yeni olusturacagimiz tek katli bir array'e bu toplamlari atayin.
        //    input :      int[][] arr =  {{3,4,5}, {2,3,6,7}};
        //     output:                       [5, 7, 11]


        int [][]arr ={{3,4,5},{2,3,6,7}};

        // once yeni olusturacagimiz arrayin uzunlugunu belirlemek icin
        // verilen arraylerden kisa olanin lengthini bulmaliyiz


        int yeniArrLength = arr[0].length< arr[1].length ? arr[0].length :  arr[1].length;

        int[] yyeniArr =  new  int[yeniArrLength];

        for (int i = 0; i < yeniArrLength; i++) {

            yyeniArr[i] = arr[0][i]+arr[1][i];
        }

        System.out.println(Arrays.toString(yyeniArr));

    }

}
