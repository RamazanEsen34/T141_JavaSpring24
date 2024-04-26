package day26_constructor;

public class C03_ArabaRunner {

    public static void main(String[] args) {

        C01_Araba araba1 = new C01_Araba();

        araba1.marka = "BMW";
        araba1.model = "5.20";
        araba1.yil   = 2001;
        araba1.fiyat = 4000;

        System.out.println(araba1); // C01_Araba{
                                    // marka='BMW',
                                    //model='5.20',
                                    // yil=2001, fiyat=4000
                                    // }

        C01_Araba araba2 = new C01_Araba("Tofas","Sahin",1990,150000);

        System.out.println(araba2);
        //C01_Araba{marka='Tofas', model='Sahin', yil=1990, fiyat=150000}

        C01_Araba araba3 = new C01_Araba("Nissan","Note",2020,20000);
        System.out.println(araba3);
        //C01_Araba{marka='Nissan', model='Note', yil=2020, fiyat=20000}

        C01_Araba araba4 = new C01_Araba("Opel","Corsa",2010,4500);
        System.out.println(araba4);
        //C01_Araba{marka='Opel', model='Corsa', yil=2010, fiyat=4500}

        /*
            Bir obje olusturldugunda
            ya class daki standart ozelliklere sahip olur
            ve sonradan tek tek bu ozelliklere deger atamasi yapilir
            araba1 gibi
         */







    }

}
