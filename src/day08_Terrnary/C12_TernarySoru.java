package day08_Terrnary;

import java.util.Scanner;

public class C12_TernarySoru {
    public static void main(String[] args) {

        // kullanicidan notu alin
        // 50 veya daha buyukse "sinifi gectin",
        // 50 den kucukse "maalesef kaldin" yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz...");

        double not = scanner.nextDouble();

        System.out.println( not>= 50 ? "sinifi gectin" :"maalesef kaldi");
    }
}
