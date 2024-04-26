package day19_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class day19_Calisma {
    public static void main(String[] args) {
        String[] isimler = {"Meltem","Seren","Emrah","Ali","Ahmet","Semih","Mustafa"};

        enUzunEnKisaKelimeleriYazdir(isimler);

    }
    public static void enUzunEnKisaKelimeleriYazdir(String[]kelimeler){
        String enuzunkelime =kelimeler[0];
        String enkisakelime = kelimeler[0];

        for (int i = 0; i < kelimeler.length; i++) {

            if (kelimeler[i].length()>enuzunkelime.length()){
                enuzunkelime =kelimeler[i];

            } else if (kelimeler[i].length()<enkisakelime.length()) {
                enkisakelime=kelimeler[i];
            }

        }
        System.out.println("en uzun kelime :"+ enuzunkelime);
        System.out.println("en kisa kelime :"+enkisakelime);
        }




    }

