package day26_constructor;

public class C01_Araba {

    String marka = "Marka belirtilmedi";
    String model = "Model belirtilmedi";
    int yil = 1900;
    int fiyat;

    C01_Araba(){
        // Biz bir class'da gorunur bir constructor olusturdugumuzda
        // Java default constructor'i siler
        // bu durumda daha onceden default constructor'u  kullanarak
        // olusturulan objeler cte VERİR
        // KODUN PROBLEM YASAMAMASİ İCİN

    }


    C01_Araba(String mrk,String mdl,int yl,int fyt){
        marka = mrk;
        model = mdl;
        yil   = yl;
        fiyat = fyt;

    }




















    @Override
    public String toString() {
        return "C01_Araba{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", yil=" + yil +
                ", fiyat=" + fiyat +
                '}';




    }
}
