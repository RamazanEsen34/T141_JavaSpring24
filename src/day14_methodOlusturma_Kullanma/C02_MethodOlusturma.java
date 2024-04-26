package day14_methodOlusturma_Kullanma;

public class C02_MethodOlusturma {
    public static void main(String[] args) {

        // verilen 2 sayidan buyuk olani yazdiran bir method olusturun
        // eger sayilar esit ise , "esit sayilar da buyuk olan yoktur"

        buyukOlaniYazdir(7,8);
        buyukOlaniYazdir(7,5);
        buyukOlaniYazdir(5,5);
    }

    // method class icinde ama diger methodlarin disinda olusturulmalidir

    public static void buyukOlaniYazdir(int sayi1, int sayi2){

        if (sayi1 > sayi2){
            System.out.println("Sayilardan buyuk olan : " + sayi1);
        } else if (sayi2> sayi1) {
            System.out.println("Sayilardan buyuk olan : " + sayi2);
            
        }else {
            System.out.println("esit sayilarda buyuk olan yoktur");
        }
    }
}
