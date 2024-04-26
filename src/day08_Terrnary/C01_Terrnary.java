package day08_Terrnary;

public class C01_Terrnary {
    public static void main(String[] args) {

        // input olarak verilen bir sayi icin
        // pozitif veya pozitif degil yazdirin

        int input = 56;

        if (input > 0) {
            System.out.println("sayi pozitif");
        } else {
            System.out.println("pozitif degil");
        }

        System.out.println(input>0 ? "sayi pozitif " :"sayi pozitif degil");

        // input olarak verilen sayi
        // cift ise iki katina cıkarin
        // tek sayi ise degerini 5 artirin


        input= input % 2== 0 ? input*2 :input+5;
        System.out.println(input);

        if (input%2==0){
            input*= 2;

        }else {
            input+= 5;
        }
    }
}
