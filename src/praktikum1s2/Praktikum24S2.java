package praktikum1s2;

import java.util.Scanner;

public class Praktikum24S2 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai awal: ");
        int awal = input.nextInt();
        System.out.println("Masukkan nilai akhir: ");
        int akhir = input.nextInt();

        int i = awal;
        while (i <= akhir) {
            if (i < 0) {
                System.out.print(i + " Negatif");
                if (i % 2 == 0) {
                    System.out.println(" Genap");
                } else {
                    System.out.println(" Ganjil");
                }
            } else if (i > 0) {
                if (i % 2 == 0) {
                    System.out.println(i + " Genap");
                } else {
                    System.out.println(i + " Ganjil");
                }
            } else if (i == 0) {
                System.out.println(i + " merupakan bilangan nol");

            }
            i++;
        }

    }
}
