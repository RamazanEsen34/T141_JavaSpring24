package day08_Terrnary;

public class C07_Ternarysoru {
    public static void main(String[] args) {
        // verilen bir sayinin cift sayi veya tek sayi oldugunu yazdirin

        int sayi= -235;
         if (sayi%2==0){
             System.out.println("Sayi cift");
         }else {
             System.out.println("Sayi tek ");
         }

         // Ternary operatoru
        // if else ile yapilabilecek BASİT islemler icin kullanilan
        // alternatif bir kod blogudur

        System.out.println(sayi%2==0 ? "sayi cift" : "sayi tek");
    }
}
