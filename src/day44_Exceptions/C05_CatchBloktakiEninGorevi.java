package day44_Exceptions;

public class C05_CatchBloktakiEninGorevi {
    public static void main(String[] args) {

        /*
            try blogu icindeki kodlarda bir exception olusursa
            ve olusan exception catch blogunda yazan exception turu ile uyumlu ise
            olusan exception catch blogunda yakalanir
            ve hata e objesinde kaydedilir
            e ismi mecburi degildir, farkliisimler verilebilir ama genelde e kullanilir
            catch blogu icerisinde kendi istedigimiz bir kodu calistirabilecegimiz gibi
            e objesinde kaydedilmis olan bilgileride kullanabiliriz

         */

        int a =20;

        int b = 0;

        try {
            System.out.println(a/b);
        } catch (ArithmeticException e) {
            throw new RuntimeException(e);
        }


    }
}
