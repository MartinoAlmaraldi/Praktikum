package Praktikum4S2;

import java.util.Scanner;
import java.util.ArrayList;

public class Praktikum42S2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Jumlah mahasiswa: ");
        int jumlahMhs = input.nextInt();
        String nama = null;
        Double matkul = 0.0, matkul2 = 0.0, matkul3 = 0.0, ratarata = 0.0;

        ArrayList<String> daftarMahasiswa = new ArrayList<>();
        ArrayList<Double> nilai = new ArrayList<>();
        ArrayList<Double> nilai2 = new ArrayList<>();
        ArrayList<Double> nilai3 = new ArrayList<>();
        ArrayList<Double> rata = new ArrayList<>();
        for (int i = 0; i < jumlahMhs; i++) {
            System.out.print("Nama mahasiswa " + (i + 1) + " : ");
            input.nextLine();
            nama = input.nextLine();
            daftarMahasiswa.add(nama);
       
            System.out.print("Nilai mata kuliah 1: ");
            matkul = input.nextDouble();
            nilai.add(matkul);
            System.out.print("Nilai mata kuliah 2: ");
            matkul2 = input.nextDouble();
            nilai2.add(matkul2);
            System.out.print("Nilai mata kuliah 3: ");
            matkul3 = input.nextDouble();
            nilai3.add(matkul3);
            ratarata = (matkul + matkul2 + matkul3) / 3;
            rata.add(ratarata);
            
            
        }
        System.out.println("|Nama\t|Matkul 1\t|Matkul 2\t |Matkul 3\t |Rata-rata");
        for (int i = 0; i < daftarMahasiswa.size(); i++) {
            System.out.println("|" + daftarMahasiswa.get(i) + "\t" + "|" + nilai.get(i) + "\t\t" + "|" + nilai2.get(i) + "\t\t" + "|" + nilai3.get(i) + "\t\t" + "|" + rata.get(i));
        }

    }
}
