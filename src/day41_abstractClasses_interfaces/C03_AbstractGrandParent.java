package day41_abstractClasses_interfaces;

public abstract class C03_AbstractGrandParent {
    // abstract methodlar SADECEabstract yapilar icinde bulunabilir
    // concrete classlarin icinde abstract method olmaz

    public abstract void method1();

    public abstract int method2();

    public void method3(){
        System.out.println("GP method3");

    }
    public int method4(){

        return 2;
    }
}
