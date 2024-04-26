package day22_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_ListedekiElemanlariToplama {
    public static void main(String[] args) {
        // verilen Integer bir Listedeki
        // tum elemanlari toplayip, sonucu yazdirin

        List<Integer> List = new ArrayList<>(Arrays.asList(3,6,8,1,3,5,6));
        System.out.println(List);//[3, 6, 8, 1, 3, 5, 6]

        int toplam=0;

        for (int i = 0; i < List.size(); i++) {

            toplam +=List.get(i);

        }
        System.out.println(toplam);// 32
    }
}
