package day21_arrays_multiDimensions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C07_ListMethodlari {
    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(10);
        sayilar.add(7);
        sayilar.add(9);


        List<Integer>List = new ArrayList<>(Arrays.asList(3,6,8,1,3,5,6));

        System.out.println(List);

        System.out.println(List.size());

        System.out.println(List.contains(7));

        
    }

}
