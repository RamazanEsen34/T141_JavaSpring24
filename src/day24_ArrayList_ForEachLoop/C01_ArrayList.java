package day24_ArrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ArrayList {
    public static void main(String[] args) {
        // verilen String bir listedeki ,
        // kullanilan toplam harrf veya karakter sayisini yazdirin

        List<String> isimler = new ArrayList<>(Arrays.asList("Seren","Eghbal","Ilgar","Joanna","Ali Cabbar"));

        int toplamkarakterSayisi = 0;

        for (int i = 0; i < isimler.size(); i++) {

            toplamkarakterSayisi +=isimler.get(i).length();
        }
        System.out.println("listede toplam "+ toplamkarakterSayisi+" adet harf veya karakter kullanilmis.");
    }
}
