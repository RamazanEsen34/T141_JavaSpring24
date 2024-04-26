package day26_constructor;

public class C02_ArabaRunner {
    public static void main(String[] args) {
        C01_Araba araba1= new C01_Araba();
        System.out.println(araba1);

            //C01_Araba{
            // marka='Marka belirtilmedi',
            // model='Model belirtilmedi',
            // yil=1900,
            // fiyat=0
            //         }


            C01_Araba araba2;
        //System.out.println(araba2.fiyat);//variable araba2 might not have been initialized
        // bir constructor calismadan
        // objeye ilk deger atamasi YAPILAMAZ
        // İLK DEGER ATAMASİ YAPİLMADAN DA KULLANİLAMAZ

        System.out.println(new C01_Araba().fiyat);// 0
        // esitligin sadece sag tarafi olursa
        // constructor calistigi icin class'a gidip
        // yeni bir obje olusturup bize getirir
        // ancak getirdigi objeyi kaydetmedigimiz icin
        // O obje sadece o satir icin VAR OLUR


    }

}
