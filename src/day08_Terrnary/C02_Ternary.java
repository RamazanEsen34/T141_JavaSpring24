package day08_Terrnary;

public class C02_Ternary {
    public static void main(String[] args) {
        /*
          Ternary if else 'in alternatifi degildir
          sadece basit islemler de if-else 'in yerine tercih edilebilir

          ternary bir sonuc ureti
          Java tek basina ternary'nin sonucu ne yapacagini bilmez
          YAZDIRMA veya ATAMA yapmalisiniz

          EGER BOOLEN SART TRUE OLDUGUNDA ELDE EDİLEN SONUC İLE
          FALSE OLDUGUNDA ELDE EDİLEN SONUC FARKLI DATA TURLERINE SAHIPSE
          BIR VARIABLE'A ATAMA YAPAMAZSINIZ
          SADECE YAZDIRABILIRSINIZ
         */

       int  input = 24;

        // iki basamakli mi?
        // iki basamakli ise sayiyi 2 katina cikarin
        // iki basamakli degilse "iki basamakli degil " yazdirin

        //input>= 10 && input<=99 ? input*2 : "iki basamakli degil"; // tek basina ternary kabul etmez
                                                                   // atama ve yazdirmayi ayni anda
        System.out.println(input>= 10 && input<=99 ? input = input*2 : "iki basamakli degil");

        System.out.println("input'un son hali :" + input);



    }
}
