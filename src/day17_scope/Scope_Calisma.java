package day17_scope;

public class Scope_Calisma {

static  String hastaneIsmi ="YildizHastanesi";
static  String bashekimIsmi ="Dr Emrah";
static  String hastaneAdresi = "Cankaya";

String persIsmi;
String persAdrsi;
String pertel;





    public static void main(String[] args) {

        C04_StaticVariablesVsInstanceVariables pers1 = new C04_StaticVariablesVsInstanceVariables();

        System.out.println(pers1.perAdresi);

        pers1.persIsmi ="Ulvi";
        pers1.perAdresi ="Cankaya";
        pers1.perTel ="5552345672";

        System.out.println(pers1.perAdresi);
        System.out.println(pers1.persIsmi);
        System.out.println(pers1.perTel);

        C04_StaticVariablesVsInstanceVariables pers2 = new C04_StaticVariablesVsInstanceVariables();

        System.out.println(pers2.perTel);// null
        System.out.println(pers2.persIsmi);
        System.out.println(pers2.perAdresi);

        System.out.println((C04_StaticVariablesVsInstanceVariables.bashekimIsmi));
        C04_StaticVariablesVsInstanceVariables pers = new C04_StaticVariablesVsInstanceVariables();
        System.out.println(pers.perAdresi);

        System.out.println(pers.bashekimIsmi);


    }
        public static void  method1(){



        }
        public void method2(){



        }

    }

