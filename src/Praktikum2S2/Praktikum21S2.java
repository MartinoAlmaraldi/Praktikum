package Praktikum2S2;

import java.util.Scanner;

public class Praktikum21S2 {

    public static void KPK(int a, int b) {
        System.out.println("Hasil KPK dari " + a + " dan " + b + " adalah: ");
    }

    public static void FPB(int a, int b) {
        System.out.println("Hasil FPB dari " + a + " dan " + b + " adalah: ");
    }

    public static int hasilKPK(int a, int b) {
        int c = 0;

        for (int x = 1; x <= b; x++) {

            c = (c + a);

            if (c % b == 0) {

                System.out.println(c);

                break;
            }

        }
        return c;
    }

    public static int hasilFPB(int a, int b) {
        int d;
        d = a % b;

        while (d != 0) {
            a = b;
            b = d;
            d = a % b;
        }
        System.out.println(b);
        return b;
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int pertama, kedua;
        System.out.println("Kalkulator KPK dan FPB");
        System.out.println("Masukkan nilai pertama: ");
        pertama = input.nextInt();
        System.out.println("Masukkan nilai kedua: ");
        kedua = input.nextInt();

 
        KPK(pertama, kedua);
        hasilKPK(pertama, kedua);
        FPB(pertama, kedua);
        hasilFPB(pertama, kedua);

    }
}
