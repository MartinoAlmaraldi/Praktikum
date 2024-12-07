package Praktikum3S2;

import java.util.Scanner;

public class Praktikum31S2 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int total = 0, hasil = 0;
        System.out.print("Masukkan kelipatan: ");
        int kelipatan = input.nextInt();
        System.out.print("Masukkan panjang array: ");
        int panjang = input.nextInt();
        int[] arrkelipatan = new int[panjang];
        for (int i = 0; i < arrkelipatan.length; i++) {
            hasil = kelipatan * (i + 1);
            total += hasil;
            System.out.println("Kelipatan " + kelipatan + " ke-" + (i + 1) + ": " + hasil);
        }

        System.out.println("Jumlah isi array = " + total);
    }
}
