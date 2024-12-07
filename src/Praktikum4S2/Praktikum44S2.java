package Praktikum4S2;

import java.util.Scanner;
import java.util.ArrayList;

public class Praktikum44S2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> namaKaryawan = new ArrayList<>();
        ArrayList<Character> golongan = new ArrayList<>();
        ArrayList<Integer> jam = new ArrayList<>();

        System.out.print("Jumlah karyawan: ");
        int karyawan = input.nextInt();
        int gaji;
        int i;
        for (i = 0; i < karyawan; i++) {
            System.out.print("Nama karyawan ke " + (i + 1) + " : ");
            input.nextLine();
            String nama = input.nextLine();
            namaKaryawan.add(nama);
            System.out.print("\tGolongan : ");;
            char gol = input.nextLine().charAt(0);
            golongan.add(gol);
            System.out.print("\tJam kerja: ");
            int jamKerja = input.nextInt();

            switch (gol) {
                case 'A':
                    gaji = 5000 * jamKerja;
                    jam.add(gaji);
                    break;

                case 'B':
                    gaji = 4000 * jamKerja;
                    jam.add(gaji);
                    break;

                case 'C':
                    gaji = 3000 * jamKerja;
                    jam.add(gaji);
                    break;

                case 'D':
                    gaji = 2000 * jamKerja;
                    jam.add(gaji);
                    break;

                case 'E':
                    gaji = 1000 * jamKerja;
                    jam.add(gaji);
                    break;

                default:
                    gaji = 0;
                    jam.add(gaji);
                    break;
            }

        }

        for (i = 0; i < namaKaryawan.size(); i++){
        System.out.println("Data karyawan: ");
        System.out.println("Nama: " + namaKaryawan.get(i));
        System.out.println("\tGolongan: " + golongan.get(i));
        System.out.println("\tGaji    : " + jam.get(i));
     }
    }
}
