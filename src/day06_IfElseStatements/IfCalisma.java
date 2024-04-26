package day06_IfElseStatements;

import java.util.Scanner;

public class IfCalisma {
    public static void main(String[] args) {
        /*
        int a= 20;
        int b= 35;

        if (a>b){
            System.out.println("a bden buyuk");
        }

        if (b%2==0){
            System.out.println("bu sayilarin carpimi cift olur");
        }
        if (a>100){
            System.out.println("ilk sayi cok buyuk");
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir sayi giriniz...");

        int sayi = scanner.nextInt();

        if (sayi % 3 == 0){
            System.out.println("uc ile bolunebilen sayi...");
        }

        if (sayi%5==0){
            System.out.println("bes ile bolunebilen sayi");
        }

        Scanner scanner1= new Scanner(System.in);
        System.out.println("Luyfen uc kenar ucgenin kenar1 uzunlugunu giriniz...");
        int kenar1 =scanner1.nextInt();
        System.out.println("Luyfen uc kenar ucgenin kenar2 uzunlugunu giriniz...");
        int kenar2 =scanner1.nextInt();
        System.out.println("Luyfen uc kenar ucgenin kenar3 uzunlugunu giriniz...");
        int kenar3 =scanner1.nextInt();



        if (kenar1==kenar2 && kenar1==kenar3&& kenar1>0){
            System.out.println("eskenar ucgen");
        }


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz...");

        char harf = scanner.next().charAt(0);

        if (harf=='o'|| harf=='O'){
            System.out.println("ocak");
        }
        if (harf=='s' || harf=='S'){
            System.out.println("subat");
        }
        if (harf=='m' || harf=='M'){
            System.out.println("mart veya mayis");
        }
        if (harf=='n' || harf=='N'){
            System.out.println("nisan");
        }
        if (harf=='h' || harf=='H'){
            System.out.println("haziran");
        }
        if (harf=='t' || harf=='T'){
            System.out.println("temmuz");

        }if (harf=='a' || harf=='A'){
            System.out.println("agustos veya aralik");
        }
        if (harf=='e' || harf=='E'){
            System.out.println("eylul veya ekim");
        }
        if (harf=='k' || harf=='K'){
            System.out.println("kasim");
        }


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz...");
        char harf = scanner.nextLine().charAt(0);

        if (harf>='a' && harf<='z'){
            System.out.println("kucuk harf");
        }
        if (harf>='A'&& harf<='Z'){
            System.out.println("buyuk harf");
        }



        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz...");
        double not = scanner.nextDouble();

        if (not<0 || not>100){
            System.out.println("gecersiz not...");
        }else {
            System.out.println("gecerli not");
        }



        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen ucgenin kenar uzunlugunu giriniz...");
        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();

        if (kenar1 == kenar2 && kenar1== kenar3 && kenar1>=1){
            System.out.println("eskenar ucgen");
        }else {
            System.out.println("eskenar ucgen degil");
        }


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz...");
        double yas = scanner.nextDouble();

        if (yas>= 65){
            System.out.println("emekli olabilirsin");
        }else {
            System.out.println("emekli olmak icin"+(65-yas)+"yıl calısmalisin");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir harf giriniz...");
        char harf = scanner.next().charAt(0);

        if (Character.isLowerCase(harf)){
            System.out.println(Character.toUpperCase(harf));
        }else {
            System.out.println(harf);
        }

        */


        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz...");
        double sayi = scanner.nextDouble();

        if (sayi<100)  System.out.println("tebrikler kazandiniz");
        else  System.out.println("bu defa olmadi");





    }

}
