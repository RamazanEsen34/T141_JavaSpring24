package day39_inheritance_overriding;

public class C05_Child extends C04_Parent{
    public void method1(){

        // child class'da overriding method olusturmak icin
        // method ismi ve signature'i ayni olmalidir

    }

    public void method2(int sayi){

        // parent 'daki method2 ile signature'i ayni olmadigindan
        // overriding olmaz

    }

    @Override
    public int method3() {
        // overriding methodu intelije olusturdugumuzda
        // @Override notasyonu kullanilir
        // bu notasyonun gorevi parent class'daki overridden methodu takip edip
        // override etmeye mani olacak bir degisiklik olursa
        // CTE vermektir
        return 6;
    }

    public String method4(){

        // signature= method ismi + parametrelerin data turleri
        //access mödifier method signature'a dahil degildir
        // ama overriding icin access modifier da onemlidir

        // overriding'de child class'daki method'un acess modifier'i
        // parent class'dakinden daha kisitlayici olamaz

        return "Java";

    }

    private void method5(){
        // parent class'da olsa
        // private access modifieri olan class uyeleri
        // baska classlardan gorulemeyecegi icin
        // private methodlar edilemez
    }
    public static void method6(){
        // static methodlarda override edilemez
    }
    public int method8(){
        // return type da signature dahil degil dir
        // ama overridinde onemlidir
        // parent class'daki method'un retun type
        // primitive data turleri veya void ise
        // overriding method'un retun type'i ayni olmalidir

        return 6;
    }

    public String method9(){
        // eger return type non-primitive ise
        // child class'daki return type
        // ya parent class'daki return type ile ayni olmali
        // yada parent daki return type 'in child'i olabilir

        return "Java";
    }
}
