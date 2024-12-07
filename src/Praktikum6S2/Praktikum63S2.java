package Praktikum6S2;

import java.util.Scanner;

public class Praktikum63S2 {

    public static int cetakSegitiga(int tinggi, int baris, int kolom) {
        if (baris < tinggi) {
            if (kolom <= baris) {
                System.out.print("* ");
                return cetakSegitiga(tinggi, baris, kolom + 1);
            } else {
                System.out.println();
                return cetakSegitiga(tinggi, baris + 1, 0);
            }

        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan tinggi segitiga: ");
        int tinggi = scan.nextInt();
        cetakSegitiga(tinggi, 0, 0);
    }
}
