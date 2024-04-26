package day42_interfaces;

public class F_ChildOfClassVeInterfaces extends E_ParentClass
                                        implements A_Parentinterface01,D_ParentInterface03{

    @Override
    public int method3() {
        return 0;
    }

    @Override
    public String method4() {
        return null;
    }

    /*
        Birden fazla parent edinen bir class
        parent abstract yapilarda bulunan
        concretelestirilmemis tum abstract methodlari
        kendisne UYARLAMAK ZORUNDADIR
        bu ornekte method1 ve method2 parentClassda concrete olarak bulundugı-undan
        imlement etme zorunlulugu yoktur
     */

    public static void main(String[] args) {


        System.out.println(A_Parentinterface01.SAYI);
        System.out.println(D_ParentInterface03.SAYI);


    }


}
