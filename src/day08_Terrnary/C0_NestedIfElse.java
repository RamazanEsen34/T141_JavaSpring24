package day08_Terrnary;

import java.util.Scanner;

public class C0_NestedIfElse {
    public static void main(String[] args) {
        //Kullanicidan aldigi urun adedini ve indirimsiz fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa 10 urunden fazla alirsa %20,
        // az alirsa %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla alirsa %15, az alirsa %10 indirim yapin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen aldiginiz urun adedini giriniz ...");
        int urunadedi = scanner.nextInt();

        System.out.println("Aldiginiz urunun indirimsiz fiyatini giriniz...");
        double indirimsizfiyat = scanner.nextDouble();

        double toplamfiyat = urunadedi*indirimsizfiyat;

        System.out.println("Musteri kartiniz var mi? E . Evet , H : Hayir");
        char kartvarmi = scanner.next().toUpperCase().charAt(0);

        // musteri karti ana degisken olsun


        if (kartvarmi=='E'){
            if (urunadedi>10){
                System.out.println("%20 indirimli toplam fiyat :" + toplamfiyat*80/100);

            } else if (urunadedi>0) {
                System.out.println("%15 indiriml toplam fiyat :" + toplamfiyat*85/100);


            }else {
                System.out.println("Urun sayisi olarak pozitif bir tam sayi girmelisiniz");
            }

        }else if (kartvarmi=='H'){
            if (urunadedi>10){
                System.out.println("%15 indiriml toplam fiyat :" + toplamfiyat*85/100);
            } else if (urunadedi>0) {
                System.out.println("%10 indiriml toplam fiyat :" + toplamfiyat*90/100);

            }else {
                System.out.println("Urun sayisi olarak pozitif bir tam sayi girmelisiniz");
            }


        }else {
            System.out.println("Yanlis giris yaptiniz");
        }



    }
}
