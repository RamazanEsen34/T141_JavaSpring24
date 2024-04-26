package day21_arrays_multiDimensions;

public class C02_CiftSayialrinToplami {
    public static void main(String[] args) {
        //Soru 1- Verilen 2 katli bir array’de bulunan cift sayilari toplayip,
        // sonucu yazdiran bir method olusturun.

        int[][] arr = {{3,6},{1,6,9},{8,0,2,1},{4}};

        ciftSayilariTopla(arr);
    }

    public static void ciftSayilariTopla(int[][]arr){

        int toplam =0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] %2==0){
                    toplam += arr[i][j];
                }

            }

        }
        System.out.println("Arraydeki cift sayilarin toplami :"+toplam);
    }
}
