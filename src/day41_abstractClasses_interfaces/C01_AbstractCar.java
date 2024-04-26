package day41_abstractClasses_interfaces;

public abstract class C01_AbstractCar {

    // bu class'i car uretmek isteyen tum markalarin,
    // kendilerine uyarlamasi gereken methodlari belirlemek icin olusturduk

    // motoru mecbur yapalim

    public abstract void motor();
    // Abstract methods cannat have a body

    // sunroof istege bagli
    public void sunroof(){
        System.out.println("Arabalar isterese sunroof kullanabilir");
    // child class'lari kendisne uyarlama konusunda
    // serbest birakmak istedigimiz method'lari
    // concrete ( abstract olmayan) method olarak olustururuz

    }

    // yakit zorunlu olmali
    public abstract void yakit();
    // abstract methodlar concrete methodlar gibi
    // bir islem yapmak uzere DEGİL
    // child classlari UYARLAMAYA MECBUR etmek icin kullanilir
    // standartlarda olan yazilar gibidir
    // ornegin

    // geri gorus kamerasi zorunlu degil
    public void geriGoruskamerasi(){
        System.out.println("Arabalar geri gorus kamerasi kullanabilir");

    }

    // sanzimani duz vites , otamatik vites zorunlu
    public abstract void sanzuman();


}
