package Praktikum4S2;

import java.util.Scanner;
import java.util.ArrayList;

public class Praktikum41S2 {

    private static ArrayList<String> dataList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean cek = true;
        while (cek) {
            System.out.println("------------------------------------------------");
            System.out.print("1. Tampilkan Data\n2. Tambahkan data\n3. Edit data\n4. Hapus data\n5. keluar\nPilih Menu: ");
            int menu = input.nextInt();
            System.out.println("------------------------------------------------");
            switch (menu) {
                case 1:
                    tampilkanData();
                    break;

                case 2:
                    tambahkanData();
                    break;

                case 3:
                    editData();
                    break;

                case 4:
                    hapusData();
                    break;

                case 5:
                    cek = false;
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }

    private static void tampilkanData() {
        if (dataList.isEmpty()) {
            System.out.println("Data kosong.");
        } else {
            System.out.println("Data saat ini:");
            for (int i = 0; i < dataList.size(); i++) {
                System.out.println(dataList.get(i));
            }
        }
    }

    private static void tambahkanData() {
        Scanner input = new Scanner(System.in);
        System.out.println("Tambahkan data baru: ");
        String dataBaru = input.nextLine();
        dataList.add(dataBaru);
        System.out.println("Data berhasil ditambah");
    }

    private static void editData() {
        Scanner input = new Scanner(System.in);
        if (dataList.isEmpty()) {
            System.out.println("Data kosong, tidak ada data yang dapat diubah");
        } else {
            System.out.println("Masukkan index dari data yang ingin diubah: ");
            int index = input.nextInt();
            if (index >= 0 && index < dataList.size()) {
                System.out.println("Tambahkan data baru: ");
                input.nextLine();
                String dataBaru = input.nextLine();
                dataList.set(index, dataBaru);
                System.out.println("Data telah dirubah");
            } else {
                System.out.println("Invalid");
            }
        }
    }

    private static void hapusData() {
        Scanner input = new Scanner(System.in);
        if (dataList.isEmpty()) {
            System.out.println("Data kosong, tidak ada data yang dapat diubah");
        } else {
            System.out.println("Masukkan index dari data yang ingin dihapus: ");
            int index = input.nextInt();
            if (index >= 0 && index < dataList.size()) {
                dataList.remove(index);
                System.out.println("Data telah dihapus");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}
