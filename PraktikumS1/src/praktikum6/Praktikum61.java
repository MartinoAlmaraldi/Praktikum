package praktikum6;

import java.util.Scanner;

public class Praktikum61 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu, count = 0, percobaan = 3;
        boolean kondisi = true;
        String nama = null, nim = null;
        String loginNama = null, loginNim = null;

        System.out.println("Menu:");
        System.out.println("1. Login");
        System.out.println("2. Daftar");
        System.out.print("Masukkan menu yang inginkan: ");
        menu = input.nextInt();

        if (menu < 3 && menu > 0) {
            if (menu == 2) {
                System.out.print("Masukkan nama lengkap : ");
                input.nextLine();
                nama = input.nextLine();
                System.out.print("Masukkan NIM: ");
                nim = input.nextLine();
                System.out.println("Anda berhasil mendaftar");
                System.out.println(" ");
            }
            do {
                if (menu == 1) {
                    System.out.println("Anda belum mendaftar");
                } else {
                    System.out.print("Masukkan nama anda: ");
                    loginNama = input.nextLine();
                    System.out.print("Masukkan NIM anda: ");
                    loginNim = input.nextLine();
                    kondisi = false;
                    if (loginNama.equals(nama) && loginNim.equals(nim)) {
                        System.out.println("Login berhasil!");
                    } else {
                        count++;
                        percobaan--;
                        if (percobaan == 0) {
                            System.out.println("Anda salah 3x, akun anda diblokir.");
                            System.exit(0);
                        } else {
                            System.out.println("Anda salah " + count + "x silahkan ulangi, " + "kesempatan login " + percobaan + "x lagi");
                        }
                        kondisi = true;
                    }
                }
            } while (kondisi == true);
        }
    }
}
