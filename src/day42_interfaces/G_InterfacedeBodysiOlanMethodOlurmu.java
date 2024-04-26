package day42_interfaces;

public interface G_InterfacedeBodysiOlanMethodOlurmu {

    /*
        Buyuk bir projede pek cok interface bulunabilir
        bu interfaceler yuzlerce/binlerce class tarafindan implement edilmis olabilir
        Eger gınınbirinde varolan bir interface
        yeni bir method eklememiz gerekirse
        bugune kadar o interfacei implement etmşs olan
        BUTUN CHILD CLASSLARyeni methodu implement etmedigi icin CTE verir
        tum child classlari bulmamiz
        her bir classin durumu inceleyip
        yeni methodu o child classlara uyarlamamız gerekir

        Developerlarin bu tur ihtiyaclari
        SORUNSUZ COZEBILMESIicin JAVA 8 ile istisnai bir yol olusturulmustur

        Java ozel 2 keyword belirleyerek
       interface icinde  bu keyword lere sahip olan methodlarin
       bodysi olmasina ve boylece implement edilen zorunlulugu OLMAMASINA olanak tanimistir

       bu iki keywoed: default ve static
     */

    public  void method1(); // interface icinde oldugundan biz yazmasakta
                            // java otamatik olarak abstrack kabul eder

    //public void method2(){

    // Interface abstract methods cannot have body

  //  }


    public default void method3(){

        // burada defaultun accesss modifier olmasi mumkun degil
        // cunku access modifier olarak public var
        // bu 1. istisnai keywodudur

        System.out.println("Interface icinde default method");

    }

    public static void method4(){

        // istisna olarak default ve static keyword iceren method olusturursak
        // mutlaka bodysi olmalidir

        System.out.println("Interface icinde static method");

    }








}
