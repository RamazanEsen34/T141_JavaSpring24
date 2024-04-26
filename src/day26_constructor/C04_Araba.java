package day26_constructor;

public class C04_Araba {

    String marka = "Marka belirtilmedi";
    String model = "Model belirtilmedi";
    int yil = 1900;
    int fiyat;


    C04_Araba(){

    }

    C04_Araba(String mrk,int fyt){
        marka = mrk;
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
