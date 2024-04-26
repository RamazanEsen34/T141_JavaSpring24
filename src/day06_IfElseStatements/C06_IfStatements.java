package day06_IfElseStatements;

import java.util.Scanner;

public class C06_IfStatements {
    public static void main(String[] args) {

        // Kullanicidan bir ucgenin 3 kenar uzunlugunu alın
        // ucgen eskenar ise " Eskenar ucgen " yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen ucgenin kenar uzunluklarini giriniz :");

        int kenar1 = scanner.nextInt();
        int kenar2 = scanner.nextInt();
        int kenar3 = scanner.nextInt();

        if (kenar1==kenar2 && kenar1==kenar3 && kenar1>0 ){
            System.out.println("Eskenar Ucgen");
            // java da mantiksal karsilastirmalar ikili yapi olarak karşilastirilir
            // uc ve daha fazla karşilastirma icin && isareti ile ikili karsilastirma yapilir ve sonuc alinir
            // 0 rakami verildiginde Java onu rakam olarak algiladigi icin ucgen kabul eder
            // bunu engellemek icin && kenar1>0 yazdigimizda sorun cozulur
        }

    }
}
