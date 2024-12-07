package praktikum1s2;

import java.util.Scanner;

public class Praktikum1S2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("-Table Perkalian-");
        int nilai;
        boolean kondisi = true;

        do {
            System.out.print("Perkalian: ");
            nilai = input.nextInt();

            if (nilai > 0) {
                kondisi = false;

                System.out.println("");
                System.out.print("X\t|");
                for (int i = 1; i <= nilai; i++) {
                    System.out.print("\t" + i);
                }
                
                System.out.println("");
                System.out.print("--");
                for (int i = 0; i <= nilai; i++) {
                    System.out.print("--------");
                }
                System.out.println("");
                for (int i = 1; i <= nilai; i++) {
                    System.out.print(i + "\t|");
                    for (int j = 1; j <= nilai; j++) {
                        System.out.print("\t" + i * j);
                    }
                    System.out.println();
                }
            } else {
                System.out.println("Angka tidak bisa negatif, silahkan ulangi input");
            }
        } while (kondisi);
    }

}
