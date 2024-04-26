package day41_abstractClasses_interfaces;

public  class C02_JavaCar extends C01_AbstractCar{

    @Override
    public void motor() {
        System.out.println("Javacar motor");

    }

    @Override
    public void yakit() {
        System.out.println("Javacar yakit");

    }

    @Override
    public void sanzuman() {
        System.out.println("Javacar sanzuman");

        // parent abstract class'daki
        // abstract methodlari child classa
        // IMPLEMENT (uyarlam) etmek zorundayiz

    }

   public void sunroof(){
       System.out.println("Javacar sunroof");

        // parent classdaki concrete methodlar ise
       // child classlar tarafindan IMPLEMENT edilmek ZORUNDA DEGİLDİR
       // child class isterse parent classdaki concrete methodu direrk kullanir
       // isrterse @override edip kendisine uyarlar

   }
}
