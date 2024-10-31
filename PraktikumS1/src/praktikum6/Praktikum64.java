package praktikum6;

import java.util.Scanner;

public class Praktikum64 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int i;
        String lanjut = null;
        int max = -99999, min = 99999, angka, nilai, rata = 0;

        do {
            System.out.println("Masukkan jumlah angka:");
            angka = input.nextInt();

            for (i = 1; i <= angka; i++) {
                System.out.println("Masukkan nilai ke- " + i + ": ");
                nilai = input.nextInt();
                if (nilai < min) {
                    min = nilai;
                }
                if (nilai > max) {
                    max = nilai;
                }
                rata += nilai/angka;
            }

            System.out.println("Lanjut?");
            input.nextLine();
            lanjut = input.nextLine();
            
            if (lanjut.equalsIgnoreCase("y")) {
                System.out.println("Menghitung kembali");
            } else if (lanjut.equalsIgnoreCase("n")) {
                System.out.println("Program berhenti");
                System.out.println("Nilai tertinggi: " + max);
                System.out.println("Nilai terendah : " + min);
                System.out.println("Nilai rata-rata: " + rata);
                String kondisi = max > rata ? "Benar":"Salah";
                System.out.println("Apakah nilai tertinggi lebih besar dari nilai rata-rata? " + kondisi);
            }

        } while (lanjut.equalsIgnoreCase("y"));

    }
}
