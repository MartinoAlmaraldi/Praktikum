package praktikum7;

import java.util.Scanner;

public class Praktikum71 {

    static void tambah(int jumlah) {
        System.out.println("Hasil pertambahan bilangan pertama dan kedua adalah: " + jumlah);
    }

    static void kurang(int kurang) {
        System.out.println("Hasil pengurangan bilangan pertama dan kedua adalah: " + kurang);
    }

    static void ganjilgenap(int ganjilgenap) {
        if (ganjilgenap % 2 == 0) {
            System.out.println(ganjilgenap + " merupakan bilangan genap");
        } else if (ganjilgenap % 2 != 0) {
            System.out.println(ganjilgenap + " merupakan bilangan ganjil");
        }
    }

    static void posNegNol(int apa) {
        if (apa > 0) {
            System.out.println(apa + " merupakan bilangan positif");
        } else if (apa < 0) {
            System.out.println(apa + " merupakan bilangan negatif");
        } else if (apa == 0) {
            System.out.println(apa + " merupakan bilangan nol");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlah, hasil;
        String ganjil, genap;
        boolean kondisi = true;

        do {
            System.out.println("Menu: ");
            System.out.println("1. Penambahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Apakah bilangan tersebut bernilai genap atau ganjil");
            System.out.println("4. Apakah bilangan tersebut bernilai positif, negatif, atau nol");
            System.out.println("5. Berhenti");

            System.out.print("Pilih menu: ");
            int menu = input.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Masukkan bilangan ke-1:");
                    int angka1 = input.nextInt();
                    System.out.println("Masukkan bilangan ke-2:");
                    int angka2 = input.nextInt();
                    hasil = angka1 + angka2;
                    tambah(hasil);
                    break;

                case 2:
                    System.out.println("Masukkan bilangan ke-1:");
                    angka1 = input.nextInt();
                    System.out.println("Masukkan bilangan ke-2:");
                    angka2 = input.nextInt();
                    hasil = angka1 - angka2;
                    kurang(hasil);
                    break;

                case 3:
                    System.out.println("Masukkan bilangan: ");
                    angka1 = input.nextInt();
                    ganjilgenap(angka1);
                    break;

                case 4:
                    System.out.println("Masukkan bilangan: ");
                    angka1 = input.nextInt();
                    posNegNol(angka1);
                    break;

            }
            if (menu > 4) {
                kondisi = false;
                System.out.println("Program berhenti");
            }
        } while (kondisi == true);

    }

}
