package day42_interfaces;

public class C_ChildOf2Interfaces implements B_Parentinterface02 {

    // parent'i olan tum abstract yapilari
    // concrete olmayan methodlari
    // imlement etnek zorundadir


    public void method1(){

    }
    public String method2(){
        return null;

    }
    public String method3(){
        // bir class birden fazla parent edinirse
        // ( bir class ve/veya istediği kadar interface)
        // ve bu parentlarda ayni  isimde methodlar varsa
        // - parent classlardaki ayni isimde olan methodlarin
        // retun typelari ayniise sorun olmaz
        // ama return typelari farkli ise iki parentida mutlu etme sansi olmadigindan
        // ya parentlardan birinden vazgecmelisiniz
        // yada parent larda degisiklik yapalisiniz

        // parent edilen interfacwelerde degisiklik yapmak
        // o interface daha once implement eden pek cok classda
        // degisikliklere sebep olacagindan
        // ZORUNLU OLMADIKÇA tercih edilmez
        return null;
    }
    public int method4(){
        return 8;
    }





}
