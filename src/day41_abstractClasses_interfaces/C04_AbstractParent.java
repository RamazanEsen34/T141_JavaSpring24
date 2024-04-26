package day41_abstractClasses_interfaces;

public abstract class C04_AbstractParent extends C03_AbstractGrandParent{

    // bir class abstract yapıldıgında
    // child classlari bazi methodlari uyarlamaya
    // ZORUNLU KILMAK icin olusturulur

    // bir abstract class paraenti olan abstract classlardaki
    // abstract methodlari kendisine uyarlamak zorunda degildir
    // isterse kendisine uyarlayabilir
    // isterse uyarlamadan yeni concrete veya abstract methodlar ekleyebilir

    public void method1(){
        System.out.println("Parent method1");

    }
    public abstract void method5();

    public int method6(){
        return 0;
    }



}
