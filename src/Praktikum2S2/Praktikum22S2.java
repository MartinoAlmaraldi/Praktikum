package Praktikum2S2;

import java.util.Scanner;

public class Praktikum22S2 {

    public static void list() {
        System.out.println("Menu: ");
        System.out.println("1. Input Panjang ,Lebar ,dan Tinggi");
        System.out.println("2. Hitung luas permukaan dan volume balok");
        System.out.println("3. Hitung luas permukaan dan volume prisma segitiga");
        System.out.println("4. Hitung luas permukaan dan volume limas segiempat");
        System.out.println("5. Keluar");
        System.out.print("Pilih menu: ");
    }

    public static int permukaanBalok(int p, int l, int t) {
        int permukaanBalok = 2 * (p * l + p * t + l * t);
        return permukaanBalok;
    }

    public static int volumeBalok(int p, int l, int t) {
        int volumeBalok = p * l * t;
        return volumeBalok;
    }

    public static int permukaanPrismaSegitiga(int p, int l, int t) {
        int permukaanPrismaSegitiga = (2 * (l * t)) / 2 + (3 * (p * l));
        return permukaanPrismaSegitiga;
    }

    public static int volumePrismaSegitiga(int p, int l, int t) {
        int volumePrismaSegitiga = (5 * (p * l) * t) / 2 * t;
        return volumePrismaSegitiga;
    }

    public static int permukaanPrismaSegiempat(int p, int l, int t) {
        int permukaanPrismaSegiempat = (p * l) + 4 * (p * l * t) / 2;
        return permukaanPrismaSegiempat;
    }

    public static int volumePrismaSegiempat(int p, int l, int t) {
        int volumePrismaSegiempat = (p * l * t) / 3;
        return volumePrismaSegiempat;
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int menu, panjang = 0, lebar = 0, tinggi = 0, hasil;

        do {
            list();
            menu = input.nextInt();

            if (menu == 1) {
                System.out.println("Input Panjang: ");
                panjang = input.nextInt();
                System.out.println("Input Lebar: ");
                lebar = input.nextInt();
                System.out.println("Input Tinggi: ");
                tinggi = input.nextInt();

                if (panjang == 0 || lebar == 0 || tinggi == 0) {
                    System.out.println("Nilai tidak boleh 0");
                }
            }

            if (panjang != 0 || lebar != 0 || tinggi != 0) {

                if (menu == 2) {
                    System.out.println("Hitung luas permukaan dan volume balok dengan panjang = " + panjang + ", Lebar = " + lebar + ", Tinggi = " + tinggi);
                    System.out.print("Luas permukaan balok: ");
                    hasil = permukaanBalok(panjang, lebar, tinggi);
                    System.out.println(hasil);
                    System.out.print("Volume balok: ");
                    hasil = volumeBalok(panjang, lebar, tinggi);
                    System.out.println(hasil);
                }

                if (menu == 3) {
                    System.out.println("Hitung luas permukaan dan volume prisma segitiga dengan panjang = " + panjang + ", Lebar = " + lebar + ", Tinggi = " + tinggi);
                    System.out.print("Luas permukaan prisma segitiga: ");
                    hasil = permukaanPrismaSegitiga(panjang, lebar, tinggi);
                    System.out.println(hasil);
                    System.out.println("Volume Prisma Segitiga: ");
                    hasil = volumePrismaSegitiga(panjang, lebar, tinggi);
                    System.out.println(hasil);
                }

                if (menu == 4) {
                    System.out.println("Hitung luas permukaan dan volume prisma segiempat dengan panjang = " + panjang + ", Lebar = " + lebar + ", Tinggi = " + tinggi);
                    System.out.println("Luas permukaan prisma segiempat: ");
                    hasil = permukaanPrismaSegiempat(panjang, lebar, tinggi);
                    System.out.println(hasil);
                    System.out.println("Volume prisma segiempat: ");
                    hasil = volumePrismaSegiempat(panjang, lebar, tinggi);
                    System.out.println(hasil);
                }
            }

        } while (menu < 5);
    }
}
