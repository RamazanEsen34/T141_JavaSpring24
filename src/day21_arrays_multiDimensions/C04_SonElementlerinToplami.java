package day21_arrays_multiDimensions;

public class C04_SonElementlerinToplami {
    public static void main(String[] args) {
        //Soru 5- Verilen 2 katli bir array’de her bir inner array’in
        // son elementlerinin toplaminini yazdiran bir method olusturun.

        int[][] arr = {{3,6},{1,6,9},{8,0,2,1},{4}};
        sonElementleriTopla(arr);

    }

    public static void  sonElementleriTopla(int[][]arr){
        int toplam =0;
        for (int i = 0; i < arr[i].length-1; i++) {

            toplam+= arr[i].length-1;

        }
        System.out.println("son elementlerin toplami "+ toplam);
    }
}
