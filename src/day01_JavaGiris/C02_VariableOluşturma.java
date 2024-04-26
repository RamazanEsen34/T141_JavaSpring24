package day01_JavaGiris;

public class C02_VariableOluşturma {

    public static void main(String[] args) {

        int sayi = 10;

        // java'daki  = işarteti , matematikteki  = 'den farklı çalişir.
        // java  = işareti , önce eşitliğin sağ tarafindaki degeri hesaplar



        sayi = 2* sayi ;

        System.out.println( sayi ); // 20

        sayi = 5 + sayi;

        System.out.println( sayi ); // 25

        // 2* sayi + 1 = 5* sayi - 7 ; Variable expected
        // eşitligin sol tarafında  işlem olmaz, sadece variable ismi olmalidir.

        sayi = 5 * sayi -7 ;

        // int sayi = 20 ;  // Variable ' sayi ' is already defined in the scope , deklarasyon sadece bir kere yapılır ,
        // atama ise istediğimiz kadar
    }
}
