package day22_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C08_TekrarsizHaleGetirme {
    public static void main(String[] args) {
        //Soru 1- Verilen bir array’de tekrar eden elementler icin,
        // mukerrer olanlari silip,
        // tum elemanlardan sadece 1 tane yapip
        // arrayi bize dondurecek bir method olusturun

        int[] arr = {3, 5, 3, 6, 5, 7, 2, 3, 6, 5, 6, 4, 7};

        arr =uniqueHaleGetir(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static int[] uniqueHaleGetir(int[] arr) {

        List<Integer> uniqueList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            if (!uniqueList.contains(arr[i])) {

                uniqueList.add(arr[i]);
            }

        }

        // biz listeyi unique olarak olustueduk
        // simdi arrayi Listedeki elementlerin oldugu hale donustermeliyiz

        int[] yeniArr = new int[uniqueList.size()];

        for (int i = 0; i < yeniArr.length; i++) {

            yeniArr[i] = uniqueList.get(i);

        }


        return arr;
    }

}