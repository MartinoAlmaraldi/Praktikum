package praktikum7;

import java.util.Scanner;

public class Praktikum73 {

    public static void hasil(int berapa) {
        System.out.print(berapa + " ");
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int kelipatan, rentangAwal, batasAkhir;
        boolean kondisi = true;

        do {

            System.out.println("\nMenu: ");
            System.out.println("1. Menghitung kelipatan");
            System.out.println("2. Berhenti");
            System.out.println("Pilih menu: ");
            int menu = input.nextInt();

            switch (menu) {
                case 1:

                    System.out.println("Kelipatan yang diinginkan: ");
                    kelipatan = input.nextInt();
                    System.out.println("Masukkan angka awal: ");
                    rentangAwal = input.nextInt();
                    System.out.println("Batas angka akhir: ");
                    batasAkhir = input.nextInt();

                    for (int i = rentangAwal; i <= batasAkhir; i += kelipatan) {
                        hasil(i);
                    }
                    break;

            }
            if (menu > 1) {
                kondisi = false;
                System.out.println("Program berhenti");
            }

        } while (kondisi == true);
    }
}
