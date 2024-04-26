package day22_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ListMethodlari {
    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(10);
        sayilar.add(7);
        sayilar.add(9);

        System.out.println(sayilar);//[10, 7, 9]


        List<Integer>List = new ArrayList<>(Arrays.asList(3,6,8));

        System.out.println(List);//[3, 6, 8, 1, 3, 5, 6]

        sayilar.add(1,5);
        System.out.println(sayilar);//[10, 5, 7, 9]

        sayilar.addAll(List);
        System.out.println(sayilar);//[10, 5, 7, 9, 3, 6, 8]

        sayilar.addAll(2,List);
        System.out.println(sayilar);//[10, 5, 3, 6, 8, 7, 9, 3, 6, 8]

    }
}
