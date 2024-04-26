package day38_inheritance;

public class C06_Runner {
    public static void main(String[] args) {
        C05_AvciKuslar kartalAvKus = new C05_AvciKuslar();
        System.out.println(kartalAvKus.omur);// H yasar ve olurler

        System.out.println(kartalAvKus.solunum);// K akcigerle nefes alirlar
        System.out.println(kartalAvKus.cogalma);// K yumurtayla cogalirlar
        System.out.println(kartalAvKus.kanat);// K kanatlidirlar

        System.out.println(kartalAvKus.hareket);// AvK ucarlar
        System.out.println(kartalAvKus.beslenme);// AvK et yerler
        System.out.println(kartalAvKus.gaga);// AvK sivri gagali
        System.out.println(kartalAvKus.pence);// AvK pencelidir

        System.out.println("===============================");
//==============================================================================================================//
        C04_Kuslar kartalKus = new C05_AvciKuslar();
         // kuslar class'indaki Kartalin ozellikleri

        System.out.println(kartalKus.omur);// H yasar ve olurler

        System.out.println(kartalKus.solunum);// K akcigerle nefes alirlar
        System.out.println(kartalKus.cogalma);// K yumurtayla cogalirlar
        System.out.println(kartalKus.kanat);// K kanatlidirlar

        System.out.println(kartalKus.hareket);// H hareket ederler
        System.out.println(kartalKus.beslenme);// H beslenirler
        System.out.println(kartalKus.gaga);// K gagalari vardir
        //System.out.println(kartalKus.pence);// kuslar veya hayvanlarda yok CTE verir

        System.out.println("==========================================");
        //====================================================================================================//
        // hayvanlar class'indaki Kartalin ozellikleri

        C03_Hayvanlar kartalHayvan = new C05_AvciKuslar();

        System.out.println(kartalHayvan.omur);// H yasar ve olurler

        System.out.println(kartalHayvan.solunum);// H nefes alirlar
        System.out.println(kartalHayvan.cogalma);// H cogalirlar
        //System.out.println(kartalHayvan.kanat);//  CTE hayvanlar class'inda yok

        System.out.println(kartalHayvan.hareket);// H hareket ederler
        System.out.println(kartalHayvan.beslenme);// H beslenirler
        //System.out.println(kartalHayvan.gaga);// CTE hayvanlar class'inda yok
        //System.out.println(kartalKus.pence);// CTE hayvanlar class'inda yok

        System.out.println("==========================================");

        C04_Kuslar kus1 = new C04_Kuslar();
        // kuslar class'indaki Kartalin ozellikleri

        System.out.println(kartalKus.omur);// H yasar ve olurler

        System.out.println(kus1.solunum);// K akcigerle nefes alirlar
        System.out.println(kus1.cogalma);// K yumurtayla cogalirlar
        System.out.println(kus1.kanat);// K kanatlidirlar

        System.out.println(kus1.hareket);// H hareket ederler
        System.out.println(kus1.beslenme);// H beslenirler
        System.out.println(kus1.gaga);// K gagalari vardir
        //System.out.println(kus1.pence);// kuslar veya hayvanlarda yok CTE verir

        System.out.println("==========================================");

       C03_Hayvanlar kusHayvan = new C04_Kuslar();

        System.out.println(kusHayvan.omur);// H yasar ve olurler

        System.out.println(kusHayvan.solunum);// H nefes alirlar
        System.out.println( kusHayvan.cogalma);// H cogalirlar
        //System.out.println(kusHayvan.kanat);//  CTE hayvanlar class'inda yok

        System.out.println(kusHayvan.hareket);// H hareket ederler
        System.out.println(kusHayvan.beslenme);// H beslenirler
        //System.out.println(kusHayvan.gaga);// CTE hayvanlar class'inda yok
        //System.out.println(kusHayvan.pence);// CTE hayvanlar class'inda yok

        System.out.println("==========================================");

        C03_Hayvanlar hayvan = new C03_Hayvanlar();

        System.out.println(hayvan.omur);// H yasar ve olurler

        System.out.println(hayvan.solunum);// H nefes alirlar
        System.out.println( hayvan.cogalma);// H cogalirlar
        //System.out.println(hayvan.kanat);//  CTE hayvanlar class'inda yok

        System.out.println(hayvan.hareket);// H hareket ederler
        System.out.println(hayvan.beslenme);// H beslenirler
        //System.out.println(hayvan.gaga);// CTE hayvanlar class'inda yok
        //System.out.println(hayvan.pence);// CTE hayvanlar class'inda yok


    }
}
