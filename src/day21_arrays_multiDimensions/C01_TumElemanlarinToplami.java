package day21_arrays_multiDimensions;

public class C01_TumElemanlarinToplami {
    public static void main(String[] args) {
        // verilen iki katli int bir arraydeki tum sayilarin toplamini yazdiran bir method olusturun

        int[][] arr = {{3,6},{1,6,9},{8,0,2,1},{4}};
        elemanlarinToplaminiYazdir(arr);

    }
    public static void  elemanlarinToplaminiYazdir (int[][]arr){

        int toplam =0;

        for (int i = 0; i < arr.length; i++) {// outer arrayi kontrol eder

            for (int j = 0; j < arr[i].length; j++) {

                toplam += arr[i][j];




            }

        }
        System.out.println("Verilen arraydeki elementlerin toplami"+toplam);
    }
}