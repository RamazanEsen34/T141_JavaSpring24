package day22_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_ListRemove {
    public static void main(String[] args) {

        List<String> harfler = new ArrayList<>(Arrays.asList("a","r","a","t","a","s"));

        // remove(istenenobjrct) ==> Listede varsa siler ve Liste degisir
        //                             Listede yoksa silmez, Liste de degismez

        System.out.println(harfler);//[a, r, a, t, a, s]

        harfler.remove("a");
        System.out.println(harfler);//[r, a, t, a, s]==> ilk bulunan "a" silinir

        harfler.remove("x");
        System.out.println(harfler);//[r, a, t, a, s]==> olmayan harf remove edildiginde List de degisiklik olmaz

        // remove methodu calistiginda asil amaci olan silme islemini yapar
        // delil olrak da sildi ise true, bulamadi ise false dondurur

        System.out.println(harfler.remove("s"));// true
        System.out.println(harfler.remove("y"));// false

        // eger remove(istenenindex) kullanilirsa
        // indexi bulamam diye bir ihtimalolamayacagindan
        // true/false yerine bize sildigi elemani dondurur

        System.out.println(harfler.remove(1));// a getirir
        System.out.println(harfler);// [r, t, a]

        List<String> karakterler = new ArrayList<>(Arrays.asList("9","a","%","i","#"));

        // karakterler >Listesinden , harfler Listesinde olan tum harfleri siler
        // karakterler Listesi degisirse true, degismezse false dondurur

        System.out.println(karakterler.removeAll(harfler));// true dondurur ==> liste degistigi zaman

        System.out.println(karakterler);//[9, %, i, #]

        System.out.println(karakterler.removeAll(harfler));//false

        // Listemiz sayilardan olusuyorsa
        // girilen sayinin indez mi yoksa silinecek sayi mi oldugunu
        // net olarak bilmek icin
        // Java girilen sayiyi INDEX OLARAK kAbul edecegini belirtir

        List<Integer> sayilar = new ArrayList<>(Arrays.asList(2,5,7,3,5,6));

        System.out.println(sayilar);

        System.out.println(sayilar.remove(2));// 7 Listede yok

        // EGER elemean olarak 6 yi silmekl istiyorsak ve
        // indexini bilmiyorsak
        // once silinecek sayiyi non-primitive bir variable'a atamaliyiz


        Integer silinecekSayi= 6;
        System.out.println(sayilar.remove(silinecekSayi));// 6 silindi ve true olarak dondurdu

        System.out.println(sayilar);//[2, 5, 3, 5]
    }
}
