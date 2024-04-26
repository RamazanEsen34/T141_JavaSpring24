package day37_inheritance;

public class C04_Child extends C03_Parent{

    /*
        Child class da olusturulan her ogjenin
        parent class daki ozellikllere de sahip olabilmesi icin
        Java extends kullanan bir class daki ,
        her constructor'in ILK SATIRINDA constructor call olma mecburiyeti koymustur

        ilk satırda gorunur bir constructor call varsa
        Java o constructor call!a uygun olarak calisir
        Eger ilk satirinda GORUNUR bir constructor call yoksa
        Java default olarak  parametresiz super constructor call() koyar
     */

    C04_Child(){
        System.out.println("Child parametresiz cons.");
    }
    C04_Child(int a){
        System.out.println("Child int parametreli cons.");
    }
    C04_Child(String s){
        super(5);
        System.out.println("Child String parametreli cons");
    }
    C04_Child(String a, int b){
        super("Ali");
        System.out.println("Child 2 parametreli cons.");
    }
    C04_Child(double c){
        super(7.2);
        c=7;
        System.out.println(c);
    }


    public static void main(String[] args) {

        //C04_Child child1 = new C04_Child();

        //C04_Child child2 = new C04_Child(4);

        //C04_Child child3 = new C04_Child("ali");

        //C04_Child child4 = new C04_Child("a",1);

        C04_Child child5 = new C04_Child(1.1);

    }
}
