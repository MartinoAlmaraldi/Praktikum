package praktikum8;

import java.util.Scanner;

public class praktikum81 {

    public static String usia(String nama, int umur) {
        return "Umur " + nama + " adalah " + umur + " Tahun";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tahunLahir;
        System.out.print("Nama: ");
        String nama = input.nextLine();
        System.out.print("Tahun Lahir: ");
        tahunLahir = input.nextInt();
        int umur = 2023 - tahunLahir;
        System.out.println(usia(nama, umur));
    }

}
